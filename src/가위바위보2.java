import java.util.Random;
import java.util.Scanner;

public class ����������2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		//���� : 1, ���� : 2, �� : 3
		int comHand = rand.nextInt(1,4);	//1�̻� 4�̸�
		String [] hand = {"����","����","��"};
		System.out.println("��ǻ�� : "+ hand[comHand-1]);	//test
		System.out.print("�����ϼ��� (���� = 1,����=2,��=3) : ");
		
		int userHand = scan.nextInt();
		
		switch (comHand - userHand) {
		case 1: case -2:
			System.out.println("��ǻ�Ͱ� �̱�");
			break;
		case -1 : case 2:
			System.out.println("����� �̱�");
			break;
		default :
			System.out.println("���");
			break;
		}
	}

}
