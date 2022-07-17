import java.util.Scanner;

public class TwoNumSumAlone2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 : ");
		int first = scan.nextInt();
		
		System.out.println("두번째 숫자");
		int last = scan.nextInt();
		
		
		if(first > last) {
			int temp = last;
			last = first;
			first = temp;
		}
		
		int sum = 0;
		
		for(int i=first;i<=last;i++)
		{
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}

