package Page456_°´Ã¼Á¤·Ä;

public abstract class Shape implements Comparable<Shape>{
	int x,y;
	
	Shape(){
		this(0,0);
	}
	Shape(int x,int y){
		this.x =x;
		this.y = y;
	}
	abstract double area();
	abstract double length();
	
	public String getLocation() {
		return "x : " + x  + "y : " + y;
	}
	@Override
	public int compareTo(Shape o) {
		return (int)(this.area() -o.area());
	}
	@Override
	public String toString() {
		return "³ĞÀÌ : "+this.area();
	}
	
}
