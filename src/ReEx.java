import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {

	public static void main(String[] args) {
		//소문자 b로 시작하는 알파벳 소문자 0개 이상 규칙
		Pattern p = Pattern.compile("b[a-z]?[a-z]?");
		Matcher m;
		
		m = p.matcher("bat");
		System.out.println("bat = " + m.matches());
		
		m = p.matcher("cat");
		System.out.println("cat = " + m.matches());
		
		m = p.matcher("bed");
		System.out.println("bed = " + m.matches());
		
		m = p.matcher("ba");
		System.out.println("ba = " + m.matches());
	}

}
