package basic02_api;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {
		// ����(int)�� ���ڿ��� �����
		int won = 5475483; // 5,475,483��
		
		// won�� ���� ȭ������� �����
		DecimalFormat fmt = new DecimalFormat("###,###��");
		String wonResult = fmt.format(won);
		System.out.println(wonResult);
		
		// ���ڵ����͸� ���ڷ� �ٲٱ�
		try {
			NumberFormat nf = NumberFormat.getInstance();
			Number n = nf.parse(wonResult);
			int result = n.intValue();
			System.out.println(result);
		}catch(ParseException pe) {
			System.out.println(pe.getMessage());
		}
		
		// ��¥ ����
		// 2022-06-15(��) 16:52:22
		// 2022-06-15(��) 04:52:22 ����
		Calendar now = Calendar.getInstance();
		
		SimpleDateFormat dateFmt = new SimpleDateFormat ("yyyy-MM-dd(E) hh:m:ss a");
		String dateTxt = dateFmt.format(now.getTime());
		System.out.println(dateTxt);
		
		// �̸� : ȫ�浿, ����ó : 010-1234-5678, �ּ� : ����� ������ ���ﵿ
		String name = "ȫ�浿";
		String tel = "010-1234-5678";
		String addr = "����� ������ ���ﵿ";
		// print(), println(), printf()
		// static String 	format(String pattern, Object ... arguments)
		String msg = MessageFormat.format("�̸� : {0}\n����ó : {1}\n�ּ� : {2}", name, tel, addr);
		System.out.println(msg);
	}

	public static void main(String[] args) {
		new FormatTest();

	}

}
