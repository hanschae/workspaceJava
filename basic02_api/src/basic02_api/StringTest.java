package basic02_api;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "ä����";
		String name2 = "ä����";
		
		String addr = new String("����� ���ʱ� ���ʵ�");
		String addr2 = new String("����� ���ʱ� ���ʵ�");
	
		// == : ������
		if(name==name2) {
			System.out.println("name�� name2�� ����");
		}else {
			System.out.println("name�� name2�� �ٸ���");
		}
		
		if(addr==addr2) {
			System.out.println("addr�� addr2�� ����");
		}else {
			System.out.println("addr�� addr2�� �ٸ���");
		}
		
		String addr3 = addr2;
		if(addr2==addr3) {
			System.out.println("addr2�� addr3�� ����");
		}else {
			System.out.println("addr2�� addr3�� �ٸ���");
		}
		
		// equals() : ��ü���� ���� �����ش�. (��ҹ��� ����)
		String addr4 = new String("����� ���ʱ� ���ʵ�(dong)");
		String addr5 = new String("����� ���ʱ� ���ʵ�(Dong)");
		
		boolean boo = addr5.equals(addr4); // = addr4.equals(addr5)
		if (boo) {
			System.out.println("addr4 �� addr5�� ����");
		}else {
			System.out.println("addr4 �� addr5�� �ٸ���");
		}
		// equalsIgnoreCase() : ���� �����ش�. (��ҹ��� ���� X)
		if (addr4.equalsIgnoreCase(addr5)) {
			System.out.println(("����(��ҹ��ڱ���X)"));
		} else {
			System.out.println("�ٸ���(��ҹ��ڱ���O)");
		}
		
		String str = "A";
		str = str + "B";
		String str2 = str + 100;
		
		System.out.println("charAt()->" + addr4.charAt(5)); // index ��ġ�� ���ڸ� ��ȯ�Ѵ�
		
		System.out.println("concat()->" + addr4.concat(name)); // ���ڿ���
		addr4 = addr4.concat(name);
		System.out.println("concat()->" + addr4.concat(name));
		
		
		String txt = "Hello!";
		byte txtCode [] = txt.getBytes();
		System.out.println(Arrays.toString(txtCode));
		// �ƽ�Ű�ڵ� H:72 e:101 l:108 o:111 !:33
		
		int idx = addr4.indexOf("��"); // ����� ���ʱ� ���ʵ�(dong)ä����
		System.out.println("indexOf->"+idx);
		System.out.println("lastIndexOf->"+addr.lastIndexOf("��"));
		System.out.println("indexOf->"+addr4.indexOf("��",5)); // index5 ���ķ� ���� ã�ƶ�
		System.out.println("indexOf->"+addr4.indexOf("������")); // ���� �����϶� -1
		System.out.println("length->"+addr4.length());
		System.out.println(("repeat->"+addr4.repeat(4)));
		System.out.println("*".repeat(50));
		
		addr4= addr4.replaceAll("���ʱ�", "SeoChoGu");
		System.out.println("replaceALL->"+addr4);
		
		String tel = "010---1234-5678";
		String telSplit[] = tel.split("-");
		System.out.println(Arrays.toString(telSplit));
		
		// substring : ���ڿ����� �Ϻ��� ���ڿ��� ���� ��
		//							 012345678901234 567
		String addrsub = new String("Seoul SeoChoGu ���ʵ�");
		String sub1 = addrsub.substring(6, 14); // ������ġ 6, ����ġ 13
		System.out.println("substring(int, int)->"+sub1);
		String sub2 = addrsub.substring(10);
		System.out.println("substring(int)->"+sub2); // ������ġ 10, ������ ���Ѵ�
		
		System.out.println("lower->"+addrsub.toLowerCase()); // ���ڿ��� �ҹ��ڷ� ��ȯ�� ��ȯ
		System.out.println("upper->"+addrsub.toUpperCase()); // ���ڿ��� �빮�ڷ� ��ȯ�� ��ȯ
		
		// "2500"				  2500
		String x = String.valueOf(2500)+ 500; // ��ü�� String���� ����ȯ
		System.out.println(x);
		
		char c[] = {'J', 'a', 'v', 'a'}; // "Java"
		System.out.println(c); //�ؿ� int d[] ó�� ��µ��� �ʴ´�
		System.out.println(String.valueOf(c));
		
		int d[] = {23,45,67,88};
		System.out.println(d);
		
		String data = "		Test		Programming		";
		System.out.println("data->"+data.trim()+"?"); // ���� ���� ���鹮�ڸ� �����
	}

}
