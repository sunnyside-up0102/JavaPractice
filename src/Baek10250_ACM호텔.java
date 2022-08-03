import java.util.Scanner;

public class Baek10250_ACMÈ£ÅÚ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		int F = 0;
		int B = 0;
		
		for(int i = 0; i<T;i++) {
			for(int j = 0;j<3;j++) {
				int H = scan.nextInt();
				int M = scan.nextInt();
				int N = scan.nextInt();
				F = N%H;
				B = F+1;
				System.out.print(F);
				System.out.print(B);
			}
			
		}
	}

}
