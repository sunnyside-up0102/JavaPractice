import java.util.Scanner;

public class å�����°�StringEx {

	public static void main(String[] args) {
//		//Scanner�� �̿��Ͽ� �� ���� �Է�
		Scanner scan = new Scanner(System.in);
//		char ch = scan.nextLine().charAt(0);
//		scan.nextLine();	//�Է� ���� �ʱ�ȭ
		String oneMore;
		do {
		//���� �߱� ���� ��..
		
		String userData = scan.nextLine();
		int[] userNum = new int[3];
		userNum[0] = (int)userData.charAt(0)-'0';
		userNum[1] = (int)userData.charAt(1)-'0';
		userNum[2] = (int)userData.charAt(2)-'0';
		for(int i : userNum)
			System.out.println(i);
		System.out.print("���Ǵ�? Y");
		oneMore = scan.nextLine();
		
		}while(oneMore.startsWith("Y"));
	
	}
}
