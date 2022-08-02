import java.util.Scanner;
import java.util.regex.Pattern;

public class 숫자야구게임_세자리제한 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exit;
		String userInput;
		
		do {
			System.out.print("숫자 입력 : ");
			userInput = scan.nextLine();
			exit = false;
			if(!Pattern.matches("^[1-9]{3}", userInput))
				System.out.println("1~9 사이의 숫자 세자리(백단위)를 확인하세요");
			else
				exit = true;
		}while(!exit);
		
		int[] userNum = new int[3];
		for(int i =0;i<userNum.length;i++)
			userNum[i] = (int)userInput.charAt(i) - '0';
		for(int i : userNum)
			System.out.print(i + " ");
	}

}
