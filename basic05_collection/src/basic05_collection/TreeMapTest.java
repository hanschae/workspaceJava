package basic05_collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		
	}
	public void start() {
		// TreeMap : key�� value�� �̿��Ͽ� �÷����� ����Ѵ�
		//			 key�� �������� ������ ���ش�
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		
		tm.put("1", new MemberVO(1000, "ȫ�浿", "�Ѱ���", "010-1234-1111"));
		tm.put("A", new MemberVO(2000, "ȫ�浿2", "�Ѱ���", "010-1234-2222"));
		tm.put("��浿", new MemberVO(3000, "��浿", "�Ѱ���", "010-1234-3333"));
		tm.put("B", new MemberVO(4000, "ȫ�浿3", "�Ѱ���", "010-1234-4444"));
		tm.put("100", new MemberVO(5000, "ȫ�浿4", "�Ѱ���", "010-1234-5555"));
		
		Set<String> keys = tm.keySet();
		Iterator<String> keyList = keys.iterator();
		while(keyList.hasNext()) {
			String key = keyList.next();
			MemberVO vo = tm.get(key);
			System.out.println(key+"->"+vo.toString()); // key ������������ ����
		}
		
		
	}
	public static void main(String[] args) {
		new TreeMapTest().start();
	}

}
