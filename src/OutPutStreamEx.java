import java.io.IOException;
import java.io.OutputStream;

public class OutPutStreamEx {

	public static void main(String[] args) {
		OutputStream out = System.out;
		try{
			out.write('a');
			out.write('b');
			out.write('c');
			out.write('1');
			out.write('1');
			out.write('µð');
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	
	
	}

}
