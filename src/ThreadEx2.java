
public class ThreadEx2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("t1 ������ ����");
				for(int i=0;i<50;i++) {
					System.out.println("t1 : " + i);
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("t2 ������ ����");
				for(int i=0;i<50;i++) {
					System.out.println("t1 : " + i);}
				
			}
			
		});
		t1.start();
		t2.start();
	}

}
