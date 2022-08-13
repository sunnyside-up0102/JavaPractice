
public class ThreadEx8 {

	public static void main(String[] args) {
//		Sum t1 = new Sum();
//		Sum t2 = new Sum();
		
		Sum r1 = new Sum();
		Sum r2 = new Sum();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start(); t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {}
		
		System.out.println("두 스레드의 sum 합계 = " + r1.sum + r2.sum);
		
	}

}

class Sum implements Runnable{
	int sum = 0;
	
	@Override
	public void run() {
	
		for(int i =1;i<=100;i++)
			sum+=i;
	}

}
