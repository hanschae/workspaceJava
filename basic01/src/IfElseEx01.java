import java.util.Scanner;

public class IfElseEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// 1. �޴��Է�
		System.out.print("���ϴ� �޴�����(1.�簢���� ����, 2.���� ����)?");
		int menu = scan.nextInt();
		
		if(menu==1) {
			
			System.out.print("�غ�=");
			int w = scan.nextInt();
			System.out.print("����=");
			int h = scan.nextInt();
			
			int rectResult = w*h;
			System.out.println("�簢���� ����="+rectResult);
			
		}else if(menu==2) {
			System.out.print("������=");
			int r = scan.nextInt();
			
			double radiusResult = r*r*Math.PI;
			System.out.println("���� ����="+radiusResult);
		
		}else{
			System.out.println("�޴��� �߸������Ͽ����ϴ�.");
		}
		
		System.out.println("Math.PI->"+Math.PI);
	}

}

/* ����
	
	������
	���ϴ� �޴����� (1.�簢���� ����, 2.���� ����) ? 1
	�غ�=5
	����=6
	�簢���� ����=30
	
	���ϴ� �޴����� (1.�簢���� ����, 2.���� ����) ? 2
	������=5
	���� ����=

*/