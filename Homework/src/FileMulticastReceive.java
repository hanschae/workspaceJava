import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class FileMulticastReceive {
	MulticastSocket ms;
	DatagramSocket ds;
	DatagramPacket dp;
	InetAddress ia;
	FileOutputStream fos;
	final int PORT = 20000;
	public FileMulticastReceive() {
		try {
			ms = new MulticastSocket();
			ds = new DatagramSocket();
			ia = InetAddress.getByName("235.150.50.7");

			InetSocketAddress isa = new InetSocketAddress(ia,PORT);
			NetworkInterface ni = NetworkInterface.getByName("ggm");
			
			byte[] receiveData = new byte[512];
			dp = new DatagramPacket(receiveData, receiveData.length);
			while(true) {
				System.out.println("전송받기 대기중...");
				ds.receive(dp);
				
				byte[] receive = dp.getData();
				int byteCount = dp.getLength();
				
				String receiveStr = new String(receive, 0, byteCount); 
				if(byteCount>=10 && receiveStr.substring(0,10).equals("[*$@File&]")) {
					fos = new FileOutputStream(new File("d://testFolder", receiveStr.substring(10)));
					System.out.println("파일생성됨"+receiveStr);
				}else if(byteCount>=10 && receiveStr.equals("[!@#$%end]")){
					fos.close();
					ds.close();
					System.out.println("파일로 저장되었습니다");
					break;
				}else {
					fos.write(receive, 0, byteCount);
				}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileMulticastReceive();

	}

}
