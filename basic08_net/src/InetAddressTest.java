

import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
		
	}
	public void start() {
		//ip�� ���õ� ��ü�� �����Ѵ�
		//����ǻ���� ������������ ������
		try {
			InetAddress ia = InetAddress.getLocalHost();
			String ip = ia.getHostAddress(); // ��ǻ�� ip
			String name = ia.getHostName(); // ��ǻ���̸� �Ǵ� URL�ּ�
			System.out.println("ia.address->"+ip);
			System.out.println("ia.name->"+name);
			
			// ������ �̿��� InetAddress�� ������
			InetAddress ia2 = InetAddress.getByName("www.naver.com");
			System.out.println("ia2.address->"+ia2.getHostAddress());
			System.out.println("ia2.name->"+ia2.getHostName());
			
			// �����Ǹ� �̿��� InetAddress�� ������
			InetAddress ia3 = InetAddress.getByName("223.130.200.107");
			System.out.println("ia2.address->"+ia3.getHostAddress());
			System.out.println("ia2.name->"+ia3.getHostName());
			System.out.println("-------------------------");
			
			//�������� netAddress��ü ������
			InetAddress[] ia4 = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i:ia4) {
				System.out.println("ia4.address->"+i.getHostAddress());
				System.out.println("ia4.address->"+i.getHostName());
								
			}
						
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		InetAddressTest it = new InetAddressTest();
		it.start();

	}

}
