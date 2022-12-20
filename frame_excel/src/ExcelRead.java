import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelRead {

	public ExcelRead() {
		
	}
	public void start() {
		try {
			
			File f = new File("D://testFolder", "member.xls");
			FileInputStream fis = new FileInputStream(f);
			
			// ���������� ��ü �����ϱ�
			POIFSFileSystem poi = new POIFSFileSystem(fis);
			
			// 1. workbook ���ϱ�
			HSSFWorkbook workbook = new HSSFWorkbook(poi);
			
			// ��Ʈ �� ���ϱ�
			int sheetCnt = workbook.getNumberOfSheets();
			System.out.println("��Ʈ��-> "+sheetCnt);
			
			// 2. ȸ����� ��Ʈ ��ü ������
			HSSFSheet sheet = workbook.getSheet("ȸ�����"); // == wprkbook.getSheetAt(0);
			
			// ���� �� ���ϱ�
			int rowCnt = sheet.getPhysicalNumberOfRows();
			System.out.println("���Ǽ�-> "+rowCnt);
			
			System.out.println("��ȣ\t�̸�\t����ó");
			
			for(int idx=1; idx<rowCnt; idx++) { // 1,2,3
				HSSFRow row = sheet.getRow(idx);
				
				// ���� �� ���ϱ�
				int cellCnt = row.getPhysicalNumberOfCells();
				
				for(int i=0; i<cellCnt; i++) { // 0,1,2
					HSSFCell cell = row.getCell(i);
					if(i==0) { // ��ȣ
						int num = (int)row.getCell(i).getNumericCellValue(); // ���� �о���� double
						System.out.print(num+"\t");
					}else { // �̸�, ��ȭ��ȣ
						String str = row.getCell(i).getStringCellValue(); // ���� �о���� String
						System.out.print(str+"\t");
					}
				}
				System.out.println();	
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ExcelRead().start();;

	}

}
