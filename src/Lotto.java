

public class Lotto {

	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		int idx = 0;
		while(true) {
			int number = (int)(Math.random()*45)+1;	//1부터 45까지
			
			boolean insert = true;
			for(int i=0;i<=idx;i++) {
				if(lotto[i]==number) {
					insert = false;	
					break;		//중복 제거하기
				}
			}
				if(insert==true) {
					lotto[idx] = number;
					idx++;
				}
				
				if(idx >=6) break;
			}
			
	}
}
