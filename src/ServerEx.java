import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(9999);
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();
				System.out.println("스레드 생성");
				
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				server.close();
				
			}
			catch{
				
			}
		}

	}

}
class HTTpThread extends Thread{
	private Socket client;
	BufferedReader br;
	PrintWriter pw;
	HTTpThread(Socket client){
		this.client = client;
		try{
			br = new BufferedReader(
					new InputStreamReader(
							client.getInputStream()
							)
					);
			pw = new PrintWriter(client.getOutputStream());
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void run() {
		BufferedReader fbr = null;
		DataOutputStream outToClient = null;
		try {String line = br.readLine();
		System.out.println("Http Header : " + line);
		int start = line.indexOf("/") -1 ;
		int end = line.lastIndexOf("HTTP") - 1; 
		String fileName = line.substring(start,end);
		if 
		}
	}
}