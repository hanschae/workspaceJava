import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// ��ø for ��
		for(;;) {
			System.out.print("���� �Է��Ͽ��ֽʽÿ�(2~9)");
			int dan = scan.nextInt();
			
			if(dan>=2 && dan<=9) {
				for(int i=2 ; i<=9 ; i++) {
					int result = dan*i;
					System.out.println(dan + " * " + i + " = " + result);
				}	
			}else {
				System.out.println("���� �߸� �Է��Ͽ����ϴ�.");
			}
		}
	}
}

 /*
  	2~9���� ���� �Է��� ��� ���� �߸��Է��Ͽ��ٴ� �޼��� ���
  	
	����
	�� = 6
	6*2=12
	6*3-18
	:
	:
	6*9=54

 */