package page160_����޼���;

class Test{
	private int memVar;
	public void memMethod() {
		System.out.println("Test Ŭ������ ��� �޼���");
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
