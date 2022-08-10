package Page456_°´Ã¼Á¤·Ä;

public class Circle extends Shape {
	
	double r;
	
	public Circle() {
		this(1);
	}
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	double area() {
		return (Math.PI *Math.pow(r, 2));
	}

	@Override
	double length() {
		return 2*Math.PI * r;
	}

}
