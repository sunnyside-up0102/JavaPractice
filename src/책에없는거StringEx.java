import java.util.Scanner;

public class 책에없는거StringEx {

	public static void main(String[] args) {
//		//Scanner를 이용하여 한 글자 입력
		Scanner scan = new Scanner(System.in);
//		char ch = scan.nextLine().charAt(0);
//		scan.nextLine();	//입력 버퍼 초기화
		String oneMore;
		do {
		//숫자 야구 게임 중..
		
		String userData = scan.nextLine();
		int[] userNum = new int[3];
		userNum[0] = (int)userData.charAt(0)-'0';
		userNum[1] = (int)userData.charAt(1)-'0';
		userNum[2] = (int)userData.charAt(2)-'0';
		for(int i : userNum)
			System.out.println(i);
		System.out.print("한판더? Y");
		oneMore = scan.nextLine();
		
		}while(oneMore.startsWith("Y"));
	
	}
}
