
public class ThreadEx4 {

	public static void main(String[] args) {
	Thread t1 = new Thread(()->{
		System.out.println("t1 ������ ����");
		for(int i =0;i<50;i++) {
			System.out.println("t1 : " + i);
		}
	});
	

	Thread t2 = new Thread(()->{
		System.out.println("t2 ������ ����");
		for(int i =0;i<50;i++) {
			System.out.println("t2 : " + i);
		}
	});
	t1.setPriority(7);
	t2.setPriority(7);
	
	
	t1.start();
	t2.start();
	}

}
