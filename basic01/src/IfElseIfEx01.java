import java.util.Scanner;

public class IfElseIfEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. ����, ����, ��������
		int k, e, m, t;
		double a;
		String grade;
		
		System.out.print("��������=");
		k = scan.nextInt();
		System.out.print("��������=");
		e = scan.nextInt();
		System.out.print("��������=");
		m = scan.nextInt();
		
		t = k + e + m;
		a = (double) t / 3;
		
		if (a>=90) {
			grade = "A";			
		}else if (a>=80) {
			grade = "B";
		}else if (a>=70) {
			grade = "C";
		}else if (a>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
	
		System.out.println("����="+t);
		System.out.println("���="+a);
		// ����� �Ҽ����� 2�ڸ����� ����϶�.
		System.out.printf("���=%.2f\n", a); // �� �ڸ����� �������ص� ��
		System.out.println("����="+grade);
	}

}

/*  ����
	
	90~100 A
	80~89  B
	70~79  C
	60~69  D
	0~50   F
	
	������
	��������=80
	��������=90
	��������=80
	����=250
	���=83.3
	����=B

*/