import java.util.Scanner;

public class VariableEx2 {

	public static void main(String[] args) {
		/*
		  ������ ������ �Է¹޾� 1~100 ������ ���̸�
		  �Է¹��� ���� 100�� ���Ͽ� ����ϰ�
		  �� ���� ���� 0�� ����϶�.
		 
			����Ǯ��
			
			Scanner scan = new Scanner (System.in);
			
			System.out.print("������ �Է��Ͻÿ� : ");
			int num = scan.nextInt();
			
			int result = (num>=1 && num<=100)? num*100 : 0;
			
			System.out.println("����� = "+ result);
		*/

		
		Scanner s = new Scanner(System.in);
		// ������
		int num = s.nextInt();
		// ���
		num = (num>=1 && num<=100)? num*100 : 0 ;
		// ���
		System.out.println(num);
	
		
	}

}
