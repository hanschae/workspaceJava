package innerClass;

public class MethodInnerClass {
	int age = 25;
	public MethodInnerClass() {
		
	}
	
	public void start() {
		String tel = "010-1234-5678";
		// ����Ŭ����
		class InnerTest{
			int num = 100;
			String name = "�������";
			InnerTest(){}
			InnerTest(int num, String name){
				this.num = num;
				this.name = name;
			}
			void print() {
				System.out.println(num + "->"+name);
				System.out.println("����="+age);
				System.out.println("����ó="+tel);
				
				// Ŭ������ ���ǵ� ������ ���� ���ٺҰ�
				// System.out.println("�ּ�="+addr); ����
				
				
			}
		} // ����Ŭ����
		String addr = "�������� ���ǵ���";
		
		InnerTest it = new InnerTest(500, "�̼���");
		it.print();
	}
	
	public static void main(String[] args) {
		MethodInnerClass mic = new MethodInnerClass();
		mic.start();
	}

}
