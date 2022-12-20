package mysql_jdbc;

import java.util.Scanner;

public class DeleteTest extends DBConn {
	Scanner scan = new Scanner(System.in);
	SelectTest st = new SelectTest();
	public DeleteTest() {
		
	}

	public void start() {
		// ������ ȸ����ȣ�� �Է¹޾� ȸ������
		try {
			st.start();
			System.out.print("������ ȸ����ȣ : ");
			int mem_id = scan.nextInt();
			
			getConn();
			
			sql = "delete from member where mem_id=?";
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mem_id);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println(mem_id+"�� ȸ���� �����Ͽ����ϴ�.");
			}else {
				System.out.println("ȸ������ ����");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			getClose();
		}
	}
	public static void main(String[] args) {
		new DeleteTest().start();

	}

}
