import java.util.Scanner;

//소문자 한개를 입력받아서 대문자로 변화 및 출력
//단 소문자가 아니면 재입력
public class 소문자를_대문자로 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char ch;
		
		do {
			System.out.println("소문자 입력 : ");
			ch = scan.nextLine().charAt(0);
		}while(ch<'a' || ch>'z');
		
		 ch-=('a'-'A');
		 System.out.println(ch);
	}
}
