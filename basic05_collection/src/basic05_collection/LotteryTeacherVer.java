package basic05_collection;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LotteryTeacherVer {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random random = new Random ();
		// �ζǹ�ȣ ������
		do {
			System.out.print("���Ӽ�=");
			int cnt = scan.nextInt();
			
			for(int i=1;i<=cnt;i++) { // 1,2,3,...,cnt
				TreeSet <Integer> lottery = new TreeSet<Integer>(); // ��ȣ 7���� ������ ��ü
				int lastNum = 0; // ���������� ������ ��ȣ ����ϱ� ���� ����
				while(lottery.size()<7) {
					lastNum = random.nextInt(45)+1;
					lottery.add(lastNum);
					
				}
				
				// ���������� ���� ��ȣ�� ���ʽ��� ����ϱ� ���� �÷��ǿ� �ִ� ������ ��ȣ�� �����.
				lottery.remove(lastNum);
				System.out.println(i+"����="+lottery.toString()+", bonus="+lastNum);

			}
						
			System.out.println("����Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�)");
			int qna = scan.nextInt();
			
			if(qna!=1) break; // 1���� ���� ������ ���α׷��� �����Ѵ�
			
		}while(true);
		
	} // main

}
