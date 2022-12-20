package mysql_jdbc;

public class UpdateTest extends DBConn{

	public UpdateTest() {
		
	}
	public void updateStart() {
		try {
			// 1. 드라이브 로딩
			// 2. DB연결
			getConn();
			// 3. PreparedStatement
			sql = "update member set depart=?, phone=?, email=? where mem_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "관리부");
			pstmt.setString(2, "010-1111-1111");
			pstmt.setString(3, "sejong@naver.com");
			pstmt.setInt(4, 9999);
			
			// 4. 실행
			int cnt = pstmt.executeUpdate(); // insert, update, delete
			if(cnt>0) {
				System.out.println("회원정보가 수정되었습니다.");
			}else {
				System.out.println("회원정보를 수정하지 못했습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UpdateTest().updateStart();

	}

}
