
public class For03 {

	public static void main(String[] args) {
		
		// break : �ݺ����� ������ ������Ų��.
		
		for(int i=1;;i++) {
			System.out.println(i);
			if(i>=10) {
				break;
			}
		}
		
		System.out.println("--------------------");
		
		// continue : �ݺ������� ���๮�� �ѹ� �ǳʶڴ�.
		
		for(int i=1;i<=100;i++) {
			if(i>=10) {
				continue;
			}
			System.out.println(i);
			
		}
	}
}

