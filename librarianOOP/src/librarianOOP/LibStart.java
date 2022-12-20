package librarianOOP;

import java.util.List;
import java.util.Scanner;

public class LibStart {
	Scanner scan = new Scanner (System.in);
	LibDAO dao = new LibDAO();
	public LibStart() {
		start();
	}
	
	public void start() {
		
		do {
			try {
				String menu = menuShow();
				if(menu.equals("1")) { // 도서검색
					libSearch();
				}else if (menu.equals("2")) { // 도서목록조회
					libList();
				}else if (menu.equals("3")) { // 신규도서등록
					libAdd();
				}else if (menu.equals("4")) { // 도서정보수정
					libEdit();
				}else if (menu.equals("5")) { // 도서정보삭제
					libDel();
				}else if (menu.equals("6")) { // 종료
					libClose();
				}
			}catch(Exception e) {
				System.out.println("\n\t     잘못 입력하셨습니다. 초기화면으로 돌아갑니다.");
			}
		}while(true);
		
	}
	

	// 검색
	public void libSearch() {
		System.out.print("\n\t\t검색할 도서제목을 입력하여 주십시오.\n\n\t\t  도서제목 : ");
		String searchWord = scan.nextLine();
		libPrint(dao.libSelect(searchWord));
	}
	
	// 도서목록
	public void libList() {
		String searchWord = null;
		libPrint(dao.libSelect(searchWord));
		
	}
	
	// 목록출력
	public void libPrint(List<LibVO> list) {
		System.out.println("========================================================"
				+ "\n"
				+ "도서제목\t\t\t지은이\t출판사\t분류\t도서번호"
				+ "\n"
				+ "========================================================"
				+ "\n");
		for(int i=0; i<list.size(); i++) {
			LibVO vo = list.get(i);
			System.out.printf("%-17.15s\t%-6.6s\t%-6.6s\t%-6.6s\t%s\n", 
					vo.getBookName(), vo.getBookWriter(), vo.getBookPub(), vo.getBookCategory(), vo.getBookCode());
		}
	}
	
	// 도서등록
	public void libAdd() {
		LibVO vo = new LibVO();
		System.out.print("\n\t   신규도서를 등록하겠습니다. 항목을 입력하여 주십시오.\n\t   도서제목 : ");
		vo.setBookName(scan.nextLine());
		System.out.print("\n\t   지은이 : ");
		vo.setBookWriter(scan.nextLine());
		System.out.print("\n\t   출판사 : ");
		vo.setBookPub(scan.nextLine());
		System.out.print("\n\t   분류 : ");
		vo.setBookCategory(scan.nextLine());
		System.out.print("\n\t   도서번호 : ");
		vo.setBookCode(Integer.parseInt(scan.nextLine()));

		int cnt = dao.libInsert(vo);
		if(cnt>0) {
			System.out.println("\n\t  "+vo.getBookName()+" 의 신규도서등록이 정상적으로 처리되었습니다.");
		}else {
			System.out.println("신규도서등록에 실패하였습니다.");
		}
		
	}
	
	// 도서수정
	public void libEdit() {
		LibVO vo = new LibVO();
		System.out.print("\n\t      수정할 도서의 도서번호을 입력하여 주십시오.\n\n\t\t      도서번호 : ");
		vo.setBookCode(Integer.parseInt(scan.nextLine()));
		
		// 수정할 항목
		System.out.print("\n\t\t  수정할 항목을 입력하여 주십시오.\n\t        1.출판사    2.지은이    3.분류\n\n\t\t      항목선택 : ");
		String editField  = scan.nextLine();
		if(editField.equals("1")) {
			vo.setFieldName("BookPub");
			System.out.print("\n\t\t     출판사를 입력하여 주십시오.\n\n\t\t\t 출판사 : ");
		}else if(editField.equals("2")) {
			vo.setFieldName("BookWriter");
			System.out.print("\n\t\t     지은이를 입력하여 주십시오.\n\n\t\t\t 지은이 : ");
		}else if(editField.equals("3")) {
			vo.setFieldName("BookCategory");
			System.out.print("\n\t\t     분류를 입력하여 주십시오.\n\n\t\t\t 분류 : ");
		}
		vo.setBookPub(scan.nextLine());

		int cnt = dao.libUpdate(vo);
		if(cnt>0) {
			System.out.println(vo.getBookPub()+"으로 수정되었습니다.");
		}else {
			System.out.println("\\n\\t/t     수정실패하였습니다.");
		}
	}
	
	// 도서정보 삭제
	public void libDel() {
		System.out.print("\n\t      삭제할 도서의 도서번호을 입력하여 주십시오.\n\n\t\t  도서번호 : ");
		int bookCode = Integer.parseInt(scan.nextLine());
		int result = dao.libDelete(bookCode);
		if(result>0) {
			System.out.println("\n\t     "+bookCode+" 번의 삭제가 정상적으로 처리되었습니다.");		
		}else {
			System.out.println("\n\t\t     도서삭제에 실패하였습니다.");
		}
	}
	
	// 종료
	public void libClose() {
		System.out.println("\n\t             프로그램을 종료합니다.");
		System.exit(0);
	}
			
	// 메뉴
	public String menuShow() {
		System.out.print( "\n"
				+ "\t\t    [librarian ver.02]"
				+ "\n\n"
				+ "==========================================================="
				+ "\n"
				+ "\t1.도서검색\t\t2.도서목록조회\t3.신규도서등록"
				+ "\n"
				+ "\t4.도서정보수정\t5.도서정보삭제\t6.종료"
				+ "\n"
				+ "==========================================================="
				+ "\n"
				+ "\n\n"
				+ "\t\t\t메뉴선택 : ");
		return scan.nextLine();
	}
	
	public static void main(String[] args) {
		new LibStart();
	}

}
