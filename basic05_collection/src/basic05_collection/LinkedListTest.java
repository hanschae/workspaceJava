package basic05_collection;

import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		
	}
	public void start() {
		// LinkedList : ������ �����Ѵ�(List)
		// 				Queue : ���� �Էµ� ��ü ���� ��µǴ� ���
		// 				Deque : ���ʿ��� ��ü�� �Է� ����� �� �ִ�
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.offer(1234);
		ll.offer(5624);
		ll.offer(3322);
		ll.offer(654);
		
		while(!ll.isEmpty()) { // true : ����ִ�, false : ��ü�� �ִ�.
			int data = ll.poll(); // ��ü�� ������ �÷��ǿ��� �����
			System.out.println(data+", ������ü->"+ll.size());
			
			
		}
		
		
	}
	public static void main(String[] args) {
		new LinkedListTest().start();

	}

}
