package Page229_abstract;

abstract class Shape {
	String type;
	Shape(String type){
		this.type = type;
	}
	abstract double area();
	abstract double length();
}

class Circle extends Shape{
	int r;
	Circle(int r){
		super("��");	//�ݵ�� ù�ٿ� �Է��ؾ��Ѵ�. //super�� �θ��� ������ ȣ��
		this.r = r;
	}
	@Override
	double area() {
		return Math.PI * Math.pow(r, 2);
	}
	
	@Override
	double length() {
		return 2*Math.PI*this.r;
	}
	
	public String toString() {
		return "Shape [ type = " + type +r ;
	}
	
	
}
class Rectangle extends Shape {
	int width,height;
	Rectangle(int width,int height){
		super("�簢��");	//�ݵ�� ù�ٿ� �Է��ؾ��Ѵ�. //super�� �θ��� ������ ȣ��
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width * height;
	}
	
	@Override
	double length() {
		return 2 * (width + height);
	}
	
	public String toString() {
		return "Shape [ type = " + type +",width =" + width + " " + height + "]";
	}
}

public class ShapeEx {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
		
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("���� : " + s.area() + "�ѷ� : " + s.length());
		}
		
		

	}

}
