import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		 FileReader fr = null;
		 BufferedReader br = null;
		 s
		 try {
			 fr = new FileReader("src/InputStreamEx.java");
			 br = new BufferedReader(fr);
			 
			 String txt = null;
			 while ((txt = br.readLine())!= null)
				 System.out.println(txt);
		 }
		 catch(IOException e) {}
		 
	}

}
