package ��_9��_��������_4��;

interface Tv {
	void turnOn();
}
public class Exercise4 {

	public static void main(String[] args) {
		Tv tv = new Tv() {

			@Override
			public void turnOn() {
				System.out.println("tv�� �մϴ�");
				
			}
			
		};
		tv.turnOn();
	}
}