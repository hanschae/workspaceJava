package inheritance;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		double n = 5.25;
		int i = (int)n;
		
		Sedan s = new Sedan ();
		Car c= new Car ();
		Car cc = new Sedan ();
		// Sedan ss = new Car (); ����
		Object obj = new Sedan ();
		
		// ����Ŭ������ �������̵��� ����Ŭ������ ����ȯ �Ǿ ����Ŭ������ �޼ҵ� ����� �����ȴ�.
		
		cc.speedUp ();
		System.out.println("cc.speed ="+cc.speed);
		
		// cc.speed(20); ����
		
		Sedan sss = (Sedan)cc;
		sss.speedUp(30);
		
		 Object oo = new Sedan ();
		 // oo.speedUp(); ����
		 Sedan ssss = (Sedan)oo;
		 ssss.speedUp();
		 
		 // Object�� ���� ��� ����
		 Object o1 = new String();
		 Object o2 = new Scanner (System.in);
		 
		// o2.nextInt(); ����
		 Scanner scan = (Scanner)o2;
		 scan.nextInt();
	}

}
