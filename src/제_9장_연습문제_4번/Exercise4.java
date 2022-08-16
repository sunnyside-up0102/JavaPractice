package 제_9장_연습문제_4번;

interface Tv {
	void turnOn();
}
public class Exercise4 {

	public static void main(String[] args) {
		Tv tv = new Tv() {

			@Override
			public void turnOn() {
				System.out.println("tv를 켭니다");
				
			}
			
		};
		tv.turnOn();
	}
}