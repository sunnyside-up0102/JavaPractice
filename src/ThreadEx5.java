
public class ThreadEx5 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					int i =1;
					while(true) {
						System.out.println("t1 : " + i);
						Thread.sleep(1000);
						i++;
					}
				}
				catch(InterruptedException e) {
					System.out.println("Interrupt ��ȣ�� �����ߴ�");
				}
				System.out.println("������ ���� ����");
			}
		});
		t1.start();
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){}
		t1.interrupt();
	}

}
