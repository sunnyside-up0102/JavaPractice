import java.util.Scanner;

public class TwoNumSumAlone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù : ");
		int first = scan.nextInt();
		
		System.out.println("�� : ");
		int last = scan.nextInt();
		int sum = 0;
		
		
	
		
		for(int i=first;i<=last;i++) {
			sum += i;
		}
		
		System.out.println("�� : " + sum);
	}
}

