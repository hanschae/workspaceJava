package inheritance;

// extends : Ŭ������ ��ӹ����� (1���� ��Ӱ���)
public class Sedan extends Car {
	 String color = "Red";
	public Sedan () {
		// ����Ŭ������ ������ �޼ҵ忡�� ����Ŭ������ ������ �޼ҵ带 ȣ���ϴ� ���
		// �ݵ�� ù��° ���๮���� ���
		super("Lightblue","���"); // this()
		System.out.println("Sedan() ������ �޼ҵ�");
	}
	public Sedan(String color) {
		// ��Ӱ����� this�� ���� Ŭ������ �켱���� ������,
		// ���� Ŭ������ ������� ���� Ŭ�������� ã�´�.
		// this.color = color;
		
		// ����Ŭ���� ����Ŭ������ ���� ��������� �����Ҷ�
		// ����Ŭ������ ��������� �����Ѵ�.
		super.color = color;
		System.out.println(this.color+","+super.color);

	}
	
	// override : ��Ӱ��迡�� ����Ŭ������ �޼ҵ带 ������
	public void speedUp() {
		speed += 10;
		if (speed>=200) speed=200;
	}
	
	// speedUp overloading
	public void speedUp (int lbl) {
		speed += lbl;
		if (speed>=200) speed=200;
	}
	
	
	
	// ------------------------------
	/*
	public static void main (String arg[]) {
		
		// ��Ӱ��迡�� ������ �޼ҵ�� ����Ŭ���� �����ڰ� ���� ����
		
		Sedan s = new Sedan(); 
		System.out.println("color="+s.color);
		s.speedUp();
		System.out.println("speed="+s.speed);
		// ------------------------------
		Sedan ss = new Sedan("Blue");
		System.out.println("Sedan.color="+ss.color);
		
	}
	*/
}
