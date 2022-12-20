import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class FileMulticastSend {
	MulticastSocket ms;
	DatagramSocket ds;
	DatagramPacket dp;
	InetAddress ia;
	final int PORT = 20000;
	public FileMulticastSend() {
		try {
			ms = new MulticastSocket();
			ds = new DatagramSocket();
			ia = InetAddress.getByName("235.150.50.7");
			
			File f = new File("d://img/Owl.jpg");
			FileInputStream fis = new FileInputStream(f);
			
			String sendFileName = "[*$@File&]"+f.getName(); // [*$@File&]Sunflower.jpg
			dp = new DatagramPacket(sendFileName.getBytes(), 0, sendFileName.getBytes().length, ia, PORT);
			ms.send(dp);
			
			int cnt = 0;
			while(true) {
				byte[] b = new byte[512];
				int byteCount = fis.read(b, 0, b.length);
				System.out.println(++cnt+", byte="+byteCount);
				if(byteCount <=0) break;
				dp = new DatagramPacket(b, 0, byteCount, ia, PORT);
				ms.send(dp);
			}	
			
			String endMessage = "[!@#$%end]"; //10����
			dp = new DatagramPacket(endMessage.getBytes(), 0, endMessage.getBytes().length, ia, PORT);	
			ms.send(dp);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileMulticastSend();

	}

}
