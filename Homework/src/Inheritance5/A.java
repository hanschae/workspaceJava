package Inheritance5;

public class A {
	public void test() {
	}
	public String test(String x) { //test()로 할 시 오류
		return "a";
	}
	public double test(int x) {
		return 1.0;
	}
	
	public static void main (String[] a) {
		A t = new A ();
		System.out.println(t.test(25));
	}
}