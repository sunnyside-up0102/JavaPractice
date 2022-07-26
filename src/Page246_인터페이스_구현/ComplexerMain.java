package Page246_인터페이스_구현;

public class ComplexerMain {

	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("010-1111-1222");
		com.receive("02-0123-5489");
		

	}

}
