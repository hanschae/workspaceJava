
public class Variable02Char {

	public static void main(String[] args) {
		// char : 2byte
		
		char a = 'A';
		
		String grade = "A";
		// grade++; // ����
		
		char b = ' '; // Stringó�� ��''�� ���� ����
		
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		//         char(1byte)    int(4byte)
		a = (char)(     a      +      1     );
		System.out.println(a);
		int c =         a      +      1     ; // E
		System.out.println(c); // �ƽ�Ű�ڵ� E 69
	}

}
