package basic02_api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// Arrays Ŭ���� : �迭�� �̿��� ó���Ѵ�
		
		int data [] = {85, 24, 76, 52, 14, 4, 43, 1, 32};
		int data3 [] = {85, 24, 76, 52, 14, 4, 43, 32, 1};
		
		// toString() : �迭�� ���� ���ڷ� ����� �������ش�
		
		String lst = Arrays.toString(data); // [85, 24, 76, 52, 14, 4, 43, 1, 32]
		System.out.println(lst);
		
		// System.out.println(Arrays.toString(data)); // �̷��Ե� ����
		
		// ������������ ����
		// Arrays.sort(data);
		// Arrays.sort(data,2,6); // index 2���� 6�ձ���
		
		// ������������ ����
		Integer data2 [] = {85, 24, 76, 52, 14, 4, 43, 1, 32};
		Arrays.sort(data2, Collections.reverseOrder());
		
		System.out.println("���� �� -> "+Arrays.toString(data2));
		
		// �迭�� ����
		int copy [] = Arrays.copyOfRange(data, 2, 6);
		System.out.println("copy = "+Arrays.toString(copy));
		
		// �迭�� ��
		System.out.println(Arrays.equals(data, data3));
	}

}
