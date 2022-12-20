package Inheritance5;

public class Sample {

	public static void main(String[] args) {
		Ex02 o = new Ex02();
		Test02 i = new Test02();
		int n = 10;
		i.setX(n);
		o.setY(i);
		System.out.println(o.getY().getX());

	}

}
