package page152_자료형개념의_클래스;

import java.util.Random;

public class CarMain4 {

	public static void main(String[] args) {
		Random rand = new Random();
		Car[] cars = new Car[3];
		
		String[] color = {"흰색", "검정색","회색","빨간색","노란색","파란색"};
		String[] company = {"대우","현대","기아","BMW","도요타","볼보","포드"};
		String[] type = {"승용차","화물차","승합차","중형","대형","경차"};
		
		for(int i=0;i<cars.length;i++) {
			cars[i] = new Car();
			int randNum = rand.nextInt(color.length -1);
			cars[i].color = color[randNum];
			randNum = rand.nextInt(company.length -1);
			cars[i].company = company[randNum];
			randNum = rand.nextInt(type.length -1);
			cars[i].type = type[randNum];
		}
		for(Car car : cars)
			System.out.println(car.color + "/" + car.company + "/" + car.type);
	}

}
