
public class 제_7방_연습문제_9번 {

	public static void main(String[] args) {
		Exercise ex1 = Exercise.getInstance();
		Exercise ex2 = Exercise.getInstance();
		
		System.out.println("ex1 == ex2 : " + (ex1==ex2));
	}

}

class Exercise{
	private static Exercise instance = new Exercise();
	
	public static Exercise getInstance() {
		return instance;
	}
	private Exercise() {
		
	}
}