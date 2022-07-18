import java.util.Random;

//1~9사이의 중복되지 않는 숫자 세 개를 맞히는 게임.
//숫자의 순서도 동일해야 함.
//컴퓨터가 3개의 중복되지 않은 랜덤 숫자를 만듬
//숫자가 들어있다면 ball,숫자가 들어있고 자리가 같다면 스트라이크
public class 수자야구게임 {

	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		String userNumStr;
		int[] comNum = new int[3];
		int[] userNum = new int[3];
		int inputNum = Integer.parseInt(userNumStr);
		userNum[0] = inputNum/100;
		userNum[1] = (inputNum);
		
		
		int i=0;
		
		while(i<3) {
			boolean insert =true;
		
		int randNum = rand.nextInt(9)+1 ; //1~9
		//System.out.println( rand.nextInt(9)+1);
		if(i>=1) {
			for(int idx = 0;idx<i;idx++) {
				if(comNum[idx]==randNum) {
					break;
				}
			}
			if(insert) {
				comNum[i] = randNum;
				i++;
			}
		}
		for(int e : comNum)
		System.out.print(e + " ");
		}
	}
}
