
public class 제_5장_연습문제_1번 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				sum+=i;
			}
		}
			
		System.out.println("5의 배수의 합계는 : "+ sum);
	}

}
