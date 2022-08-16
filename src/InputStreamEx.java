import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
			System.out.print("ют╥б : ");
			int data = 0;
			InputStream in = System.in;
			while((data = in.read()) != -1)
				System.out.print((char)data);
		}
		catch(IOException e) {}
	}

}
