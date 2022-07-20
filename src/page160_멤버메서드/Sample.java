package page160_멤버메서드;

class Test{
	private int memVar;
	public void memMethod() {
		System.out.println("Test 클래스의 멤버 메서드");
	}
	public void setmemVar(int val) {	//setter function
		memVar = val;
	}
	public int getMemVar() {
		return memVar;
	}
}

public class Sample {

	public static void main(String[] args) {
		Test test = new Test();
		test.memMethod();
		
		test.setmemVar(10);
		System.out.println(test.getMemVar());
	}

}
