package AAA_Prac;

import java.util.Scanner;

public class �˰���_����2 {

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
		System.out.println("�ֺ���� " +  modeNum + "�ֺ���� ���� Ƚ���� " + modeCnt);
	}

}
