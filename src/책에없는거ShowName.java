
public class å�����°�ShowName {

	public static void main(String[] args) {
		Show show1 = new Show("ȫ�浿");
		Show show2 = new Show("�̼���");
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
			return "�л��̸� : " + this.name;
		}
}