package module;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class EmpDataSet {
	// ��������� ������ �÷����� ����
	public static HashMap<Integer, EmpVO> empList = new HashMap<>();
	public EmpDataSet() {
		
	}
	
	public static void dataSet() {
		// ���Ͽ� �ִ� Object�� ���Ͽ� HaspMap�� ����
		try {
			File f = new File("d://testFolder","employee.txt");
			if(f.exists()) { // ������ �������
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				EmpDataSet.empList = (HashMap)ois.readObject(); // �ʱ������
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
