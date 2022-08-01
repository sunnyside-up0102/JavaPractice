class Round{
	double result;
	Round(double num, int digit){
		long digitNum = 1;
		for(int i=1;i<=digit;i++)
			digitNum *=10;
		this.result = Math.round(num*digitNum) / (double)digitNum;
	}
	double getResult() {
		return this.result;
	}
}
public class RoundEx {

	public static void main(String[] args) {
		double v1 = Math.PI * 1000;
		double v2 = Math.round(v1);
		double v3 = v2 / 1000d;
		System.out.println(v3);
		
		System.out.println(new Round(Math.PI,3).result);
	}
}
