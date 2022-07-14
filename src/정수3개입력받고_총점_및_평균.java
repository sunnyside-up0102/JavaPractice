import java.util.Scanner;

public class 정수3개입력받고_총점_및_평균 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int first = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int second = scan.nextInt();
		System.out.print("세번째 정수 : ");
		int third = scan.nextInt();
		
		int sum = 0;
		while(first >=0 && first <=100 &&
				second >=0 && second <=100&&
				third >=0 && third <=100)
			System.out.println(first + second + third);
			System.out.println((first+second+third)/3);
	}

}
