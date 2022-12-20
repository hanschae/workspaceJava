

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
	ServerSocket ss;
	public ServerSocketTest() {
		try {
			// ������ ����� �� �ִ� ServerSocket�� port��ȣ�� �����Ͽ� ��ü�� ����
			ss = new ServerSocket(10000);
			while(true) {
				// Ŭ���̾�Ʈ ������ accept()�޼ҵ尡 ��ٸ���
				// ���ӽ� Ŭ���̾�Ʈ������ �ִ� Socket ��ü�� return ���ش�
				System.out.println("Server start.... ���Ӵ����");
				Socket s = ss.accept();
				InetAddress ia = s.getInetAddress();
				System.out.println(ia.getHostAddress()+"->Ŭ���̾�Ʈ�� �����Ͽ����ϴ�");
				
				// �������� Ŭ���̾�Ʈ���� ���ں�����
				OutputStream os = s.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os); // 1byte ����
				PrintWriter pw = new PrintWriter(osw);
				
				pw.println("����->Ŭ���̾�Ʈ����->������ ���ӵǾ����ϴ�");
				pw.flush();
				
				//Ŭ���̾�Ʈ�� ���� ���� �ޱ�
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				String txt = br.readLine();
				System.out.println("Server�� ���� ���� ==>"+txt);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("Server ����...");
	}

	public static void main(String[] args) {
		new ServerSocketTest();
		

	}

}
