import java.util.Random;

public class ��_5��_��������_6�� {

	public static void main(String[] args) {
		
		
		int randNum;
		int count =0;
		do{
			randNum = (int)(Math.random()*6)+1;
			System.out.println("( " + randNum + " )");
			count ++;
		}while(randNum !=6);
		System.out.println("�õ� ȸ���� " + count);
	}

}
