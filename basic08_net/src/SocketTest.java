
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

// 192.168.50.107
public class SocketTest {
	Socket s;
	public SocketTest() {
		try {
			InetAddress ia = InetAddress.getByName("192.168.50.107"); 
			s = new Socket(ia, 10000); // ���� ���ӵ�
			System.out.println("������ ���ӵ�...");
			
			// �������� ���� ���� �ޱ�
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String str = br.readLine();
			System.out.println("���� ���� : "+str);
			
			//Ŭ���̾�Ʈ�� �������� ���� ������
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			pw.println("Client -> Server : Ŭ���̾�Ʈ�� ������ ���� ����...");
			pw.flush();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Client ����...");
	}

	public static void main(String[] args) {
		new SocketTest();

	}

}
