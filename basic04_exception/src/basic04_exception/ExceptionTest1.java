package basic04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
	public ExceptionTest1() {
		
	}
	public void start() {
		Scanner scan = new Scanner (System.in);
		
		try { // ���ܰ� �߻������� �ڵ� + ���� �߻����ɼ��� ���� �ڵ�
			System.out.print("ù��°����=");
			int first = scan.nextInt(); //InputMismatchException
			System.out.print("�ι�°����=");
			int second = scan.nextInt();
			
			System.out.printf("first=%d, second=%d\n", first, second);
			
			int result = first / second; // ����� 0���� ���� �� ����
			System.out.println(first+"/"+second+"="+result);
			
			int data[] = {7,9,2,4,8,5};
			for(int i=0; i<data.length; i++) { // i<=data.length �ÿ��� 0,1,2,3,4,5,6 �׸��� aiob ����
				System.out.println("data["+i+"]="+data[i]);
			}
			
		}catch(InputMismatchException ime) { // ���ܹ߻��� ó���ϴ� �κ�
			System.out.println("������ �Է��ϼž� �մϴ�.");
			// ime���� �߻��� ���� ��ü�� ����ִ�
			
			System.out.println(ime.getMessage()); // null
			ime.printStackTrace(); // printStackTrace �ȿ� Sysout�� �ִ�
			
		}catch(ArithmeticException ae) {
			System.out.println("second������ ���� 0���� �Է�������");
			System.out.println(ae.getMessage()); // / by zero
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("�迭 index�� �߸��Ǿ����ϴ�.");
			System.out.println(aiob.getMessage()); 
		}finally { //���ܰ� �߻��ϵ� ���ϵ� ������ �����
			System.out.println("finally�� ������ �����");
		}
		
				
		System.out.println("End...");
	}
	public static void main(String[] args) {
		new ExceptionTest1().start();

	}

}
/*
	try{
		���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
		
	}catch(��������){
		���ܰ� �߻������� ó���ϴ� ��
	}
	-->



*/