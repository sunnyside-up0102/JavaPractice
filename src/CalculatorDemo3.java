
public class CalculatorDemo3 {

	
	class Calculator3 {
		public static void sum(int left,int right) {
			System.out.println(left+right);
		}
		
		public static void avg(int left,int right) {
			System.out.println((left+right)/2);
		}
	}
	public static void main(String[] args) {
		Calculator3.sum(10, 20);
		Calculator3.avg(10,20);
	}

}
