package Page456_°´Ã¼Á¤·Ä;

public class Rectangle extends Shape {
	
	int w,h;
	
	public Rectangle() {
		this(1,1);
	}
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	double area() {
		return (w*h);
	}

	@Override
	double length() {
		return (w+h) * 2;
	}

}
