package pac; // �ݵ�� ù��° ��ɾ�

public class Test {
	// ������� : public, protected, default, private
	int num = 250;
	public String name = "ȫ�浿";
	private String tel = "010-1234-5678";
	public Test() {
		System.out.println("Test()������ �޼ҵ�");
	}
	public void gugudan(int dan) {
		System.out.println("����ó->"+tel);
		for(int i=2; i<=9; i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
		output();
	}
	
	private void output() {
		System.out.println(name+","+tel);
	}
	
	
}
