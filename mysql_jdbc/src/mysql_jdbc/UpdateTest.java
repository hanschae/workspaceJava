package mysql_jdbc;

public class UpdateTest extends DBConn{

	public UpdateTest() {
		
	}
	public void updateStart() {
		try {
			// 1. ����̺� �ε�
			// 2. DB����
			getConn();
			// 3. PreparedStatement
			sql = "update member set depart=?, phone=?, email=? where mem_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "������");
			pstmt.setString(2, "010-1111-1111");
			pstmt.setString(3, "sejong@naver.com");
			pstmt.setInt(4, 9999);
			
			// 4. ����
			int cnt = pstmt.executeUpdate(); // insert, update, delete
			if(cnt>0) {
				System.out.println("ȸ�������� �����Ǿ����ϴ�.");
			}else {
				System.out.println("ȸ�������� �������� ���߽��ϴ�.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UpdateTest().updateStart();

	}

}
