package Page232_객체를_배열로;

public abstract class Animal {
	String type;
	String name;
	
	Animal(String type,String name){
		this.type = type;
		this.name = name;
	}
	abstract void sleep();
		
}
