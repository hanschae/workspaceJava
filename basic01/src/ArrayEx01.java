import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);

		// ������ �迭�� ����
		String title[] = {"����","����","����","��������","����"};
		int score[] = new int[title.length]; // ����, ����, ����, ��������, ����

		
		for(int i=0; i<title.length; i++) { // 0,1,2,3,4
			System.out.print(title[i]+"����=");
			score[i] = scan.nextInt();
		}
		
		// ����
		int tot=0;
		for(int i=0; i<score.length; i++){
			tot += score[i];
		}
		
		// ���
		int ave = tot / title.length;
		
		System.out.println("����="+tot+"\n���="+ave);
	}
	
}

/*
	IfElseIfEx01�� ������ �迭�� Ǯ���
	
	������
	��������=80
	��������=90
	��������=80
	����=250
	���=83.3
*/