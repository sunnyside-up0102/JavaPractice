
public class ToStringEx {

	public static void main(String[] args) {
		Fruit f = new Fruit("사과","빨강");
		System.out.println(f);
	}
}
class Fruit{
	String name;
	String color;
	Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	//overriding
	public String toString() {
		return "과일이름 : " + this.name + "\n과일색상 : " + this.color;
	}
}
