
public class Overloading {

	public Overloading() {
		
	}
	// �����ε� : ���� Ŭ���� ������ ���� �޼ҵ���� ������ �����ϴ� ���� ���Ѵ�.
	//			�Ű������� ������ ���������� �޶���Ѵ�.
	// 1~100���� ��
	public void sum () {
		System.out.println("1~100������ ���� 5050");
	}
	// 1~?���� ��
	public void sum(int max) {
		int tot = 0;
		for (int i=1; i<=max; i++) {
			tot +=i;
		}
		System.out.println("1~"+max+"������ ���� "+tot);
	}
	// 1~?���� Ȧ����
	public void sum(int max, String msg) {
		int tot = 0;
		for (int i=1; i<=max; i+=2) {
			tot +=i;
		}
		System.out.println("1~"+max+"������ Ȧ�� ���� "+tot);
	}
	// 1~?���� ¦����
	public void sum(String msg, int max) {
		int tot = 0;
		for (int i=2; i<=max; i+=2) {
			tot +=i;
		}
		System.out.println("1~"+max+"������ ¦�� ���� "+tot);
	}
	
	
	
		//------------------------------
	
	
	
	public static void main(String[] args) {
		Overloading o = new Overloading ();
		
		o.sum(343);
		o.sum(100,""); // Ȧ���� ��
		
	}

}
