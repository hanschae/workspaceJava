import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ݾ��Է� = ");
		int money = scan.nextInt();
		
		if (money>=10000) {
			
			// int result = (money%10==0)? money : money-(money%10) ;
			// �ڵ��� �����Ѱ� �ְ�
			int result = money/10*10; // �������̹Ƿ� ������ �� �Ҽ��� �����
			
			System.out.println("��� = "+result);
		}

	}

}

/*
if�� ����ϱ�
�Է¹��� ���� 10000 �̻��϶��� �������ڸ����� 0���� �ٲ㼭 ����϶�.

����
�ݾ��Է� = 26315
��� = 26310

�ݾ��Է� = 568259
��� = 568250

*/
