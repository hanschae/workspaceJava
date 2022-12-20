package basic06_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Calendar;

public class ObjectInputStreamTest {

	public ObjectInputStreamTest() {
		
	}
	public void start() {
		try {
			//���Ͽ� ����� ��ü �Է��ϱ�
			File file = new File("d://testFolder/object.txt");
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Calendar date = (Calendar)ois.readObject();
			
			MemberVO vo = (MemberVO)ois.readObject();
			
			System.out.println(date);
			System.out.println(vo.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ObjectInputStreamTest().start();

	}

}
