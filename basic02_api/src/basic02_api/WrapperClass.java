package basic02_api;

public class WrapperClass {

	public WrapperClass() {
		int i = 500;
		// Wrapper Ŭ��
		// Byte,  Short, Integer, Long
		// Float, Double
		// Character
		
		// i�� ��ü�� �����
		Integer intObj = Integer.valueOf(i); // new Integer(i); < ��Ҽ� = �������� �ʴ´�
		int x = intObj.intValue();
		
		System.out.println(intObj.MAX_VALUE); // Integer.BYTES
		System.out.println(intObj.MIN_VALUE);
		
		Integer intObj2 = i; // �⺻���������� ��üȭ��, ����ڽ�
		//  int   Integer
		int con = intObj; // �����ڽ�
		
		String data = "254";
		// ���ڿ��� ���ڷ� ����
		Integer y = new Integer(data);
		int z1 = Integer.parseInt(data);// int
		Integer z2 = Integer.valueOf(data);// Integer
		int z3 = Integer.valueOf(data); // Integer
		System.out.println(z1*2);
		System.out.println(z2*3);
	}

	public static void main(String[] args) {
		new WrapperClass();

	}

}
