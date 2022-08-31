
public class StringEx2 {

	public static void main(String[] args) {
		String text = "Hello World";
		
		System.out.println("ºóÄ­ Ã£±â : ");
		for(int i =0; i<text.length();i++) {
			if(text.charAt(i) == ' ') {
				System.out.println("ºóÄ­ ¹ß°ß" + i);
			}
		}

	}

}
