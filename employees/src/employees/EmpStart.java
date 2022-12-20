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
		// ���� ��ϵǾ��ִ� ������
		EmpDataSet.dataSet(); // �ʱ� ������ ����
		do {
			try {
				System.out.print(menu());
				int inMenu = Integer.parseInt(scan.nextLine());
				if(inMenu==5) { // ����
					empStop();
				}else if(inMenu==2) { // ������
					empInsert();
				}else if(inMenu==1) { // ������ (�����)
					empListOutput();
				}else if(inMenu==3) { // �������
					empEdit();
				}else if(inMenu==4) { // �������
					empDel();
				}else if(inMenu==6) { // ����˻� (�̸�����)
					getNameSearch();
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println("�޴��� �߸��Է��Ͽ����ϴ�.");
			}
		}while(true);
	}
	
	// ����˻�
	public void getNameSearch() {
		System.out.print("�˻��� ������� �Է��Ͽ��ֽʽÿ�.\n����� : ");
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
		System.out.println(cnt+"���� �˻��Ǿ����ϴ�.");
	}
	
	// �������
	public void empDel() {
		System.out.print("������ ����� �����ȣ�� �Է��Ͽ��ֽʽÿ�.\n�����ȣ : ");
		int empno = Integer.parseInt(scan.nextLine());
		EmpDataSet.empList.remove(empno); // ��ü ������
		System.out.println(empno+"�� ����� ������ �����Ͽ����ϴ�.");
				
	}
	
	// �������
	public void empEdit() {
		// � ����� ������ ������ �Է¹ޱ�
		System.out.print("������ ����� �����ȣ�� �Է��ϼ���.\n�����ȣ : ");
		int editEmpno = Integer.parseInt(scan.nextLine());
		
		System.out.print("������ ���Ͻô� �׸��� �������ּ���.\n[1.�μ���, 2.����ó]\n�׸��� : ");
		String editMenu = scan.nextLine();
		if(editMenu.equals("1")) { // �μ�����
			departmentEdit(editEmpno);
		}else if(editMenu.equals("2")) { // ����ó ����
			telEdit(editEmpno);
		}else {
			System.out.println("�׸��� �߸������Ͽ����ϴ�.");
		}
	}
	// �μ��� ���� �޼ҵ�
	public void departmentEdit(int empno) {
		EmpVO vo = EmpDataSet.empList.get(empno);
		System.out.print("���ο� �μ����� �Է��Ͽ��ֽʽÿ�.\n�μ��� : ");
		String editDepartName = scan.nextLine();
		vo.setDepartment(editDepartName); // �μ����� �����
		System.out.println(vo.getEmpName()+"�� �μ����� "+vo.getDepartment()+"�� ����Ǿ����ϴ�.");
	}
	// ����ó ���� �޼ҵ�
	public void telEdit(int empno) {
		EmpVO vo = EmpDataSet.empList.get(empno);
		System.out.println("���ο� ����ó�� �Է��Ͽ��ֽʽÿ�.\n����ó : ");
		vo.setTel(scan.nextLine());
		System.out.println(vo.getEmpName()+"�� ����ó�� "+vo.getTel()+"�� ����Ǿ����ϴ�.");
		
	}
	
	// ������
	public void empListOutput() {
		titlePrint(); // �������
		// ���� ��� value(vo��ü)�� ���Ͽ� ����� ����Ѵ�
		Collection<EmpVO> emp = EmpDataSet.empList.values();
		Iterator<EmpVO> i = emp.iterator();
		
		while(i.hasNext()) {
			EmpVO v = i.next();
			System.out.println(v.toString());
		}
	}
	
	public void titlePrint() {
		System.out.println("�����ȣ\t�����\t�μ���\t����ó");
	}
	
	// ������
	public void empInsert() {
		EmpVO vo = new EmpVO(); // �Է¹��� ��������� ������ vo
		System.out.print("�����ȣ : ");
		vo.setEmpno(Integer.parseInt(scan.nextLine()));
		System.out.print("����� : ");
		vo.setEmpName(scan.nextLine());
		System.out.print("�μ��� : ");
		vo.setDepartment(scan.nextLine());
		System.out.print("��ȭ��ȣ : ");
		vo.setTel(scan.nextLine());
		
		// �÷��ǿ� vo�� �߰�
		EmpDataSet.empList.put(vo.getEmpno(), vo);
		System.out.println("��������� ��ϵǾ����ϴ�.");
	}
	
	// ����
	public void empStop() {
		try {
			// ��������� �ִ� empList�� ���Ϸ� �����ϰ� �����Ѵ�
			File f = new File("d://testFolder","employee.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(EmpDataSet.empList);
			
			oos.close();
			fos.close();
			
		}catch(Exception e) {
			System.out.println("������� ���� ���ܹ߻�"+e.getMessage());
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	public String menu() {
		return "MENU [1.������, 2.������, 3.�������, 4.�������, 5.����, 6.�˻�]\nMENU ���� : ";
	}
	
	public static void main(String[] args) {
		new EmpStart();
	}

}
