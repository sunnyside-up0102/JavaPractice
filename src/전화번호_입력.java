import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ��ȭ��ȣ_�Է� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pattern pat;
		Matcher m;
		pat = Pattern.compile("(01[0|6|7|8|9])-(\\d{3,4})-(\\d{4})");
		do {
			System.out.print("�ڵ��� ��ȣ : ");
			String phoneNum = scan.nextLine();
			m = pat.matcher(phoneNum);
			if(!m.matches())
				System.out.println("�ٽ� �Է�");
		}while(!m.matches());
		System.out.println("�Է¿Ϸ�");
	}

}
