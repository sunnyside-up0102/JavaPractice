import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {

	public static void main(String[] args) {
		//�ҹ��� b�� �����ϴ� ���ĺ� �ҹ��� 0�� �̻� ��Ģ
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
