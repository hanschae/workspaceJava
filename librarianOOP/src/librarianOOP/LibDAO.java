package librarianOOP;

import java.util.ArrayList;
import java.util.List;

public class LibDAO extends DBConn {

	public LibDAO() {
	
	}
	
	public static LibDAO getInstance() {
		return new LibDAO();
	}
	
	// 도서목록
	public List<LibVO> libSelect(String searchWord) {
		List<LibVO> list = new ArrayList<LibVO>();
		try {
			getConn();
			
			sql = "select bookcode, bookname, bookwriter, bookpub, bookcategory from libtbl ";
			if(searchWord !=null) {
				sql += " where bookname like ? ";
			}	
			sql += " order by bookcode";
			
			pstmt = conn.prepareStatement(sql);
			
			if(searchWord != null) {
				pstmt.setString(1, "%"+searchWord+"%");
			}

			rs = pstmt.executeQuery();
			while(rs.next()) {
				LibVO vo = new LibVO();
				vo.setBookCode(rs.getInt(1));
				vo.setBookName(rs.getString(2));
				vo.setBookWriter(rs.getString(3));
				vo.setBookPub(rs.getString(4));
				vo.setBookCategory(rs.getString(5));
				
				list.add(vo);	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
	}
	
	// 신규도서등록
	public int libInsert(LibVO vo) {
		int result = 0;
		try {
			getConn(); // DB연결
			sql = "insert into libtbl(bookcode, bookname, bookwriter, bookpub, bookcategory) "
					+ "values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBookCode());
			pstmt.setString(2, vo.getBookName());
			pstmt.setString(3, vo.getBookWriter());
			pstmt.setString(4, vo.getBookPub());
			pstmt.setString(5, vo.getBookCategory());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	// 도서정보수정
	public int libUpdate(LibVO vo) {
		int result=0;
		try {
			getConn();
			sql = "update libtbl set "+vo.getFieldName()+ "=? where bookcode=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getBookPub());
			pstmt.setInt(2, vo.getBookCode());
			
			result=pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return result;
	}
	// 도서정보삭제
	public int libDelete(int bookCode) {
		int result=0;
		try {
			getConn();
			sql = "delete from libtbl where bookcode=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookCode);
			
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
