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
		// connector build path 설정
		try {
			//  1. Driver 로딩
			// Class 클래스
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. DB연결		ip : 127.0.0.1	port:3306
			String url = "jdbc:mysql://@127.0.0.1/multi";
			conn = DriverManager.getConnection(url, "root", "root1234");
			
			// 데이터 준비
			System.out.print("회원번호->");
			int mem_id = Integer.parseInt(scan.nextLine());
			System.out.print("회원명->");
			String username = scan.nextLine();
			System.out.print("부서명->");
			String depart = scan.nextLine();
			System.out.print("연락처->");
			String phone = scan.nextLine();
			System.out.print("이메일->");
			String email = scan.nextLine();
			
			// 3. PreparedStatement 객체를 생성(sql쿼리문)
			String sql = "insert into member(mem_id, username, depart, phone, email)" 
						+ " values(?,?,?,?,?)"; // 줄을 내릴땐 잘보고 스페이스를 넣을것, 
												// 인식을 두개가 붙은걸로 하기에 에러발생가능
			// 데이터가 들어갈 자리는 ?로 표시
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mem_id); // 숫자세팅
			pstmt.setString(2, username);
			pstmt.setString(3, depart);
			pstmt.setString(4, phone);
			pstmt.setString(5, email);
			
			// 4. 실행
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("레코드가 추가되었습니다");
			}else if(cnt<=0) {
				System.out.println("레코드가 추가 실패하였습니다.");
			}
				
		}catch(ClassNotFoundException cfe) {
			System.out.println("드라이브 로딩 실패");
		}catch (SQLException se) {
			System.out.println("DB연결 실패");
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 5. DB연결 해제
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

