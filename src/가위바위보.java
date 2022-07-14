import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가위는 1,바위는 2, 보는 3 :");
		int user = scan.nextInt();
		int com;
		com = (int) (Math.random() * 2) + 1;
		System.out.println("컴퓨터는"+(int) (Math.random() * 2) + 1);
		
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
