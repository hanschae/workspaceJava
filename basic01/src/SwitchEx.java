import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// ����, ����, ���� �Է¹޾� ����,���,������ ���϶�.
		// ��, if����� switch������ �ۼ��϶�.
		
		Scanner scan = new Scanner(System.in);
		
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
	
		switch((int)(a/10)) {
		case 10 : case 9 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		default :
			grade = "F";
		}
		
		System.out.printf("����=%d�Դϴ�\n���=%.2f�Դϴ�\n����=%s�Դϴ�.", t, a, grade);				

	}

}
