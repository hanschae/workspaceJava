package pac;

public class Information {
	int num = 1234;
	protected String userid = "legochj";
	
	protected Information(){
		System.out.println("Information�� ������ �޼ҵ�");
	}
	
	String getUserid() {
		return userid;
	}
	public static Information getInstance() {
		return new Information();
	}
	
		
}
