package page152_자료형개념의_클래스;

public class CarMain2 {

	public static void main(String[] args) {
		Car[] cars = new Car[3];
		Car tico = new Car();
		tico.color = "White";
		tico.company= "대우";
		tico.type = "경차";
		
		for(int i=0;i<cars.length;i++)
			cars[i] = tico;

	}

}
