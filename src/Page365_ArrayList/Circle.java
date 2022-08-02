package Page365_ArrayList;

public class Circle extends Shape {
	double r;
	
	Circle(){
		this(1);
	}
	Circle(double r){
		this.r =r;
	}
	
	@Override
	double area() {
		return Math.PI * Math.pow(r,2);
	}

	@Override
	double length() {
		return 2 * Math.PI * r;
	}

}
