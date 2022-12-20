package basic02_api;

public class MathTest {

	public static void main(String[] args) {
		
		// abs ����
		System.out.println("abs->"+Math.abs(-9.36));
		
		// ceil �ø�
		System.out.println("ceil->"+Math.ceil(41.21));
		
		// floor ����
		System.out.println("floor->"+Math.floor(147.9));
		
		// round �ݿø�
		System.out.println("round->"+Math.round(14.49));
		
		// max min �� �� ū/���� ��
		
		int first = 300;
		int second = 400;
		if (first > second) {
			System.out.println(first);
		}else { // second
			System.out.println(second);
		}
		
		System.out.println("max->"+Math.max(first, second));
		System.out.println("min->"+Math.min(first, second));
		
		// pow �ŵ�����
		System.out.println("pow->"+(int)Math.pow(5, 3));
		// ����ȯ (int)�� �ٿ� �Ǽ����� ����������
		
		// sqrt ��Ʈ ���ϱ�
		System.out.println("sqrt->"+Math.sqrt(9));
		
		// random ���������� ����
		System.out.println("random->"+((int)(Math.random()*6)+1));
		// random �� ������ 0.00...01 ~ 0.99...99
		// 10�� ���ϸ� ������ 0~9   45�� ���ϸ� 0~44
		// �ֻ��� ���ڸ� ���ϰ� ������ 6 > 0~5 �� +1
	}

}
