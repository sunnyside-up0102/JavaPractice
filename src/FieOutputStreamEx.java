import java.io.FileOutputStream;
import java.io.IOException;

public class FieOutputStreamEx {

	public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("test.txt",true);
		fos.write(65);
		fos.write(66);
		fos.write(67);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

}
