import java.util.Scanner;

public class TwoNumSumAlone2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���� : ");
		int first = scan.nextInt();
		
		System.out.println("�ι�° ����");
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

