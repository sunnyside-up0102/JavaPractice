import java.util.Scanner;

public class ���ٿ�������0 {
	static Scanner scan = null;
	static int start,finish,sum = 0;
	static double median;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("���� ���� : ");
		start = scan.nextInt();
		System.out.print("�� ���� : ");
		finish = scan.nextInt();
		
		median = (start + finish) / 2.0;
		
		Runnable run1 = () -> {
			for(int i =start;i<(int)median;i++) {
				sum+=i;
				System.out.printf("run1 : i = %d,sum1 = %d%n",i,sum);
			}
		};
		
		Runnable run2 = () -> {
			for(int i =(int)median;i<finish;i++) {
				sum+=i;
				System.out.printf("run2 : i = %d,sum2 = %d%n",i,sum);
			}
		};
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run1);
		t1.start();
		t2.start();
	}

}
