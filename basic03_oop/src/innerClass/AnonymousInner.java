package innerClass;

public class AnonymousInner {

	public AnonymousInner() {
		// ����
		Student s = new Student () {
			//�������̵�
			@Override
			public void studentOutput() {
				System.out.println("no="+no);
				System.out.println("name="+name);
				System.out.println("grade="+grade);
				
			}
		};
	
		s.studentOutput();
	}
	
	public static void main(String[] args) {
		new AnonymousInner();

	}

}
