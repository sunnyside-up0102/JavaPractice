package Singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("��ü ����");
	}
	public static Singleton getInstance() {
		System.out.println("��ü ����");
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
