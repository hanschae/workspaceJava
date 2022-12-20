package librarianOOP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConn {

	// 드라이브 로딩
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			
		}
	}

	// 변수
	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	protected String sql = null;
	protected final String URL = "jdbc:mysql://@127.0.0.1/multi";
	protected final String DB_ID = "root";
	protected final String DB_PW = "root1234";
	
	// DB연결
	protected void getConn() {
		try {
			conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB닫기
	protected void getClose() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
