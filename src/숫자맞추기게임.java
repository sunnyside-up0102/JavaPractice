import java.util.Random;
import java.util.Scanner;
//1~100������ ������ ���ڸ� ������ ����
//10ȸ �̻� Ʋ���� ���� �˷��ְ� ���� 				------> �ٽ� �غ���
//������ ������ �ѹ� �� ����� �����ϱ�
//~���� ������ ��� �ߴµ� �� ū�� �Է½� count�ƴ� 	------> �ٽ� �غ���
public class ���ڸ��߱���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());//random seed ����
		
		//for(int i=1;i<20;i++)
		//System.out.println(rand.nextInt(10)); 10�̸����� ����
		char oneMore = 0;
		do {
		int comNum = rand.nextInt(100) + 1; //1���� 100����
		System.out.println("���� : "+ comNum); 			
		
		int userNum = 0;
		int count=0;
		
	
			do {
					do {
						System.out.print("1~100���� �Է� : ");
						userNum = scan.nextInt();
						scan.nextLine();//�Է¹��� ���� = flushing
					}while(userNum<1 || userNum>100);
				
				if(userNum>comNum){
					System.out.println("�� ���� ���� �Է��ϼ���");
					count++;
				}
				else if(userNum<comNum) {
					System.out.println("�� ū ���� �Է��ϼ���");
					count++;
				}
				else
					System.out.println("�����Դϴ�!\n �õ� ȸ����"+ count + "��");
				
			}while(userNum != comNum);
				System.out.print("�ѹ���?(Y/N) : ");
				oneMore = scan.nextLine().charAt(0);
				
		}while(oneMore =='Y');
	}
}
