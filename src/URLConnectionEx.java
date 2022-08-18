import java.net.URL;
import java.net.URLConnection;


public class URLConnectionEx {

	public static void main(String[] args) {

		URL url = null;
		String address =
				"https://sunnyside-up0102.github.io/sunnyside_blog/";
				try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			System.out.println("conn.toString()" + conn);
			System.out.println("getAllowUserInteraction()" + conn.getAllowUserInteraction());
			System.out.println("getConnectTimeOut() :" + conn.getConnectTimeout());
			System.out.println("getContent()" + conn.getContentEncoding());
			System.out.println("getContentLenght()" + conn.getContentLength());
			System.out.println("getDoInput() " + conn.getDoInput());
			System.out.println("getURL() " + conn.getURL());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
