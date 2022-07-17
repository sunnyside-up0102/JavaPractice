import java.util.Scanner;

public class a_to_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		
		do {
			System.out.print("소문자 입력 : ");
			ch = scan.nextLine().charAt(0);
		}while(ch < 'a' ||ch > 'z');	
		ch-=('a'-'A');
		System.out.println(ch);

	}

}
