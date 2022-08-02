import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 전화번호_입력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pattern pat;
		Matcher m;
		pat = Pattern.compile("(01[0|6|7|8|9])-(\\d{3,4})-(\\d{4})");
		do {
			System.out.print("핸드폰 번호 : ");
			String phoneNum = scan.nextLine();
			m = pat.matcher(phoneNum);
			if(!m.matches())
				System.out.println("다시 입력");
		}while(!m.matches());
		System.out.println("입력완료");
	}

}
