package basic05_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareMain {
	List<MemberVO> list = new ArrayList<MemberVO>();
	public ObjectCompareMain() {
		
	}
	public void start() {
		list.add(new MemberVO(1200,"ȫ�浿","��ȹ��","010-1234-6953"));
		list.add(new MemberVO(2000,"�̼���","�ѹ���","010-1111-3434"));
		list.add(new MemberVO(5000,"�������","�λ��","010-5981-6953"));
		list.add(new MemberVO(3000,"�念��","������","010-4321-8555"));
		list.add(new MemberVO(1000,"���·�","�ܱ���","010-9897-6953"));
		
		System.out.println("==========������==========");
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
		System.out.println("==========�����ȣ�� ������������==========");
		Collections.sort(list, new CompareNumAsc());
		
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
		System.out.println("==========�����ȣ�� ������������==========");
		Collections.sort(list,new CompareNumDesc());
		
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
		System.out.println("==========��������� ������������==========");
		Collections.sort(list, new CompareUsernameAsc());
		
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
		System.out.println("==========��������� ������������==========");
		Collections.sort(list, new CompareUsernameDesc());
		
		for(MemberVO vo:list) {
			System.out.println(vo.toString());
		}
	}
	
	
	
	//������� ������������ ����
	class CompareUsernameDesc implements Comparator<MemberVO>{
		
		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			//			�̼���						ȫ�浿
			return v2.getUsername().compareTo(v1.getUsername());
		}
		
	}
	
	//�����(���ڿ�)�� ������������ ����
	class CompareUsernameAsc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			// 0  : ��ȯ����
			// 1  : ��ȯ
			// -1 : ��ȯ����
			//		ȫ�浿						�̼���
			return v1.getUsername().compareTo(v2.getUsername());
		}
		
	}
		
	// �����ȣ�� ������������
	class CompareNumDesc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			//		1000		1200
			return (v1.getNum()<v2.getNum())? 1 : (v1.getNum()>v2.getNum())? -1 : 0;
		}
		
	}
	
	// �����ȣ�� ������������ �����ϴ� ���� Ŭ���� (�������̽� : Comparator)
	class CompareNumAsc implements Comparator<MemberVO>{
		
		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			//0							> ��ȯ����
			// ���  1200-1000 = 200		> ��ȯ
			// ����  1000-1200 = -200		> ��ȯ����
			
			//		1200		2000
			return (v1.getNum()<v2.getNum())? -1 : (v1.getNum()>v2.getNum())? 1 : 0;
		}
		
	}
	
	public static void main(String[] args) {
		new ObjectCompareMain().start();
	}

}
