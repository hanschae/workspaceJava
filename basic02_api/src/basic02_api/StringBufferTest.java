package basic02_api;

public class StringBufferTest {

	public static void main(String[] args) {
		// String : ������ ���� ������ ������(����ȭ)����
		// StringBuffer : ������ ���� �����尡��
		// StringBuilder : ������ ���� ����ȭ�� ������� ������
		
		//StringBuffer sb = new StringBuffer(30);
		//									012345678901234567890123
		StringBuffer sb = new StringBuffer("JAVA Programming Test...");
		sb.append("�ߵǳ�?"); // �������� �߰�, sb = sb.append("�ߵǳ�?"); a = a + "ddd";
		sb.insert(4, "(�ڹ�)"); // index 4 �տ� (�ڹ�) ����
		
		// 01234567890
		// JAVA(�ڹ�) Programming Test...�ߵǳ�?
		// JAVA(rogramming Test...�ߵǳ�?
		sb.delete(5, 10); //���ڿ� ����� 5���� 10�ձ���
		System.out.println(sb);
				
		// sb.reverse(); // �Ųٷ� ������
		// System.out.println(sb);

		// Ȯ���� �޸� Ȯ��	
		System.out.println("capacity->"+sb.capacity());
		
		StringBuffer first = new StringBuffer("Java");
		StringBuffer second = new StringBuffer("JAVA");
		
		// equals();
		// compareTo() : ���ڿ� ���ڸ� ���Ͽ� ������ �������ش�
		//			 "A"			  "B"		  "A"	-  "B"
		int result = first.compareTo(second); // "Java" - "JAVA"
		//			   "B"			    "A"		  "B"	-  "A"
		int result2 = second.compareTo(first);// "JAVA" - "Java"
		// ù���ڴ� ����, a=97, A=65, 97-65=32, ������ �������⿡ �ڿ��ִ� v�� a�� �Ű澲������
		System.out.println("result->"+result+", result2->"+result2);
		
		// 0 : �� ��ü�� �����ʹ� ����
		// ��� : ���ʰ�ü�� �����Ͱ� ũ��
		// ���� : ���ʰ�ü�� �����Ͱ� �۴�		
	}

}
