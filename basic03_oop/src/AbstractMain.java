// �߻�Ŭ������ �ݵ�� ��ӹ޾� �߻�޼ҵ带 �������̵��Ͽ� ����Ͽ��� �Ѵ�
public class AbstractMain extends AbstractTest{

	AbstractMain(){}	
	
	// �߻�޼ҵ� �������̵�(�޼ҵ� ������)
	
	void output() {
		System.out.println("��ȣ="+num);
		System.out.println("�̸�="+name);
	}
	void getName() {}
	
	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		am.output();
		

	}

}
