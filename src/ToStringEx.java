
public class ToStringEx {

	public static void main(String[] args) {
		Fruit f = new Fruit("���","����");
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
		return "�����̸� : " + this.name + "\n���ϻ��� : " + this.color;
	}
}
