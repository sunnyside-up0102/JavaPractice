import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("구구단 몇 단 : ");
		int dan = key.nextInt();
		
		for(int su =1;su<=9;su++)
			System.out.println(dan+ " x " + su + "=" + dan*su);

	}

}
