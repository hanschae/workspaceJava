package basic04_exception;

// ����Ŭ������ �����ϱ� ���ؼ��� Exception ��ӹ޾� ����� �ִ�
public class MyException extends Exception{

	public MyException() {
		// ����Ŭ������ Exception�� �����ڸ޼ҵ带 ȣ���Ͽ� ���� �޼����� �����Ѵ�
		super("1~100������ ���� ������ ������ϴ�.");
		
	}
	public MyException (String msg) {
		super(msg);
		
	}
}
