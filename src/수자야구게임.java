import java.util.Random;

//1~9������ �ߺ����� �ʴ� ���� �� ���� ������ ����.
//������ ������ �����ؾ� ��.
//��ǻ�Ͱ� 3���� �ߺ����� ���� ���� ���ڸ� ����
//���ڰ� ����ִٸ� ball,���ڰ� ����ְ� �ڸ��� ���ٸ� ��Ʈ����ũ
public class ���ھ߱����� {

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
