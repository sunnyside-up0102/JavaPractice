package This_constructor;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("������");
		Car car3 = new Car("����","������");
		Car car4 = new Car("black","���","ȭ����");
		
		System.out.println("car1 = " + car1);
		System.out.println("car2 = " + car2);
		System.out.println("car3 = " + car3);
		System.out.println("car4 = " + car4);
	}

}
