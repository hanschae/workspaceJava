package librarian;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import module.LibDataSet;
import module.LibVO;


public class LibrarianMain {
	Scanner scan = new Scanner(System.in);
	public LibrarianMain() {
				LibDataSet.dataSet();
		do {
			try {
				System.out.print(LibMenu());
				int inMenu = Integer.parseInt(scan.nextLine());
				if(inMenu==1) {
					LibMenu1();
				}else if(inMenu==2) {
					LibMenu2();
				}else if(inMenu==3) {
					LibMenu3();
				}else if (inMenu==4) {
					LibMenu4();
				}else if (inMenu==5) {
					LibMenu5();
				}else if (inMenu==6) {
					LibMenu6();
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println("\n\t     잘못 입력하셨습니다. 초기화면으로 돌아갑니다.");
			}
			
		}while(true);
	}
	
	// Home
	public String LibMenu() {
		LibVO vo = new LibVO();
		return "\n"
				+ "\t\t    [librarian ver.01]"
				+ "\n\n"
				+ "==========================================================="
				+ "\n"
				+ "\t1.도서검색\t\t2.도서목록조회\t3.신규도서등록"
				+ "\n"
				+ "\t4.도서정보수정\t5.도서정보삭제\t6.저장 및 종료"
				+ "\n"
				+ "==========================================================="
				+ "\n"
				+ "\t저장하지 않은 데이터는 유실되므로 유의하여 주시기 바랍니다."
				+ "\n\n"
				+ "\t\t\t메뉴선택 : ";
	}
	
	// 도서목록 HEAD
	public String LibBookHead() {
		return "==========================================================="
				+ "\n"
				+ "도서제목\t\t\t지은이\t 출판년도\t분류\t도서번호\t보유"
				+ "\n"
				+ "==========================================================="
				+ "\n";
	}
	
	// 도서검색
	public void LibMenu1() {
		System.out.print("\n\t\t검색할 도서제목을 입력하여 주십시오.\n\n\t\t  도서제목 : ");
		String searchName = scan.nextLine();
		System.out.print(LibBookHead());
		
		Collection<LibVO> list = LibDataSet.bookList.values();
		Iterator<LibVO> i = list.iterator();
		int cnt=0;
		while (i.hasNext()) {
			LibVO v = i.next();
			if(v.getBookName().equals(searchName)) {
				v.bookData();
				cnt++;
			}
		}
		System.out.println("\n\n\t\t     "+cnt+"권이 검색되었습니다.");
	}
	
	// 도서목록조회
	public void LibMenu2() {
		System.out.print(LibBookHead());
		Collection<LibVO> list = LibDataSet.bookList.values();
		Iterator<LibVO> i = list.iterator();
		
		while(i.hasNext()) {
			LibVO v = i.next();
			v.bookData();
			System.out.println();
		}
	}
	
	// 신규도서등록
	public void LibMenu3() {
		LibVO vo = new LibVO();
		System.out.print("\n\t   신규도서를 등록하겠습니다. 항목을 입력하여 주십시오.\n\t   도서제목 : ");
		vo.setBookName(scan.nextLine());
		System.out.print("\t   지은이 : ");
		vo.setBookWriter(scan.nextLine());
		System.out.print("\t   출판년도 : ");
		vo.setBookPubYear(Integer.parseInt(scan.nextLine()));
		System.out.print("\t   분류 : ");
		vo.setBookCategory(scan.nextLine());
		System.out.print("\t   도서번호 : ");
		vo.setBookIsbm(Integer.parseInt(scan.nextLine()));
		System.out.print("\t   보유권수 : ");
		vo.setBookNumber(Integer.parseInt(scan.nextLine()));

		LibDataSet.bookList.put(vo.getBookIsbm(), vo);
		System.out.println("\n\t       신규도서등록이 정상적으로 처리되었습니다.");
	}
	
	// 도서정보수정
	public void LibMenu4() {
		System.out.print("\n\t      수정할 도서의 도서번호을 입력하여 주십시오.\n\n\t\t      도서번호 : ");
		int EditBookISBM = Integer.parseInt(scan.nextLine());
		System.out.print("\n\t\t  수정할 항목을 입력하여 주십시오.\n\t\t     1.분류    2.보유권수\n\n\t\t      항목선택 : ");
		int EditBookMenu = Integer.parseInt(scan.nextLine());
		
		if(EditBookMenu==1) {
			editCategory(EditBookISBM);
		}else if(EditBookMenu==2) {
			editNumber(EditBookISBM);
		}else {
			System.out.println("\n\t   항목을 잘못선택하셨습니다. 초기화면으로 돌아갑니다.");
		}
	}
	
		// 분류 수정
	public void editCategory(int bookISBM) {
		LibVO vo = LibDataSet.bookList.get(bookISBM);
		System.out.print("\n\t\t     분류를 입력하여 주십시오.\n\n\t\t\t 분류 : ");
		vo.setBookCategory(scan.nextLine());
		System.out.println("\n"+vo.getBookName()+"의 분류가 "+vo.getBookCategory()+"(으)로 변경이 완료되었습니다.");
	}
	
		// 보유권수 수정
	public void editNumber(int bookISBM) {
		LibVO vo = LibDataSet.bookList.get(bookISBM);
		System.out.print("\n\t\t 현재 보유권수를 입력하여 주십시오.\n\n\t\t      보유권수 : ");
		vo.setBookNumber(Integer.parseInt(scan.nextLine()));
		System.out.println("\n"+vo.getBookName()+"의 보유권수가 "+vo.getBookNumber()+"권으로 변경이 완료되었습니다.");
	}
	
	// 도서정보삭제
	public void LibMenu5() {
		System.out.print("\n\t      삭제할 도서의 도서번호을 입력하여 주십시오.\n\n\t\t  도서번호 : ");
		int bookISBM = Integer.parseInt(scan.nextLine());
		LibDataSet.bookList.remove(bookISBM);
		System.out.println("\n\t     "+bookISBM+" 번의 삭제가 정상적으로 처리되었습니다.");		
		
	}
	
	// 저장 및 종료
	public void LibMenu6() {
		try {
			File f = new File("d://testFolder/librarian","librarian.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(LibDataSet.bookList);
			oos.close();
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n\t     저장이 완료되었습니다. 프로그램을 종료합니다.");
		System.exit(0);
	}
		
	public static void main(String[] args) {
		new LibrarianMain();

	}

}
