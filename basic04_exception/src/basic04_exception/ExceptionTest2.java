package basic04_exception;

import java.util.Scanner;

public class ExceptionTest2 {
	Scanner scan = new Scanner (System.in);
	public ExceptionTest2() {
		start();
	}
	public void start() {
		try {
			System.out.print("ù��°����=");
			int first = scan.nextInt(); //InputMismatchException
			System.out.print("�ι�°����=");
			int second = scan.nextInt(); //InputMismatchException
			
			System.out.printf("first=%d, second=%d\n", first, second);
			
			int result = first / second; // ����� 0���� ���� �� ���� 	ArithmeticException
			System.out.println(first+"/"+second+"="+result);
			
			int data[] = {7,9,2,4,8,5};
			for(int i=0; i<=data.length; i++) {
				System.out.println("data["+i+"]="+data[i]); //ArrayIndexOutOfBoundsException
			}
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("�迭�� �ε����� �߸�����Ͽ����ϴ�.");
		}catch(Exception e) { // Exception�� catch�� ���� �Ʒ��� ����
			System.out.println("���ڸ� �ٽ� �Է��ϼ���.");			
		}finally {
			
		}
	}
	public static void main(String[] args) {
		new ExceptionTest2 ();
	}

}
