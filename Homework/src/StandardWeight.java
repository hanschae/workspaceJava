

import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int age, sex, height, weight ; //����, ����, Ű, ����ü��
				
		System.out.print("����=");
		age = scan.nextInt();
		System.out.print("����(1:����,2:����)=");
		sex = scan.nextInt();
		System.out.print("Ű=");
		height = scan.nextInt();
		System.out.print("����ü��=");
		weight = scan.nextInt();
		
		double sw = 0;//ǥ��ü��
		
		double maleSta = (age>=36)? (height-100)*0.95 : (height-100)*0.90;
		double femaleSta = (age>=36)? (height-100)*0.90 : (height-100)*0.85;
		
		switch (sex) {
		case 1:
			sw = maleSta;
			break;
		default :
			sw = femaleSta;
		}
		
		System.out.println("ǥ��ü��="+(int)sw);
		
		double index = (weight/sw)*100; //ǥ��ü������
		String body = ""; //�򰡱���
		
		if (index<86) {
			body = "������";
		}else if (index<96) {
			body = "���� ������";
		}else if (index<116) {
			body = "ǥ����";
		}else if (index<126) {
			body = "���� ����";
		}else {
			body = "����";
		}

		System.out.printf("����� ǥ��ü�������� %.14f���� %s�Դϴ�.", index, body);
			

	}

}

