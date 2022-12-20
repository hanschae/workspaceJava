package basic05_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {
		
	}
	public void start() {
		// TreeSet : �Է¼����� �������� �ʴ´�
		//			 �ߺ������� ������� ����
		//			 ��ü�� ������������ �����Ѵ�
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		int[] data = {52,9,47,63,67,87,23,52,9,47,63,67};
		
		for(int d: data) {
			ts.add(d);
		}
		
		Iterator<Integer> ii = ts.iterator();
		while(!ii.hasNext()) {
			System.out.println();
		}
		
		
		
	}

	public static void main(String[] args) {
		new TreeSetTest().start();

	}

}
