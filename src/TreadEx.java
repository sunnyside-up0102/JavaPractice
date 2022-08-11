
public class TreadEx {

	public static void main(String[] args) {
		ThreadExtend t1 = new ThreadExtend();
		Runnable r = new RunnableImple();
		Thread t2  = new Thread();
		t1.start();
		t2.start();
	}

}
class RunnableImple implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable 惑加 罐绰 规过");
		for( int i = 0 ;i<50;i++)
			System.out.println("RunnableImple" + i);
}
	
class ThreadExtend extends Thread{

	@Override
	public void run() {
		System.out.println("Thread 惑加 罐绰 规过");
		for( int i = 0 ;i<50;i++)
			System.out.println("ThreadExtend" + i);
	
	
	}
	
}