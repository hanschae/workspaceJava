
public class StaticTest {
	// static�� �������, �޼ҵ忡 ǥ���� �� �ִ�.
	// ������Ÿ�� ���ʿ� ����Ͽ��� �Ѵ�.
	// ��ü��.�������
	// Ŭ������.�������
	
	String name = "ȫ�浿";
	int age = 30;
	static String addr = "������";
	
	//����������� ���๮�� ǥ���� �� ����.
	//static�� �̿��ϸ� ��������� ���๮�� ����� �� �ִ�.
	//		  ���� Ŭ������ ��ü�� ������ �����ϴ��� �ѹ��� ����ȴ�.
	static {
		System.out.println("���๮");
		System.out.println("������� ���Ұ�");
		
		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	StaticTest(){
		System.out.println("�����ڸ޼ҵ�");
	}
	
	void setData(String name) {
		this.name = name;
	}
	//�޼ҵ忡 static
	//��ü�� �������� �ʰ� �ܺο��� Ŭ������.�޼ҵ������ ������ �����ϴ�
	static void setAddr(String addr) {
		StaticTest.addr = addr;
	}
}
