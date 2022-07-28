package Page291_사용자정의예외클래스;

import java.util.Scanner;

public class ExceptionEx8 {
	
	static String user_id = "Kwak";
	static String user_pw = "kwo123";
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디 : ");
			String input_id = scan.nextLine();
			
			System.out.println("비밀번호 : ");
			String input_sw = scan.nextLine();
			
			if(!user_id.equals(input_id))
				throw new LoginException("아이디가 올바르지 않아");
			else if(!user_pw.equals(input_pw))
				throw new LoginException("비밀번호가 올바르지 않아");
			else 
				System.out.println("로그인 성공 ");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
