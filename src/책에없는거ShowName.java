
public class 책에없는거ShowName {

	public static void main(String[] args) {
		Show show1 = new Show("홍길동");
		Show show2 = new Show("이순신");
		System.out.println(show1);
		System.out.println(show2);
	}
}
class Show{
	private String name;
	
	Show(String name){
		this.name = name;
	}
	//overriding
		public String toString() {
			return "학생이름 : " + this.name;
		}
}