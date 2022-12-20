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
			
			// 엑셀파일을 객체 생성하기
			POIFSFileSystem poi = new POIFSFileSystem(fis);
			
			// 1. workbook 구하기
			HSSFWorkbook workbook = new HSSFWorkbook(poi);
			
			// 시트 수 구하기
			int sheetCnt = workbook.getNumberOfSheets();
			System.out.println("시트수-> "+sheetCnt);
			
			// 2. 회원목록 시트 객체 얻어오기
			HSSFSheet sheet = workbook.getSheet("회원목록"); // == wprkbook.getSheetAt(0);
			
			// 행의 수 구하기
			int rowCnt = sheet.getPhysicalNumberOfRows();
			System.out.println("행의수-> "+rowCnt);
			
			System.out.println("번호\t이름\t연락처");
			
			for(int idx=1; idx<rowCnt; idx++) { // 1,2,3
				HSSFRow row = sheet.getRow(idx);
				
				// 셀의 수 구하기
				int cellCnt = row.getPhysicalNumberOfCells();
				
				for(int i=0; i<cellCnt; i++) { // 0,1,2
					HSSFCell cell = row.getCell(i);
					if(i==0) { // 번호
						int num = (int)row.getCell(i).getNumericCellValue(); // 숫자 읽어오기 double
						System.out.print(num+"\t");
					}else { // 이름, 전화번호
						String str = row.getCell(i).getStringCellValue(); // 문자 읽어오기 String
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
