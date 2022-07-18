import java.util.Scanner;

public class º°Âï±â3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("º° : ");
		int count = scan.nextInt();
		
		for(int i=1;i<=count;i++) {
			
			for(int j=count-i;j>0;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}
}
