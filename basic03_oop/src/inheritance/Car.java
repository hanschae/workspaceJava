package inheritance;

// �ֻ��� Ŭ���� Object�� ���� �Ƚᵵ �ȴ�.
public class Car extends Object{
	int speed = 0;
	String color = "white";
	String brand = "�ҳ�Ÿ";
	
	public Car () {
		System.out.println("Car() �����ڸ޼ҵ�");
	}
	public Car (String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	public void speedUp () {
		speed ++;
		if (speed>=100) {
			speed = 100;
		}
	}
	public void speedDown() {
		speed--;
		if (speed<=0) {
			speed = 0;
		}
	}
	
	
	
	
	
}
