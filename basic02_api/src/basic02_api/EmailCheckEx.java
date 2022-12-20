package basic02_api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailCheckEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		do {
			System.out.print("�̸���=");
			String email = scan.nextLine();
			
			// @�ʿ�, .�ʿ�, @. �Ұ�
			int atMark = email.indexOf("@");
			int point = email.indexOf(".");
			
			if (atMark<3 || point<atMark || Math.abs(atMark-point)<=2) { // �߸��� �̸��� ã��
				System.out.println(email+"�� �߸��� �����Դϴ�.");
			}else{ // ���� �̸���
				// split(), substring(), StringTokenizer
				// split
				/*
				String emailSplit [] = email.split("@");
				System.out.println("���̵�="+emailSplit[0]);
				System.out.println("������="+emailSplit[1]);
				*/
				
				// substring()
				/*
				String id = email.substring(0, atMark);
				String domain = email.substring(atMark+1);
				System.out.println("���̵�="+id);
				System.out.println("������="+domain);
				*/
				
				// StringTokenizer
				StringTokenizer emailobj = new StringTokenizer(email, "@");
				String id = emailobj.nextToken();
				String domain = emailobj.nextToken();
				System.out.println("���̵�="+id);
				System.out.println("������="+domain);
			}
			System.out.println("����Ͻðڽ��ϱ�? (Y,N)");
			if(!scan.nextLine().equalsIgnoreCase("Y")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
		}while(true);
		
	}

}

/*

	����
	
	�̸���=legochj@naver.com
	���̵�=legochj
	������=naver.com
	�ٽ��Ͻðڽ��ϱ�?(Y,N)
	
	�̸���=addd.@com
	�߸��� �̸����ּ��Դϴ�.
	�ٽ��Ͻðڽ��ϱ�?(Y,N)


*/