import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryTeacherVer {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random random = new Random ();
		// �ζǹ�ȣ ������
		do {
			System.out.print("���Ӽ�=");
			int cnt = scan.nextInt();
			
			for(int i=1;i<=cnt;i++) { // 1,2,3,...,cnt
				int lottery [] = new int [7]; // �ζǹ�ȣ+���ʽ���ȣ�� ���� ����
				
				for(int j=0;j<lottery.length;j++) { // 0,1,2,3,4,5,6
					//		 0
					lottery [j] = random.nextInt(45)+1 ; //��ȣ ���� 1~45 (45-1+1) +1
					
					// ���� ��ȣ ������ ������� ��ȣ�� ���� ������ ��ȣ�� �ߺ��˻�
					for (int c=0; c<j; c++) {
						if (lottery[j] == lottery[c]) {
							j--; // 1->0; 2->1;
							break;
							
						}						
					}
				}
				// ���� ���� (���ʽ��� ���� ����)
				
				Arrays.sort(lottery, 0, 6); // index�� 0���� 6���������� ����
				//System.out.println(Arrays.toString(lottery));
				System.out.println(i+" ���� = "+Arrays.toString(Arrays.copyOfRange(lottery, 0, 6))+" , bonus = "+lottery[6]);
				
			}
						
			System.out.println("����Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�)");
			int qna = scan.nextInt();
			
			if(qna!=1) break; // 1���� ���� ������ ���α׷��� �����Ѵ�
			
		}while(true);
		
	} // main

}
