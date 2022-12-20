package basic07_thread;
// Runnable Ŭ������ �̿��� ������ ����
// Runnable �������̽��� ��ӹް� ������ ó���� �ʿ��� run()�� �������̵��ϸ�
// �ڹٰ���ӽ��� �����彺���췯�� ������ �����Ѵ�
public class ThreadTest2 extends Thread{
	String threadName;
	public ThreadTest2() {
		
	}
	public ThreadTest2(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		for(int i=1; ;i++) {
			System.out.println(threadName+"->"+i);
			try {
			Thread.sleep(1000); // ������ �и��ʸ�ŭ
			}catch(InterruptedException ie) {}
			
		}
	}
	public static void main(String[] args) {
		ThreadTest2 t1 = new ThreadTest2("first��° ������");
		ThreadTest2 t2 = new ThreadTest2("second��° ������");
		
		// �������̽��� ��ӹ����� �߻�޼ҵ��̱� ������ Thread��ü�� �����
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		
		obj1.start();
		obj2.start();
		
	}

}
