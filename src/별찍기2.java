import java.util.Scanner;

public class �����2 {

	public static void main(String[] args) {
		System.out.print("�� �� : ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
