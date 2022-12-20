package innerClass;
// ����Ŭ������ Ŭ���� ���� Ŭ������ ���Ѵ�
// 1. Ŭ������ ��������� ����Ŭ���� �����
// 2. �޼ҵ峻�� ����Ŭ���� �����
// 3. �͸��� ����Ŭ���� ����� - �޼ҵ峻�� �����Ͽ��� �Ѵ�.

public class OuterClass {
	String name = "������";
	int age = 30;
	
	public OuterClass() {
		// �ܺ�Ŭ������ �������, �޼ҵ�� ����Ŭ�������� ������ �Ұ����ϰ�
		// ����Ŭ���������� �ܺ�Ŭ������ �������, �޼ҵ带 ������ �� �ִ�.
		// System.out.println(addr); ����
	}
	public void output() {
		System.out.println("�̸�="+name);
	}
	// ����Ŭ����
	class InnerClass {
		String addr = "������ ���ﵿ";
		InnerClass() {
			output();
			
		}
		void memberOutput() {
			System.out.println("�ּ�="+addr);
			System.out.println("�̸�="+name+", ���� ="+age);
		}
	}
	
	
	
	
	// -----------------------------
	
	public static void main(String[] args) {
		//����Ŭ������ ����ϱ� ���ؼ��� �ܺ�Ŭ������ ��ü �����Ǿ�� �Ѵ�
		OuterClass oc = new OuterClass ();
		OuterClass.InnerClass ic = oc.new InnerClass ();
		ic.memberOutput();
		// ����Ŭ���� ��ü���� �ܺ�Ŭ������ ����, �޼ҵ�� ȣ���� �� ����
		// ic.output();
		//oc.output();
		
		//2. ��ü�������
		OuterClass.InnerClass ic2 = new OuterClass().new InnerClass();
		ic2.memberOutput();
		
		// ic2.output(); ����
		
	}

}
