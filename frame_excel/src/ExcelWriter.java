import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*
  	Excel�� ������ �б⾲�⸦ �ϱ����ؼ��� framework�� �ʿ��ϴ�
  	
  	POI �ٿ�ε�
  		jakarta.apache.org���� ����ī�װ��� POI / download / Binary Distribution �Ʒ� poi-bin-5.22-20220312.zip / http��ũ
  		
  	Build Path -> ������Ʈ���� ���콺 ��Ŭ��
  		poi-5.2.2.jar
  		commons-math3-3.6.1.jar
  		commons-io-2.11.0.jar
  		log4j.-api-2.17.2.jar
  		
  	Logging �ٿ�ε�
  		jakarta.apache.org���� logging / apache-log4j / ���� Download / apache-log4j-2.17.2-bin.zip / http ��ũ
 */

public class ExcelWriter {

	public ExcelWriter() {
		// ������ ����
		// 1. workbook ����
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		// 2. sheet ����
		HSSFSheet sheet1 = workbook.createSheet("ȸ�����");
		HSSFSheet sheet2 = workbook.createSheet();
		
		// 3. row ����
		HSSFRow row0 = sheet1.createRow(0); // 0�� ����
		
		// 4. cell ���� �� �� ����
		HSSFCell cell0 = row0.createCell(0);
		cell0.setCellValue("��ȣ");
		
		row0.createCell(1).setCellValue("�̸�"); // �������� �ٷ� ����
		row0.createCell(2).setCellValue("����ó");
		
		HSSFRow row1 = sheet1.createRow(1);
		row1.createCell(0).setCellValue(1);
		row1.createCell(1).setCellValue("ȫ�浿");
		row1.createCell(2).setCellValue("010-1234-5678");
		
		HSSFRow row2 = sheet1.createRow(2);
		row2.createCell(0).setCellValue(2);
		row2.createCell(1).setCellValue("�̼���");
		row2.createCell(2).setCellValue("010-5678-9012");
		
		HSSFRow row3 = sheet1.createRow(3);
		row3.createCell(0).setCellValue(3);
		row3.createCell(1).setCellValue("�������");
		row3.createCell(2).setCellValue("010-3456-7890");
		
		// ���Ϸ� ����
		try {
			File f = new File("D://testFolder/member.xls");
			FileOutputStream fos = new FileOutputStream(f);
			workbook.write(fos);
		}catch(FileNotFoundException fe) {
			System.out.println("������ ������->"+fe.getMessage());
		}catch(IOException ie) {
			System.out.println("����¿���->"+ie.getMessage());
		}
		System.out.println("excel write�Ϸ�");
	}

	public static void main(String[] args) {
		new ExcelWriter();

	}

}
