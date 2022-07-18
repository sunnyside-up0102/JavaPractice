
public class 제_5장_연습문제_2번 {

	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenSum += i;
			}
			if(i%2==1) {
				oddSum+=i;
			}
		}
		System.out.println("짝수 합:" + evenSum);
		System.out.println("홀수 합:" + oddSum);
	}

}
