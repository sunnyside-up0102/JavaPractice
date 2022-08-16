
public class ThreadEx13 {

	public static void main(String[] args) {
		
		ThreadGroup = new ThreadGroup("Group 1");
		MyThread t1 = new MyThread(group, "First");
		MyThread t2 = new MyThread(group, "First");
		MyThread t3 = new MyThread(group, "First");
	
	t1.start();
	t2.start();
	t3.start();
	
	try {
		Thread.sleep(3000);
	}
	catch(InterruptedException e) {}
}
}

class MyThread extends Thread{
	MyThread(ThreadGroup group,String name){
		super(group,name);
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(getName() + "Interrupt 발생");
				break;
			}
		}
		System.out.println(getName() + "종료");
	}
	
}