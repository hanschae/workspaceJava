// interface Ŭ������ Ȱ���ϱ� ���ؼ��� implements Ű����� �������̽��� ��ӹ޴´�
// �������̽��� �������� ��ӹ��� �� �ִ�
// �������̽����� �������̽��� ��ӹ������� extends Ű����� ����Ѵ� (1����)
// ��ӹ��� ��� �߻�޼ҵ�� �������̵��� �Ǿ���Ѵ�
public class InterfaceMain implements InterfaceTest, InterfaceBoard {

	public InterfaceMain() {	}

	@Override
	public void write() {
		System.out.println("�Խ��� �۾���");
	}

	@Override
	public void show() {
		System.out.println("�۳��뺸��");
		
	}

	@Override
	public int getName() {
		// TODO Auto-generated method stub
		return MAX;
	}
	
	@Override
	public void edit() {
		System.out.println("�����ϱ�");
	}
	
	public static void main(String args[]) {
		InterfaceMain im = new InterfaceMain();
		im.write();
		System.out.println(im.getName());
		System.out.println(im.MAX);
		System.out.println(InterfaceTest.MAX);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

}
