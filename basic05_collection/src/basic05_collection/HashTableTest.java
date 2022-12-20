package basic05_collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {

	public HashTableTest() {
		
	}
	public void start() {
		// Map : key �� value�� �̿��Ͽ� ��ü�� �����
		//		 key �ߺ��Ǹ� �ȵȴ�
		
		Hashtable<String, MemberVO> ht = new Hashtable<String, MemberVO>();
		
		ht.put("1", new MemberVO(1000, "ȫ�浿", "�Ѱ���", "010-1234-1111"));
		ht.put("A", new MemberVO(2000, "ȫ�浿2", "�Ѱ���", "010-1234-2222"));
		ht.put("��浿", new MemberVO(3000, "��浿", "�Ѱ���", "010-1234-3333"));
		ht.put("B", new MemberVO(4000, "ȫ�浿3", "�Ѱ���", "010-1234-4444"));
		ht.put("100", new MemberVO(5000, "ȫ�浿4", "�Ѱ���", "010-1234-5555"));
		
		// Ű�� �̿��� ��ü ������
		MemberVO vo1 = ht.get("B");
		System.out.println(vo1.toString());
		System.out.println("******************************");
		
		// key ��� ���ϱ�
		Set<String> keyList = ht.keySet();
		Iterator<String> ii = keyList.iterator();
		while(ii.hasNext()) {
			String key = ii.next();
			MemberVO vo2 = ht.get(key);
			System.out.println(vo2.toString());
		}
		System.out.println("------------------------------");
		
		// value ��� ���ϱ�
		Collection<MemberVO> value = ht.values();
		Iterator<MemberVO> iii = value.iterator();
		while(iii.hasNext()) {
			System.out.println(iii.next().toString());
		}
		
	}
	public static void main(String[] args) {
		new HashTableTest().start();

	}

}
