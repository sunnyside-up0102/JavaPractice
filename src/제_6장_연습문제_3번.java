
public class ��_6��_��������_3�� {

	public static void main(String[] args) {
	
		int[] score = {90,80,60,100};
		
		int totalScore = 0;
		double avgScore = 0;
		
		for(int i=0;i<score.length;i++) {
			totalScore += score[i];
		}
		avgScore= (double)totalScore/score.length;
		
		
		System.out.println("�հ� ���� : "+ totalScore);
		System.out.println("��� ���� : "+ avgScore);
	}

}
