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
				System.out.println("\n\t     �߸� �Է��ϼ̽��ϴ�. �ʱ�ȭ������ ���ư��ϴ�.");
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
				+ "\t1.�����˻�\t\t2.���������ȸ\t3.�űԵ������"
				+ "\n"
				+ "\t4.������������\t5.������������\t6.���� �� ����"
				+ "\n"
				+ "==========================================================="
				+ "\n"
				+ "\t�������� ���� �����ʹ� ���ǵǹǷ� �����Ͽ� �ֽñ� �ٶ��ϴ�."
				+ "\n\n"
				+ "\t\t\t�޴����� : ";
	}
	
	// ������� HEAD
	public String LibBookHead() {
		return "==========================================================="
				+ "\n"
				+ "��������\t\t\t������\t ���ǳ⵵\t�з�\t������ȣ\t����"
				+ "\n"
				+ "==========================================================="
				+ "\n";
	}
	
	// �����˻�
	public void LibMenu1() {
		System.out.print("\n\t\t�˻��� ���������� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t  �������� : ");
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
		System.out.println("\n\n\t\t     "+cnt+"���� �˻��Ǿ����ϴ�.");
	}
	
	// ���������ȸ
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
	
	// �űԵ������
	public void LibMenu3() {
		LibVO vo = new LibVO();
		System.out.print("\n\t   �űԵ����� ����ϰڽ��ϴ�. �׸��� �Է��Ͽ� �ֽʽÿ�.\n\t   �������� : ");
		vo.setBookName(scan.nextLine());
		System.out.print("\t   ������ : ");
		vo.setBookWriter(scan.nextLine());
		System.out.print("\t   ���ǳ⵵ : ");
		vo.setBookPubYear(Integer.parseInt(scan.nextLine()));
		System.out.print("\t   �з� : ");
		vo.setBookCategory(scan.nextLine());
		System.out.print("\t   ������ȣ : ");
		vo.setBookIsbm(Integer.parseInt(scan.nextLine()));
		System.out.print("\t   �����Ǽ� : ");
		vo.setBookNumber(Integer.parseInt(scan.nextLine()));

		LibDataSet.bookList.put(vo.getBookIsbm(), vo);
		System.out.println("\n\t       �űԵ�������� ���������� ó���Ǿ����ϴ�.");
	}
	
	// ������������
	public void LibMenu4() {
		System.out.print("\n\t      ������ ������ ������ȣ�� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t      ������ȣ : ");
		int EditBookISBM = Integer.parseInt(scan.nextLine());
		System.out.print("\n\t\t  ������ �׸��� �Է��Ͽ� �ֽʽÿ�.\n\t\t     1.�з�    2.�����Ǽ�\n\n\t\t      �׸��� : ");
		int EditBookMenu = Integer.parseInt(scan.nextLine());
		
		if(EditBookMenu==1) {
			editCategory(EditBookISBM);
		}else if(EditBookMenu==2) {
			editNumber(EditBookISBM);
		}else {
			System.out.println("\n\t   �׸��� �߸������ϼ̽��ϴ�. �ʱ�ȭ������ ���ư��ϴ�.");
		}
	}
	
		// �з� ����
	public void editCategory(int bookISBM) {
		LibVO vo = LibDataSet.bookList.get(bookISBM);
		System.out.print("\n\t\t     �з��� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t\t �з� : ");
		vo.setBookCategory(scan.nextLine());
		System.out.println("\n"+vo.getBookName()+"�� �з��� "+vo.getBookCategory()+"(��)�� ������ �Ϸ�Ǿ����ϴ�.");
	}
	
		// �����Ǽ� ����
	public void editNumber(int bookISBM) {
		LibVO vo = LibDataSet.bookList.get(bookISBM);
		System.out.print("\n\t\t ���� �����Ǽ��� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t      �����Ǽ� : ");
		vo.setBookNumber(Integer.parseInt(scan.nextLine()));
		System.out.println("\n"+vo.getBookName()+"�� �����Ǽ��� "+vo.getBookNumber()+"������ ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	// ������������
	public void LibMenu5() {
		System.out.print("\n\t      ������ ������ ������ȣ�� �Է��Ͽ� �ֽʽÿ�.\n\n\t\t  ������ȣ : ");
		int bookISBM = Integer.parseInt(scan.nextLine());
		LibDataSet.bookList.remove(bookISBM);
		System.out.println("\n\t     "+bookISBM+" ���� ������ ���������� ó���Ǿ����ϴ�.");		
		
	}
	
	// ���� �� ����
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
		System.out.println("\n\t     ������ �Ϸ�Ǿ����ϴ�. ���α׷��� �����մϴ�.");
		System.exit(0);
	}
		
	public static void main(String[] args) {
		new LibrarianMain();

	}

}
