import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
			do {
				System.out.print("�ݾ�=");
				int money = scan.nextInt();
				
				// ȭ�� ���� ���
				int won = 50000;
				int next = 5; // ���� ȭ�� ���鶧 ��� �� ������

				while(money>0) { // �ݾ��� ���� ���������� �ݺ�
					int count = money / won; // ȭ���� ����
					if(count>0){ // ���
						System.out.print(won+"��="+count);
						String danwi = (won>=1000)?"��":"��";
						System.out.println(danwi);
					}
					// �����ݾ�
					money -= count*won; // money = money - count*won;
					// ����ȭ����� �����
					won = won / next; // 10000
					// ������ ���� ���� ���Ѵ�.
					if(next==5) next=2;
					else next=5;
				}
				
				System.out.print("����Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�)");
				
				if (scan.nextInt() !=1) break; //1 ���� ���� ���α׷� ����
			} while(true);
						
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
	} //main

}

// *For04�� while�� �����غ���

/*
ȭ��(����)�� ���ϱ�
50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1

����
�ݾ�=254535
50000��=5��
1000��=4��
500��=1��
10��=3��
5��=1��
�ݾ�=
:
:

*/