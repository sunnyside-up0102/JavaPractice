import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ 1,������ 2, ���� 3 :");
		int user = scan.nextInt();
		int com;
		com = (int) (Math.random() * 2) + 1;
		System.out.println("��ǻ�ʹ�"+(int) (Math.random() * 2) + 1);
		
		int result = com - user;
		switch (result) {
		case -1 :
			System.out.println("����� win");
			break;
		case 2 :
			System.out.println("����� win");
			break;
		case 1 :
			System.out.println("����� lose");
			break;
		case -2 :
			System.out.println("����� lose");
			break;
		default:
			System.out.println("����");
			break;
		}
		
	}
}
