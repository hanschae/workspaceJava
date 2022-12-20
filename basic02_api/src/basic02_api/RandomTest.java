package basic02_api;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random();
		// Math.random() : 0.0 ~ 0.1 ������ ��
		// 1~100������ ���� 100�� �����
		// double ran [] = new double[100];
		int ran[] = new int[100];
		
		// (����*100)+1 = 1~100
		// (����*50)+1 = 1~50
		for (int i=0; i<ran.length; i++) {
			ran[i] = (int)(Math.random()*100 + 1);	// 1~100
		}
		System.out.println(Arrays.toString(ran));
		
		// (����ȭ)����(ū��-������+1) + ������
		// 72~87	(int)(Math.random()*(87-72+1)) + 72
		for (int i=0; i<ran.length; i++) {
			ran[i] = (int)(Math.random()*(87-72+1)+72);	// 72~87
		}
		System.out.println(Arrays.toString(ran));
	
		// Random Ŭ����
		int data[] = new int[100];
		for(int i=0; i<data.length; i++) {
			// data[i] = random.nextInt(); // �������߿��� int�������� ���� �������� �����ش�
			data [i] = random.nextInt(10)+1; // (10) = 0~9 / (10)+1 = 1~10
			// 26~39
			data [i] = random.nextInt(14)+26; // 39-26+1 = 14
		}
		System.out.println(Arrays.toString(data));		

		for (int i=1; i<=100; i++) {
			System.out.print(random.nextBoolean()+"\t");
		}
		
	}

}
