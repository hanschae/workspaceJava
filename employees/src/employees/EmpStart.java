package employees;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import module.EmpDataSet;
import module.EmpVO;

public class EmpStart {
	Scanner scan = new Scanner(System.in);
	public EmpStart() {
		// 현재 등록되어있는 사원목록
		EmpDataSet.dataSet(); // 초기 데이터 세팅
		do {
			try {
				System.out.print(menu());
				int inMenu = Integer.parseInt(scan.nextLine());
				if(inMenu==5) { // 종료
					empStop();
				}else if(inMenu==2) { // 사원등록
					empInsert();
				}else if(inMenu==1) { // 사원목록 (모든사원)
					empListOutput();
				}else if(inMenu==3) { // 사원수정
					empEdit();
				}else if(inMenu==4) { // 사원삭제
					empDel();
				}else if(inMenu==6) { // 사원검색 (이름으로)
					getNameSearch();
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println("메뉴를 잘못입력하였습니다.");
			}
		}while(true);
	}
	
	// 사원검색
	public void getNameSearch() {
		System.out.print("검색할 사원명을 입력하여주십시오.\n사원명 : ");
		String searchName = scan.nextLine();
		
		// vo
		Collection<EmpVO> list = EmpDataSet.empList.values();
		Iterator<EmpVO> ii = list.iterator();
		int cnt=0;
		while(ii.hasNext()) {
			EmpVO v = ii.next();
			if (v.getEmpName().equals(searchName)) {
				System.out.println(v.toString());
				cnt++;
			}
		}
		System.out.println(cnt+"명이 검색되었습니다.");
	}
	
	// 사원삭제
	public void empDel() {
		System.out.print("삭제할 사원의 사원번호를 입력하여주십시오.\n사원번호 : ");
		int empno = Integer.parseInt(scan.nextLine());
		EmpDataSet.empList.remove(empno); // 객체 지워짐
		System.out.println(empno+"번 사원의 정보를 삭제하였습니다.");
				
	}
	
	// 사원수정
	public void empEdit() {
		// 어떤 사원을 수정할 것인지 입력받기
		System.out.print("수정할 사원의 사원번호를 입력하세요.\n사원번호 : ");
		int editEmpno = Integer.parseInt(scan.nextLine());
		
		System.out.print("수정을 원하시는 항목을 선택해주세요.\n[1.부서명, 2.연락처]\n항목선택 : ");
		String editMenu = scan.nextLine();
		if(editMenu.equals("1")) { // 부서수정
			departmentEdit(editEmpno);
		}else if(editMenu.equals("2")) { // 연락처 수정
			telEdit(editEmpno);
		}else {
			System.out.println("항목을 잘못선택하였습니다.");
		}
	}
	// 부서명 수정 메소드
	public void departmentEdit(int empno) {
		EmpVO vo = EmpDataSet.empList.get(empno);
		System.out.print("새로운 부서명을 입력하여주십시오.\n부서명 : ");
		String editDepartName = scan.nextLine();
		vo.setDepartment(editDepartName); // 부서명이 변경됨
		System.out.println(vo.getEmpName()+"의 부서명이 "+vo.getDepartment()+"로 변경되었습니다.");
	}
	// 연락처 수정 메소드
	public void telEdit(int empno) {
		EmpVO vo = EmpDataSet.empList.get(empno);
		System.out.println("새로운 연락처를 입력하여주십시오.\n연락처 : ");
		vo.setTel(scan.nextLine());
		System.out.println(vo.getEmpName()+"의 연락처가 "+vo.getTel()+"로 변경되었습니다.");
		
	}
	
	// 사원목록
	public void empListOutput() {
		titlePrint(); // 제목출력
		// 맵의 모든 value(vo객체)를 구하여 목록을 출력한다
		Collection<EmpVO> emp = EmpDataSet.empList.values();
		Iterator<EmpVO> i = emp.iterator();
		
		while(i.hasNext()) {
			EmpVO v = i.next();
			System.out.println(v.toString());
		}
	}
	
	public void titlePrint() {
		System.out.println("사원번호\t사원명\t부서명\t연락처");
	}
	
	// 사원등록
	public void empInsert() {
		EmpVO vo = new EmpVO(); // 입력받은 사원정보를 저장할 vo
		System.out.print("사원번호 : ");
		vo.setEmpno(Integer.parseInt(scan.nextLine()));
		System.out.print("사원명 : ");
		vo.setEmpName(scan.nextLine());
		System.out.print("부서명 : ");
		vo.setDepartment(scan.nextLine());
		System.out.print("전화번호 : ");
		vo.setTel(scan.nextLine());
		
		// 컬렉션에 vo를 추가
		EmpDataSet.empList.put(vo.getEmpno(), vo);
		System.out.println("사원정보가 등록되었습니다.");
	}
	
	// 종료
	public void empStop() {
		try {
			// 사원정보가 있는 empList를 파일로 저장하고 종료한다
			File f = new File("d://testFolder","employee.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(EmpDataSet.empList);
			
			oos.close();
			fos.close();
			
		}catch(Exception e) {
			System.out.println("사원파일 저장 예외발생"+e.getMessage());
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	public String menu() {
		return "MENU [1.사원목록, 2.사원등록, 3.사원수정, 4.사원삭제, 5.종료, 6.검색]\nMENU 선택 : ";
	}
	
	public static void main(String[] args) {
		new EmpStart();
	}

}
