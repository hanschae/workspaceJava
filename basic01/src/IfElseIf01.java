import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Է�=");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("�Է��� ���� ����Դϴ�.");
		}else if(num<0) {
			System.out.println("�Է��� ���� �����Դϴ�.");
		}else{
			System.out.println("�Է��� ���� 0 �Դϴ�.");
		}
		
	}

}
