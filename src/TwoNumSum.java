import java.util.Scanner;

public class TwoNumSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int first = scan.nextInt();
		
		System.out.print("두번째 정수 : ");
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
			
		System.out.println("합계 : " +sum);
	}

}
