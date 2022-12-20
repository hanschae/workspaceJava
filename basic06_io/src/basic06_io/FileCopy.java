package basic06_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public FileCopy() {
		
	}
	public void start() {
		// ���Ϻ���
		// D:\workspaceJava\basic01\src\GuGuDan.java
		// D:\testFolder\GuGuDan.java
		File orgFile = new File ("D://workspaceJava/basic01/src/GuGuDan.java");
		File tarFile = new File ("D:/testFolder/GuGuDan.java");
		try {
			// ����Ʈ �� ��ŭ �ѹ��� orgFile������ ������ �о� tarFile�� ���⸦ �Ѵ�
			FileInputStream fis = new FileInputStream(orgFile);
			FileOutputStream fos = new FileOutputStream(tarFile);
			
			// ������ ������ �о� ������ �迭
			byte[] sourceCode = new byte[(int) orgFile.length()];
			
			// �о�� ����Ʈ ���� �������ش�.
			int cnt = fis.read(sourceCode);
			
			// ����
			fos.write(sourceCode, 0, cnt);
			
			fis.close();
			fos.close();
			
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("������ �����ϴ� ->"+fnfe.getMessage());
		}catch(IOException ie) {
			System.out.println("����¿���->"+ie.getMessage());
		}
		System.out.println(orgFile.getPath()+"�� ������ "+tarFile.getPath()+"�� �����Ͽ����ϴ�");
	}
	public static void main(String[] args) {
		new FileCopy().start();

	}

}
