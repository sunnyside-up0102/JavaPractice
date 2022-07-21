package This_constructor;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("중형차");
		Car car3 = new Car("현대","대형차");
		Car car4 = new Car("black","기아","화물차");
		
		System.out.println("car1 = " + car1);
		System.out.println("car2 = " + car2);
		System.out.println("car3 = " + car3);
		System.out.println("car4 = " + car4);
	}

}
