import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �� = ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i=1;;i++) {
			sum += i; // sum = sum + i;
			if (sum>=num) {
				System.out.printf("1~%d������ ���� %d\n", i, sum);
				break;
			}
			
		}
		
	}
	
}

/*
 
 ������
 ������ �� = 25326
 1~____������ ���� 25400
 
*/