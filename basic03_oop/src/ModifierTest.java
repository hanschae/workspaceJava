import pac.Test;

public class ModifierTest {
	public static void main (String args[]) {
		// public > protected > default(����������) > private
		
		// public : ����
		// default : ���� ��Ű�� ���� �ִ� Ŭ�������� ������ ����Ѵ�
		
		Test t = new Test ();
		// num�� default�̹Ƿ� �ٸ� ��Ű���� Ŭ�������� ���ٺҰ�
		// System.out.println(t.num);
		System.out.println(t.name);
		
		t.gugudan(8);
		//System.out.println(t.tel);
		// t.output();
		
	}
}
