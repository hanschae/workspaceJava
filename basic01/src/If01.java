
public class If01 {

	public static void main(String[] args) {
		// ���ǹ� : if��
		/*
			if(���ǽ�){
				���๮;
				��¹�;
				����;
				��������;
			}
		*/
		
		int data = 110;
		// ���ǽ��� ���� ���϶� ���๮�� �����Ѵ�
		
		if(data>100) {
			int a = 50;
			int b = a * 12;
			System.out.println("b="+b);
		}
		System.out.println("data="+data);
		// System.out.println("a="+a); // a�� if���� ��������(field)�̱� ������ �����Ҽ� ����.
		System.out.println("end...");
	}

}
