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
				if(menu.equals("1")) { // �����˻�
					libSearch();
				}else if (menu.equals("2")) { // ���������ȸ
					libList();
				}else if (menu.equals("3")) { // �űԵ������
					libAdd();
				}else if (menu.equals("4")) { // ������������
					libEdit();
				}else if (menu.equals("5")) { // ������������
					libDel();
				}else if (menu.equals("6")) { // ����
					libClose();
				}
			}catch(Exception e) {
				System.out.println("\n\t     �߸� �Է��ϼ̽��ϴ�. �ʱ�ȭ������ ���ư��ϴ�.");
			}
		}while(true);
		
	}
	

	// �˻�
	public void libSearch() {
		System.out.print("\n\t\t�˻��� ���������� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t  �������� : ");
		String searchWord = scan.nextLine();
		libPrint(dao.libSelect(searchWord));
	}
	
	// �������
	public void libList() {
		String searchWord = null;
		libPrint(dao.libSelect(searchWord));
		
	}
	
	// ������
	public void libPrint(List<LibVO> list) {
		System.out.println("========================================================"
				+ "\n"
				+ "��������\t\t\t������\t���ǻ�\t�з�\t������ȣ"
				+ "\n"
				+ "========================================================"
				+ "\n");
		for(int i=0; i<list.size(); i++) {
			LibVO vo = list.get(i);
			System.out.printf("%-17.15s\t%-6.6s\t%-6.6s\t%-6.6s\t%s\n", 
					vo.getBookName(), vo.getBookWriter(), vo.getBookPub(), vo.getBookCategory(), vo.getBookCode());
		}
	}
	
	// �������
	public void libAdd() {
		LibVO vo = new LibVO();
		System.out.print("\n\t   �űԵ����� ����ϰڽ��ϴ�. �׸��� �Է��Ͽ� �ֽʽÿ�.\n\t   �������� : ");
		vo.setBookName(scan.nextLine());
		System.out.print("\n\t   ������ : ");
		vo.setBookWriter(scan.nextLine());
		System.out.print("\n\t   ���ǻ� : ");
		vo.setBookPub(scan.nextLine());
		System.out.print("\n\t   �з� : ");
		vo.setBookCategory(scan.nextLine());
		System.out.print("\n\t   ������ȣ : ");
		vo.setBookCode(Integer.parseInt(scan.nextLine()));

		int cnt = dao.libInsert(vo);
		if(cnt>0) {
			System.out.println("\n\t  "+vo.getBookName()+" �� �űԵ�������� ���������� ó���Ǿ����ϴ�.");
		}else {
			System.out.println("�űԵ�����Ͽ� �����Ͽ����ϴ�.");
		}
		
	}
	
	// ��������
	public void libEdit() {
		LibVO vo = new LibVO();
		System.out.print("\n\t      ������ ������ ������ȣ�� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t      ������ȣ : ");
		vo.setBookCode(Integer.parseInt(scan.nextLine()));
		
		// ������ �׸�
		System.out.print("\n\t\t  ������ �׸��� �Է��Ͽ� �ֽʽÿ�.\n\t        1.���ǻ�    2.������    3.�з�\n\n\t\t      �׸��� : ");
		String editField  = scan.nextLine();
		if(editField.equals("1")) {
			vo.setFieldName("BookPub");
			System.out.print("\n\t\t     ���ǻ縦 �Է��Ͽ� �ֽʽÿ�.\n\n\t\t\t ���ǻ� : ");
		}else if(editField.equals("2")) {
			vo.setFieldName("BookWriter");
			System.out.print("\n\t\t     �����̸� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t\t ������ : ");
		}else if(editField.equals("3")) {
			vo.setFieldName("BookCategory");
			System.out.print("\n\t\t     �з��� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t\t �з� : ");
		}
		vo.setBookPub(scan.nextLine());

		int cnt = dao.libUpdate(vo);
		if(cnt>0) {
			System.out.println(vo.getBookPub()+"���� �����Ǿ����ϴ�.");
		}else {
			System.out.println("\\n\\t/t     ���������Ͽ����ϴ�.");
		}
	}
	
	// �������� ����
	public void libDel() {
		System.out.print("\n\t      ������ ������ ������ȣ�� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t  ������ȣ : ");
		int bookCode = Integer.parseInt(scan.nextLine());
		int result = dao.libDelete(bookCode);
		if(result>0) {
			System.out.println("\n\t     "+bookCode+" ���� ������ ���������� ó���Ǿ����ϴ�.");		
		}else {
			System.out.println("\n\t\t     ���������� �����Ͽ����ϴ�.");
		}
	}
	
	// ����
	public void libClose() {
		System.out.println("\n\t             ���α׷��� �����մϴ�.");
		System.exit(0);
	}
			
	// �޴�
	public String menuShow() {
		System.out.print( "\n"
				+ "\t\t    [librarian ver.02]"
				+ "\n\n"
				+ "==========================================================="
				+ "\n"
				+ "\t1.�����˻�\t\t2.���������ȸ\t3.�űԵ������"
				+ "\n"
				+ "\t4.������������\t5.������������\t6.����"
				+ "\n"
				+ "==========================================================="
				+ "\n"
				+ "\n\n"
				+ "\t\t\t�޴����� : ");
		return scan.nextLine();
	}
	
	public static void main(String[] args) {
		new LibStart();
	}

}
