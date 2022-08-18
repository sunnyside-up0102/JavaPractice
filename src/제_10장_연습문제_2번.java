
public class 제_10장_연습문제_2번 {

	public static void main(String[] args) {
		Out out = new Out();
		System.out.println(new Out().new In().name);
	}

}

class Out{
	class In {
	 String name = "자바";
	}
}