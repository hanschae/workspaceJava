import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class LotteryOOP {

	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	int lottery [] = new int [7]; 
	
	// �Ű������� ���� ������ �޼ҵ�
	LotteryOOP() {
		
	}
	
	// ���Ӽ� �Է�
	int inData(String msg) {
		System.out.print(msg + "���� �� =");
		return scan.nextInt();
	}
		
	// �亯 �Է�
	int inData2(String msg) {
		System.out.println("����Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�)");
		return scan.nextInt();
	}
	
} // class

