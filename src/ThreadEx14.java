
public class ThreadEx14 {

	public static void main(String[] args) {
	Account acc = new Account();
	
	Parent p = new Parent(acc);
	Child c = new Child(acc);
	
	p.start();
	c.start();
	
	try {
		Thread.sleep(5000);
	}catch (InterruptedException e) {}
	
	c.interrupt();
	p.interrupt();
	}
}
class Account {
	int money;
	synchronized void withdraw() {
		while(money == 0) {
			try {
				wait();
			}catch(InterruptedException e) {
				break;
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName()+money+"원 출금");
		money = 0;
	}
	
	synchronized void deposit() {
		while(money>0) {
			try {
				wait();
			}catch(InterruptedException e) {
				break;
			}
		}
		System.out.println();money = (int)(Math.random()*5+1)*100000;
		System.out.println(Thread.currentThread().getName() + money + "원 입금");
		notifyAll();
	}
}

