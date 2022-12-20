package basic07_thread;

public class SynchronizerTest {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		mother.start();
		son.start();
	}

}

class ATM implements Runnable{
	private int money = 10000;
	// ������ �޼ҵ� ����ȭ : synchronized
	//public synchronized void run() { // 1�����
	public void run() {
		synchronized (this) { // 2�����
			for(int i=1; i<=7; i++) {
				try {Thread.sleep(100);}catch(Exception e) {}
					getCash(1000);
			}
		}
	}
	public void getCash(int howMuch) {
		if(money>0) {
			money -= howMuch;
			//										����������� ������ ��ü�� �������
			System.out.printf("%s-> �ܾ���%d���Դϴ�.\n", Thread.currentThread().getName(), getMoney());
			
		}else {
			//������ �ߴ�
			try {
				this.wait(); // ���� �������� ������ ����
			}catch(Exception e) {}
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
	
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}