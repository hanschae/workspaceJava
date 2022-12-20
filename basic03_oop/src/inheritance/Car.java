package inheritance;

// 최상위 클래스 Object는 굳이 안써도 된다.
public class Car extends Object{
	int speed = 0;
	String color = "white";
	String brand = "소나타";
	
	public Car () {
		System.out.println("Car() 생성자메소드");
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
