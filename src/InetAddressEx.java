import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.google.co.kr");
			System.out.println("hostname :" + ip.getHostName());
			System.out.println("ip : " + ip.getHostAddress());
			
			InetAddress[] ips = InetAddress.getAllByName("www.google.co.kr");
			for(InetAddress i : ips)
				System.out.println("ip林家 : " + i);
			byte[] ipAddr = ip.getAddress();
			for(byte b : ipAddr)
				System.out.println( ((b<0) ? b + 256 : b)+" ");
			System.out.println();
			
			InetAddress local  = InetAddress.getLocalHost();
			System.out.println("郴 哪腔磐 ip" + local);
			
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress()+" 林家 : " + ip2);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		

	}

}
