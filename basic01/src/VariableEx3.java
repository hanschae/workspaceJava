import java.util.Scanner;

public class VariableEx3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("�޴�(1.�簢���� ����, 2.�簢���� �ѷ�)?");
		int menu = scan.nextInt();
		
		System.out.print("����(�غ�)=");
		int w = scan.nextInt();
		
		System.out.print("����(����)=");
		int h = scan.nextInt();
		
		int result = (menu == 1)? w*h : (w+h)*2 ;
		
		String label = (menu == 1)? "����" : "�ѷ�" ;
		
		System.out.println("�簢����" + label + " = " + result);
		
		
		
		
		
	}

}

/*
 �簢���� ���� = ���� * ����
 �簢���� �ѷ� = (����+����)*2



 ������
 �޴�(1.�簢���� ����, 2.�簢���� �ѷ�)?	1
 ����(�غ�)=6
 ����(����)=5
 �簢���� ���� = 30
 
 ----------------------------------------
 
 ������
 �޴�(1.�簢���� ����, 2.�簢���� �ѷ�)?	2
 ����(�غ�)=6
 ����(����)=5
 �簢���� �ѷ� = 22
 

*/
