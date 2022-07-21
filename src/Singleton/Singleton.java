package Singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("按眉 积己");
	}
	public static Singleton getInstance() {
		System.out.println("按眉 府畔");
		return instance;
	}
	
	private int x;
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
}
