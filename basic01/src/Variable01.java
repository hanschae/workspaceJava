
public class Variable01 {
	// ������� = �������� (�޼ҵ� �� ����)
	public static void main(String[] args) {
		// �������� (�޼ҵ� �� ����)
		/* 
		   ���� ������Ģ
			1. �ҹ���, _, $ �� �����Ѵ�.
			2. �� ��ҹ���, _, $, ���ڸ� ����Ѵ�. (Ư������ ���Ұ�)
			3. �ռ����� ��� �ι�° �ܾ���� ù��° ���ڴ� �빮�ڷ� �Ѵ�.
			 ex) muticampusKorea
			4. ������ ���̴� 256���ڱ��� ����Ѵ�.
		*/
		
		byte kor = 80;
		int eng = 90;
		short mat = 75;
		
		// type casting : ����ȯ
		short total = (short)(kor + eng + mat);
	
		System.out.println("����������"+kor); // ���ڿ��� � ���������� ���ϵ� ���ڿ��� �ȴ�.
		System.out.println("����������"+eng);
		System.out.println("����������"+mat);
		
		System.out.println("������"+total);
	}

}
