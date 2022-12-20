import java.util.Scanner;

public class StandardWeightTeacherVer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. �⺻ ������ ���ϱ�
		System.out.print("����->");
		int age = scan.nextInt();
		System.out.print("����(1.��, 2.��)->");
		int gender = scan.nextInt();
		System.out.print("Ű(cm)->");
		double height = scan.nextDouble();
		System.out.print("������(kg)->");
		double weight = scan.nextDouble();
				
		// 2. ���
		// - ǥ��ü��
		double standardWeight = 0.0;
		
		if (age<=35 && gender==2) { // 35�� ���� ����
			standardWeight = (height-100) * 0.85;
		}else if (age>=36 && gender==1) { // 36�� �̻� ����
			standardWeight = (height-100) * 0.95;			
		}else {
			standardWeight = (height-100) * 0.9;
		}
		
		// - ǥ��ü������
		double standardIndex = (weight/standardWeight) * 100;
		
		String body="";
		if(standardIndex<86) {
			body = "������";
		}else if(standardIndex<96) {
			body = "���ݸ�����";
		}else if(standardIndex<116) {
			body = "ǥ����";
		}else if(standardIndex<126) {
			body = "���ݺ���";
		}else{
			body = "����";
		}
		
		// 3. ������
		System.out.println("ǥ��ü��="+standardWeight);
		System.out.printf("����� ǥ��ü�������� %f�� %s�Դϴ�.", standardIndex, body);
	}

}
