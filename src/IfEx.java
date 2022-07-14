import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = keyboard.nextInt();
		
		//System.out.println("입력한 숫자는 : " + num);
		
		//삼항연산자
		//String result = num % 2 == 1 ? "홀수" : "짝수";
		//System.out.println(result);
		
		//if함수
		
		if(num %2==1) 
			System.out.println("홀수");
		else
			System.out.println("짝수");
	}

}
