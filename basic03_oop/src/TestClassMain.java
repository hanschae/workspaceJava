
public class TestClassMain {

	public static void main(String[] args) {
		ClassTest ct = new ClassTest();

		ClassTest ct2 = new ClassTest(5000);
	
		ClassTest ct3 = new ClassTest("ȫ�浿", 26);
	
		ClassTest ct4 = new ClassTest(99, "�̼���");
	
		//��ü���� �޼ҵ带 ȣ�� : ��ü��.�޼ҵ��
		ct.sum();
		System.out.println(ct2.total(50));
	
		//��ü���� ��������� �����ϰ� �ʹ�.
		// ��ü��.�������
		System.out.println("ct2.num->"+ct2.num);
		System.out.println("ct3.MAX->"+ct3.MAX); // Math.Pi
	
	
	
	}

}
