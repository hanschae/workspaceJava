import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryOOPMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		LotteryOOP oop = new LotteryOOP ();
		
		do {
			// ���Ӽ� �Է�
			int game = oop.inData("");
			
			for(int i=1;i<=game;i++) {
			int lottery [] = new int [7]; 
			
				for(int j=0;j<lottery.length;j++) {
					lottery [j] = random.nextInt(45)+1 ;
					
					for (int c=0; c<j; c++) {
						if (lottery[j] == lottery[c]) {
							j--;
							break;
						}						
					}
				}
				
				Arrays.sort(lottery, 0, 6);
				System.out.println(i+" ���� = "+Arrays.toString(Arrays.copyOfRange(lottery, 0, 6))+" , bonus = "+lottery[6]);
			}
			// �亯 �Է�
			int qna = oop.inData2("");
			if(qna!=1) break;
			
		}while(true);
		
	} // main

}
