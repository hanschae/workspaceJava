package module;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class LibDataSet {
	public static HashMap<Integer, LibVO> bookList = new HashMap<>();

	public LibDataSet() {
		
	}

	public static void dataSet() {
		try {
			File f = new File("d://testFolder/librarian","librarian.txt");
			if(f.exists()) {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				LibDataSet.bookList = (HashMap)ois.readObject();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
