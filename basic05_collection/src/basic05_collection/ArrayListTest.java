package basic05_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	//ArrayList list = new ArrayList();
	// ArrayList<MemberVO> list = new ArrayList<MemberVO> ();
	List<MemberVO> list = new ArrayList<MemberVO> ();
	public ArrayListTest() {
		// �����ȣ ����� �μ��� ����ó
		MemberVO vo = new MemberVO();
		vo.setNum(100);
		vo.setUsername("�̼���");
		vo.setDepartment("�ѹ���");
		vo.setTel("010-1234-5678");
		
		MemberVO vo2 = new MemberVO(200, "�������", "��ȹ��", "010-1111-2222");
		
		MemberVO vo3 = new MemberVO(300, "�念��", "�λ��", "010-3333-4444");

		list.add(vo);
		list.add(vo2);
		list.add(vo3);
		// list.add("String");
		
	}

}
