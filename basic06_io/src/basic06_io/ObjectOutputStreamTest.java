package basic06_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectOutputStreamTest {

	public ObjectOutputStreamTest() {
		
	}
	public void start() {
		// ��ü�� ���Ϸ� ����
		Calendar now = Calendar.getInstance();
		MemberVO vo = new MemberVO(1000, "ȫ�浿", "�ѹ���", "010-1234-5678");
		
		//�⵵ ����
		now.set(2000, 10, 15);
		vo.setUsername("�̼���");
		
		try {
			// ���Ϸ� ��ü ����
			File f = new File("d://testFolder/object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(now);
			oos.writeObject(vo);
			
			oos.close();
			fos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ObjectOutputStreamTest().start();

	}

}
