import java.util.Scanner;

public class ����3���Է¹ް�_����_��_��� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int first = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		int second = scan.nextInt();
		System.out.print("����° ���� : ");
		int third = scan.nextInt();
		
		int sum = 0;
		while(first >=0 && first <=100 &&
				second >=0 && second <=100&&
				third >=0 && third <=100)
			System.out.println(first + second + third);
			System.out.println((first+second+third)/3);
	}

}
