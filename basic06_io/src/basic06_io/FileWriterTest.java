package basic06_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterTest {

	public FileWriterTest() {
		
	}
	public void start() {
		//�ֿܼ��� ���ڿ��� �ٴ����� �Է¹޾� ���Ϸ� ����
		try {
			// BufferedReader
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�����Է�");
			String inData = br.readLine();
			
			File file = new File("d://testFolder", "outputTest.java");
			FileWriter fw = new FileWriter(file);
			
			fw.write(inData, 0, inData.length());
			
			fw.close();
			
		}catch(Exception e){
			System.out.println("���ܹ߻�");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�");
		
		
	}
	public static void main(String[] args) {
		new FileWriterTest().start();
	}

}
