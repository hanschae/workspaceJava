package basic06_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		
	}
	public void start() {
		
		//input, output
		//input(byte), reader(����) ������ �о�´�
		try {
			//byte���� ���ڸ� �Է¹޴´�
			InputStream in = System.in;
			/* read()
			while(true) {
				int inData = in.read(); // -1 : �������� ������
				if(inData==-1) break;
				System.out.println((char)inData);
			}*/
			
			/* read(byte[] a) */
			byte data[] = new byte[10];
			int cnt = in.read(data);
			System.out.println("cnt->"+cnt);
			System.out.println("text->"+ new String(data,0,cnt-2));
			
		}catch(IOException ie) {
			System.out.println("�Է¿��� �߻���");
		}
				
		
		
		
		
	}
	public static void main(String[] args) {
		new InputStreamTest().start();

	}

}
