package Page291_��������ǿ���Ŭ����;

import java.util.Scanner;

public class ExceptionEx8 {
	
	static String user_id = "Kwak";
	static String user_pw = "kwo123";
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("���̵� : ");
			String input_id = scan.nextLine();
			
			System.out.println("��й�ȣ : ");
			String input_sw = scan.nextLine();
			
			if(!user_id.equals(input_id))
				throw new LoginException("���̵� �ùٸ��� �ʾ�");
			else if(!user_pw.equals(input_pw))
				throw new LoginException("��й�ȣ�� �ùٸ��� �ʾ�");
			else 
				System.out.println("�α��� ���� ");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
