import java.util.Scanner;
import java.util.regex.Pattern;

public class ���ھ߱�����_���ڸ����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exit;
		String userInput;
		
		do {
			System.out.print("���� �Է� : ");
			userInput = scan.nextLine();
			exit = false;
			if(!Pattern.matches("^[1-9]{3}", userInput))
				System.out.println("1~9 ������ ���� ���ڸ�(�����)�� Ȯ���ϼ���");
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
