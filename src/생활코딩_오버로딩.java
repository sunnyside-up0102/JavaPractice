class CalculatorEx0813{
		int left,right;
		int third = 0;
		
		public void setOprands(int left,int right) {
			System.out.println("2개");
			this.left = left;
			this.right = right;
		}
		public void setOprands(int left,int right,int third) {
			this.setOprands(left, right);
			this.third = third;
		}
		public void sum() {
			System.out.println(this.left+ this.right+this.third);
		}
		public void avg() {
			System.out.println((this.left + this.right + this.third)/3);
		}
	}

public class 생활코딩_오버로딩 {
	
	public static void main(String[] args) {

		CalculatorEx0813 c1 = new CalculatorEx0813();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
	}

}
