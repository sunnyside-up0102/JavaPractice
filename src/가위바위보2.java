import java.util.Random;
import java.util.Scanner;

public class 가위바위보2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		//가위 : 1, 바위 : 2, 보 : 3
		int comHand = rand.nextInt(1,4);	//1이상 4미만
		String [] hand = {"가위","바위","보"};
		System.out.println("컴퓨터 : "+ hand[comHand-1]);	//test
		System.out.print("선택하세요 (가위 = 1,바위=2,보=3) : ");
		
		int userHand = scan.nextInt();
		
		switch (comHand - userHand) {
		case 1: case -2:
			System.out.println("컴퓨터가 이김");
			break;
		case -1 : case 2:
			System.out.println("사람이 이김");
			break;
		default :
			System.out.println("비김");
			break;
		}
	}

}
