package basic06_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public BufferedReaderTest() {
		
	}
	public void start() {
		try {
			// BufferedReader : ���ǿ� �Է¹��ڸ� �������� 1�پ� �о�� �� �ִ�.
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			// ���� �����Ͱ� ���� �� null�� �������ش�
			String str = br.readLine();
			System.out.println(str);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new BufferedReaderTest().start();

	}

}
