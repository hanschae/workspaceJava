package mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
	Connection conn=null;
	PreparedStatement pstmt = null;
	Scanner scan = new Scanner (System.in);
	public InsertTest() {
		
	}
	public void start() {
		// connector build path ����
		try {
			//  1. Driver �ε�
			// Class Ŭ����
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. DB����		ip : 127.0.0.1	port:3306
			String url = "jdbc:mysql://@127.0.0.1/multi";
			conn = DriverManager.getConnection(url, "root", "root1234");
			
			// ������ �غ�
			System.out.print("ȸ����ȣ->");
			int mem_id = Integer.parseInt(scan.nextLine());
			System.out.print("ȸ����->");
			String username = scan.nextLine();
			System.out.print("�μ���->");
			String depart = scan.nextLine();
			System.out.print("����ó->");
			String phone = scan.nextLine();
			System.out.print("�̸���->");
			String email = scan.nextLine();
			
			// 3. PreparedStatement ��ü�� ����(sql������)
			String sql = "insert into member(mem_id, username, depart, phone, email)" 
						+ " values(?,?,?,?,?)"; // ���� ������ �ߺ��� �����̽��� ������, 
												// �ν��� �ΰ��� �����ɷ� �ϱ⿡ �����߻�����
			// �����Ͱ� �� �ڸ��� ?�� ǥ��
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mem_id); // ���ڼ���
			pstmt.setString(2, username);
			pstmt.setString(3, depart);
			pstmt.setString(4, phone);
			pstmt.setString(5, email);
			
			// 4. ����
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("���ڵ尡 �߰��Ǿ����ϴ�");
			}else if(cnt<=0) {
				System.out.println("���ڵ尡 �߰� �����Ͽ����ϴ�.");
			}
				
		}catch(ClassNotFoundException cfe) {
			System.out.println("����̺� �ε� ����");
		}catch (SQLException se) {
			System.out.println("DB���� ����");
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 5. DB���� ����
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new InsertTest().start();
	}

}

