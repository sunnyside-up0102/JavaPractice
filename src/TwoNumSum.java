import java.util.Scanner;

public class TwoNumSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int first = scan.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int last = scan.nextInt();
		
		if(first > last) {
			int tmp;
			tmp =first;
			first = last;
			last = tmp;
			
		}
		
		int sum = 0;
		
		for(int i = first; i <=last;i++) {
			sum += i;
		}
			
		System.out.println("�հ� : " +sum);
	}

}
