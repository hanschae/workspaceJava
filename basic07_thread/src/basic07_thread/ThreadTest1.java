package basic07_thread;
// Thread Ŭ������ �̿��� ������ ����
// Thread Ŭ������ ��ӹް� ������ ó���� �ʿ��� run()�� �������̵��ϸ�
// �ڹٰ���ӽ��� �����彺���췯�� ������ �����Ѵ�
public class ThreadTest1 extends Thread{
	String threadName;
	public ThreadTest1() {
		
	}
	public ThreadTest1(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		for(int i=1; ;i++) {
			System.out.println(threadName+"->"+i);
		}
	}
	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1("ù��° ������");
		ThreadTest1 t2 = new ThreadTest1("�ι�° ������");
		
		//t1.thread_method();
		//t2.thread_method();
		
		//run()�޼ҵ�� start()�޼ҵ带 �̿��Ͽ� ȣ�Ⱑ���ϴ�
		t1.start();
		t2.start();
		
	}

}
