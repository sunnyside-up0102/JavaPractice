import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ 1,������ 2, ���� 3 :");
		int user = scan.nextInt();
		int com;
		  for ( com=1; com<4; com++) {
		      System.out.println(Math.random());
		   }
		 int result = com - user;
		  
		switch (result) {
		case -1 :
			System.out.println("����� win");
			break;
		case 2 :
			System.out.println("����� win");
			break;
		case 1 :
			System.out.println("����� lose");
			break;
		case -2 :
			System.out.println("����� lose");
			break;
		default:
			System.out.println("����");
			break;
		}
		
	}
}
