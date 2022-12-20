package basic05_collection;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		// stack : �������� ��ü�� ��ų� ������. {FILO, LIFO}
		//		   ��ü�� ������ Stack������ ��������.
	
		Stack<String> s = new Stack<String>();
		s.push("ȫ�浿"); // 5
		s.push("�ֱ浿"); // 4
		s.push("���浿"); // 3
		s.push("��浿"); // 2
		s.push("�̱浿"); // 1
		
		System.out.println("serch()->"+s.search("ȫ�浿")); // ���� ��ü���� ��ȣ �ű��.
		
		System.out.println("empty->"+s.empty()); // ������ false, ������ true
		System.out.println("size()->"+s.size());
		
		while(!s.empty()) {
			System.out.println(s.pop());
			System.out.println("������ü��->"+s.size());
			
		
		}
		///
		
		
		
	}
	
	public static void main(String[] args) {
		
		new StackTest();

	}

}
