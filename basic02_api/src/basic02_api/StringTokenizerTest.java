package basic02_api;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// StringTokenizer : ���ڿ� ��������
		String colorName = "Red,Blue-Green/Cyan,,?,.,Yellow,Brown";
		
		StringTokenizer st = new StringTokenizer(colorName, ",./-?");
		
		System.out.println("tokencounts->"+ st.countTokens());
		
		while(st.hasMoreElements()) { // true: ��ū�� �ִ� false: ��ū�� ����
			System.out.println(st.nextElement());
		}
		
	}

}