import java.util.Scanner;

public class VariableEx {

	public static void main(String[] args) {
		// �ٱ��Ͽ� ����� ���� ��� �ѹٱ��Ͽ��� ����� 10���� ���� �� �ִ�.
		// ����� 31���� �� �ٱ��� ���� ���϶�.
		
		/*
		int apple = 31;
		
		int basket = (apple % 10 == 0) ? apple/10 : apple/10 + 1;
		System.out.println(basket);
		
		 * �ٸ����
		int basketSize = 10; // int b = c = 5 �̷� ��ĵ� ����
		int apple = 31;
		
		int basket = (apple%basketSize==0) ? apple/basketSize : apple/basketSize+1 ;
		System.out.println("�ٱ��ϼ� : " + basket);
		*/
		
		//����� ������ �ٱ��� ũ�⸦ �Է¹޾ƶ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ٱ��Ͽ뷮=");
		int basketSize = scan.nextInt();
		System.out.print("�������=");
		int apple = scan.nextInt();
		
		int basket = (apple%basketSize==0) ? apple/basketSize : apple/basketSize+1 ;
		System.out.println("�ٱ��ϼ� : " + basket);
	}

}
