import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* �� ����
		System.out.print("������ ����=");
		int max = scan.nextInt();
		
		int sum = 0; // ������ ��
		int osum = 0; // Ȧ���� ��
		int esum = 0; // ¦���� ��
		
		for(int i=1; i<=max; i++) {
			sum += i;
		}
		
		for(int j=1; j<=max; j+=2) {
			osum += j;
		}
		
		for(int k=2; k<=max; k+=2) {
			esum += k;
		}
		
		System.out.printf("1~%d������ ���� %d\n", max, sum);
		System.out.printf("1~%d������ Ȧ���� ���� %d\n", max, osum);
		System.out.printf("1~%d������ ¦���� ���� %d\n", max, esum);
		*/
		
		// ����� ����
		System.out.print("������ ����=");
		int max = scan.nextInt();
		
		// ���� ���ؼ� ������ų ������
		int sum=0, oddSum=0, evenSum=0;
		
		for(int i=1; i<=max; i++) { // 1
			// sum = sum + i; // ==��ü�� sum+=i;
			if (i%2==0) { // ¦��
				evenSum +=i;
			}else { // Ȧ��
				oddSum += i;
			}
		}
		sum = evenSum + oddSum;

		System.out.println("1~"+max+"������ ���� "+sum);
		System.out.println("1~"+max+"������ Ȧ���� ���� "+oddSum);
		System.out.println("1~"+max+"������ ¦���� ���� "+evenSum);
	}
	
}

/*
	����
	������ ����=100
	1~100������ ����5050
	1~100������ Ȧ���� ���� 2500
	1~100������ ¦���� ���� 2550
*/