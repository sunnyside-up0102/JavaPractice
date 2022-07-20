package page152_자료형개념의_클래스;

public class CarMain3 {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		
		
		for(int i=0;i<cars.length;i++) {
			cars[i] = new Car();
			cars[i].color = "White";
			cars[i].company= "대우";
			cars[i].type = "경차";
		}
	}

}
