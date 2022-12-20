
class Operator01 {

	public static void main(String[] args) {
		// ��� : +, =, *, /(������), %(������)

		int num1 = 10;
		int num2 = 3;
		
		// ����+���� = ����
		// ����+�Ǽ� = �Ǽ�
		// �Ǽ�+�Ǽ� = �Ǽ�
		
		int result = num1 / num2; // 3
		double result2 = num1 / (double)num2; // 3.33333
		int result3 = (int)(num1 / (double)num2); // 3
		
		System.out.println(result+", "+result2+", "+result3);
		
		// ���������� : ++,--
		
		int a = 10;
		
		// 1 ����
		// a++; �� ++a; �� �ܵ����� ���������ڰ� ����ֵ� ����� ����
		// a = a+1; // a = 1 + a;
		a += 1;
		
		System.out.println("a="+a);
		
		// 1 ����
		// a--;
		// --a;
		// a = a - 1;
		a -= 1;
		System.out.println("a="+a);
		
		int b = 5;
		
		int r1 = b++ + 100; // b = 6, r1 = 105
		System.out.println("b="+b+", r1="+r1);
		
		int r2 = ++b + 100; // b = 7, r2 = 107
		System.out.println("b="+b+", r2="+r2);
		
		// ������ ++�� ���Թ� �� �������� ����, ��ġ�� ���� ���̰� ����
		// b++ ó�� ���� �����ʿ� ��ġ �� ������ �� ++�� ����
		// ++b ó�� ���� ���ʿ� ��ġ �� ++���� �� ������
		// ��ȣ�� ������ ��ȣ�켱
		
		int t = 3;
		int r = 5 / 7 + 10 % 2 - 3 + t++ * 2;
		System.out.println("t=" + t + ", r=" + r);
		
		// ��(����)������ ==, !=, >, <, >=, <=
		
		boolean r3 = b >= t; // true or false b=7, t=4
		System.out.println("r3="+r3);
		
		boolean r4 = a > b + t * 2; // a= 10, b=7, t=4 false
		System.out.println("r4="+r4);
		
		System.out.println("-----���м�-----");
		
		// �� ������ : &&(and), ||(or) *and�� or���� �켱
		// 1~100 ���̸� true, �ƴϸ� false�� ���� ��������
		// 1<= data <= 100
		
		int data = 50;
		
		boolean r5 = data>=1 && data<=100;
		System.out.println("r5="+r5);
		
		// ���׿����� : ���� = (���ǽ�)? �� : ���� ;
		// (���ǽ�)?A:B ���ǿ� ���� A�� B�� ����
		
		int x = 5;
		String r6 = (x%2==1)?"odd":"Even"; // Ȧ¦ �Ǻ���
		// String r6 = (x/2==x/2.0)?"Even":"Odd"; �� ����
		
		System.out.println("r6="+r6);
		
		// ¦���϶��� 100 ���ϰ� Ȧ���϶� -100 �ϱ�
		int r7 = (x%2==1)? x-100 : x*100 ;
		System.out.println("r7="+r7);
		
		// ��� : "positive:, ���� : "Negative:, 0 : "Zero"
		// ���׿����� �ȿ� ���׿����ڸ� ��밡��
		String r8 = (x>0) ? "Positive" : (x<0)? "Negative" : "Zero" ;
		System.out.println("r8="+r8);
		
		
	}

}
