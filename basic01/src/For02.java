import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����=");
		int max = s.nextInt();
		int sum = 0;
		
		for(int i=1; i<=max ; i++) { // 1,2,3,4,5,6,7,....,max
			// i�� ���� ������Ų��
			sum=sum + i; // sum += i;
			
		}
		System.out.printf("1~%d������ ���� %d�Դϴ�.\n", max , sum);
	}

}
