package basic02_api;

public class PrintfTest {

	public static void main(String[] args) {
		// ��½� ���ڿ� �Ǵ� ���ڸ� �ڸ����� �����Ͽ� ����� �� �ִ�.
		
		// InputStream Ŭ������ print(), println(), printf()
		
		// format �� f
		
		// ����� : \", \', \t:tap, \n:�ٹٲ�
		// ���� �̸��� ä�����Դϴ�.
		// ���� �̸��� "ä����"�Դϴ�.
		
		System.out.println("���� �̸���\n \"ä����\"�Դϴ�.");
		// \n ���� �ٹٲ�
		
		
		int a = 125;
		double b = 235.2356485;
		String name = "ȫ�浿";
		System.out.println(a);
		
		//               (pattern, ����);
		//decimal ������   ����:%d �Ǽ�:%f ���ڿ�:%s 1����:%c
		
		System.out.printf("a������ ���� %-10d�Դϴ�.\n",a); // printf���� �ٹٲ޾���
		System.out.printf("%10.3f\n", b); // �Ҽ��� ���� 10ĭ, �Ҽ��� �� 3�ڸ�
		System.out.printf("����\t�̸��� \"%5s\"�Դϴ�.", name ); // �̸����� 5ĭ
		System.out.printf("\n%5s", "ABC");
		System.out.printf("\n%4c", 'z');
		
		System.out.printf("\na=%5d, b=%7.2f, name=%s",a,b,name);
	}

}