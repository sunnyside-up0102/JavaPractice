import java.util.Random;

public class 제_5장_연습문제_6번 {

	public static void main(String[] args) {
		
		
		int randNum;
		int count =0;
		do{
			randNum = (int)(Math.random()*6)+1;
			System.out.println("( " + randNum + " )");
			count ++;
		}while(randNum !=6);
		System.out.println("시도 회수는 " + count);
	}

}
