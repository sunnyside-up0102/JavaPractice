
public class 제_6장_연습문제_4번 {

	public static void main(String[] args) {
		
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		int[] num2 = new int [10];
		int multi;
		for(int i=0;i<10;i++) {
		 num2[i] = num1[i] * num1[i];
		}
		for(int i=0;i<num2.length;i++)
			System.out.println(num2[i]);
	}

}
