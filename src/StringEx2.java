
public class StringEx2 {

	public static void main(String[] args) {
		String text = "Hello World";
		
		System.out.println("��ĭ ã�� : ");
		for(int i =0; i<text.length();i++) {
			if(text.charAt(i) == ' ') {
				System.out.println("��ĭ �߰�" + i);
			}
		}

	}

}
