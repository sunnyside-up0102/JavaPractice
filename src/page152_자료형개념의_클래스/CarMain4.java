package page152_�ڷ���������_Ŭ����;

import java.util.Random;

public class CarMain4 {

	public static void main(String[] args) {
		Random rand = new Random();
		Car[] cars = new Car[3];
		
		String[] color = {"���", "������","ȸ��","������","�����","�Ķ���"};
		String[] company = {"���","����","���","BMW","����Ÿ","����","����"};
		String[] type = {"�¿���","ȭ����","������","����","����","����"};
		
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
