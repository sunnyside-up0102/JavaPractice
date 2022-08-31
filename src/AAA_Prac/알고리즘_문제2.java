package AAA_Prac;

import java.util.Scanner;

public class 알고리즘_문제2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] inputNum= new int[10];
		for(int i = 0 ; i<inputNum.length;i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] index = new int[10];
		for(int i =0;i<index.length;i++) {
			index[inputNum[i]]++;
		}
		int modeNum = 0;
		int modeCnt = 0;
		
		for(int i=0;i<index.length;i++) {
			if(modeCnt < index[i]) {
				modeCnt = index[i];
				modeNum = i;
			}
		}
		System.out.println("최빈수는 " +  modeNum + "최빈수가 나온 횟수는 " + modeCnt);
	}

}
