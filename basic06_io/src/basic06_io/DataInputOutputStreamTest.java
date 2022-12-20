package basic06_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamTest {

	public DataInputOutputStreamTest() {
		
	}
	public void start() {
		//���� ������������ ������ �а� ����
		try {
			int dataInt = 256328;
			double dataDouble = 352.365;
			boolean dataBoolean = true;
			char dataChar = 'Z';
			
			File f = new File("d://testFolder/data.txt");
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
			dos.write(dataInt); // 4byte
			dos.writeDouble(dataDouble); // 8byte
			dos.writeBoolean(dataBoolean); // 1byte
			dos.writeChar(dataChar); // 1,2byte
			dos.close();
			System.out.println("������������ ���� ���Ⱑ �Ϸ�Ǿ����ϴ�");
			
			// Data������ ����� ������ �о����
			DataInputStream dis = new DataInputStream(new FileInputStream(f));
			int readInt = dis.readInt();
			double readDouble = dis.readDouble();
			boolean readBoolean = dis.readBoolean();
			char readChar = dis.readChar();
			
			System.out.println("int->"+readInt);
			System.out.println("double->"+readDouble);
			System.out.println("boolean->"+readBoolean);
			System.out.println("char->"+readChar);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DataInputOutputStreamTest().start();

	}

}
