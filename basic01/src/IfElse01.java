import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
		// int a=50;
		// if(a>100) System.out.println(a);
		// ���๮�� ������ ��� �߰�ȣ ���� ����
		// ���๮�� ������ ��� ���� �ٿ� ���⵵ ����
		
		Scanner scan = new Scanner (System.in);
		
		// ����) ������ ���� 1~100 ���̸� ������ ���� ����ϰ�
		//		�׿��� ��(���(100�ʰ�),����) ����� ����� ����϶�.
		
		System.out.print("�����Է�=");
		int data = scan.nextInt();
		
		if (data>=1 && data<=100) {
			System.out.println("data-> "+data);
		}else { // 100���� Ŭ��, 1���� ������
			// ������ ���� ���, ��ȣ�� ����� �����ϴ� ��
			/*
			if (data<0) {
			 data = -data;
			}
			*/
			data = Math.abs(data); // ���밪 ���ϱ�
			
			System.out.println("data(else)->"+data);
		}

	}

}

/*

 if(���ǹ�){
 	//���ǹ��� ���϶� ���๮;
 	;
 	;
 	
 }else{
 	//���ǹ��� �����϶� ���๮;
 	;
 	;
 
 }

 */