package module;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class EmpDataSet {
	// 사원정보를 저장할 컬렉션을 선언
	public static HashMap<Integer, EmpVO> empList = new HashMap<>();
	public EmpDataSet() {
		
	}
	
	public static void dataSet() {
		// 파일에 있는 Object를 구하여 HaspMap에 세팅
		try {
			File f = new File("d://testFolder","employee.txt");
			if(f.exists()) { // 파일이 있을경우
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				EmpDataSet.empList = (HashMap)ois.readObject(); // 초기사원목록
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
