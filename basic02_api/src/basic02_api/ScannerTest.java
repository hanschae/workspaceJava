package basic02_api;

// �����Ϸ��� java.lang ��Ű���� Ŭ������ import�� �ڵ����� �߰����ش�.
import java.lang.System;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// ������ �ֿܼ��� �����͸� �Է¹޾� ó���Ѵ�.
		// ����, �Ǽ�, ��, ���ڿ�		1	"1"
		
		// new : ��ü����(Ŭ������ �̿��Ͽ�)
		
		Scanner scan = new Scanner (System.in);

		// ���� : nextInt(), �Ǽ� : nextDouble(), ���ڿ� : nextLine()
		
		System.out.print("�̸�=");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.print("��������=");
		int kor = scan.nextInt();
		System.out.println("kor="+(kor/2));
		
		System.out.print("����(�Ǽ�)=");
		double math = scan.nextDouble(); // 95.23
		System.out.println("math="+(math+100));
	}

}
