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
		super("원");	//반드시 첫줄에 입력해야한다. //super는 부모의 생성자 호출
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
		super("사각형");	//반드시 첫줄에 입력해야한다. //super는 부모의 생성자 호출
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
			System.out.println("넓이 : " + s.area() + "둘레 : " + s.length());
		}
		
		

	}

}
