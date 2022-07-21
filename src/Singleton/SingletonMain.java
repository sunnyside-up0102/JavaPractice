package Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		//Singleton s= new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		s1.setX(100);
		System.out.println(s3.getX());
		}

}
