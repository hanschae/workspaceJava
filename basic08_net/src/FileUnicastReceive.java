import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class FileUnicastReceive {
	DatagramSocket ds;
	DatagramPacket dp;
	FileOutputStream fos;
	public FileUnicastReceive() {
		
	}
	public void receivestart() {
		try {
			ds = new DatagramSocket(15000);
			byte[] receiveData = new byte[512];
			dp = new DatagramPacket(receiveData, receiveData.length);
			while(true) {
				System.out.println("���۹ޱ� �����...");
				ds.receive(dp);//���۹ޱ�
				
				byte[] receive = dp.getData();
				int byteCount = dp.getLength();//���۹��� byte ��
				
				String receiveStr = new String(receive, 0, byteCount); // [*$@File&]Sunflower.jpg
				if(byteCount>=10 && receiveStr.substring(0,10).equals("[*$@File&]")) {//���ϸ��� ���۵Ǿ���
					fos = new FileOutputStream(new File("d://testFolder", receiveStr.substring(10)));// d://testFolder/Sunflower.jpg
					System.out.println("���ϻ�����"+receiveStr);
				}else if(byteCount>=10 && receiveStr.equals("[!@#$%end]")){
					fos.close();
					ds.close();
					System.out.println("���Ϸ� ����Ǿ����ϴ�");
					break;
				}else {//���ϳ���
					fos.write(receive, 0, byteCount);
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileUnicastReceive().receivestart();;

	}

}
