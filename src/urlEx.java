import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class urlEx {

	public static void main(String[] args) throws Exception {
		try {
			URL url = new URL("https://sunnyside-up0102.github.io/sunnyside_blog/");
			System.out.println("authority : " + url.getAuthority());
			System.out.println("content : " + url.getContent());
			System.out.println("protocol : " + url.getProtocol());
			System.out.println("host : " + url.getHost());
			System.out.println("port : " + url.getPort());
			System.out.println("path : " + url.getPath());
			System.out.println("file : " + url.getFile());
			System.out.println("query : " + url.getQuery());
			
			int data =0;
			try {
				Reader is = new InputStreamReader(url.openStream());
				while ((data = is.read())!=-1);
				System.out.println((char)data);
				System.out.println();
			}
			catch(IOException e ){
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
