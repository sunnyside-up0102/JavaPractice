import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("������ �� �� : ");
		int dan = key.nextInt();
		
		for(int su =1;su<=9;su++)
			System.out.println(dan+ " x " + su + "=" + dan*su);

	}

}
