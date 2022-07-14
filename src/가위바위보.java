import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위는 1,바위는 2, 보는 3 :");
		int user = scan.nextInt();
		int com;
		  for ( com=1; com<4; com++) {
		      System.out.println(Math.random());
		   }
		 int result = com - user;
		  
		switch (result) {
		case -1 :
			System.out.println("사용자 win");
			break;
		case 2 :
			System.out.println("사용자 win");
			break;
		case 1 :
			System.out.println("사용자 lose");
			break;
		case -2 :
			System.out.println("사용자 lose");
			break;
		default:
			System.out.println("동점");
			break;
		}
		
	}
}
