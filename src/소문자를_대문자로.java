import java.util.Scanner;

//�ҹ��� �Ѱ��� �Է¹޾Ƽ� �빮�ڷ� ��ȭ �� ���
//�� �ҹ��ڰ� �ƴϸ� ���Է�
public class �ҹ��ڸ�_�빮�ڷ� {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char ch;
		
		do {
			System.out.println("�ҹ��� �Է� : ");
			ch = scan.nextLine().charAt(0);
		}while(ch<'a' || ch>'z');
		
		 ch-=('a'-'A');
		 System.out.println(ch);
	}
}
