import java.util.Scanner;

public class 가변길이_배열 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int[] arrInt = null;
		int num;
		
		do {
			System.out.print("자료" + i + ":");
			num = scan.nextInt();
			if(i<=1)
				arrInt = new int[i];
			else {
				int[] arrTmp = arrInt;
				arrInt = new int[i];
				System.arraycopy(arrTmp, 0, arrInt, 0, arrTmp.length);
			}
			arrInt[i-1] = num;
			i++;
		}while(num >= 1);
		for(int e : arrInt)
			System.out.print(e + " ");
	}
}
