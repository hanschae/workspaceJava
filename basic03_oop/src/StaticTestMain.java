
public class StaticTestMain {

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		st.name = "�̼���";
		
		System.out.println("st.name->"+st.name);
		System.out.println("st2.name->"+st2.name);
		
		//static������ ������
		st.addr = "���ı�";
		System.out.println("st.addr->"+ st.addr);
		System.out.println("st2.addr->"+ st2.addr);
		
		//static ��������� ��ü�� �������� �ʰ� ����� �� �ִ�.
		//				   Math.PI	-> public static final double PI = 3.141592...
		System.out.println(StaticTest.addr);
		
		st2.setData("�������"); // ��ü��.�޼ҵ�
		StaticTest.setAddr("���α�"); // Ŭ������.�޼ҵ�		static������ ����
		System.out.println(StaticTest.addr);
	}

}
