
public class ������4 {
	public static void main(String[] args) {
		gugu:
			for(int dan =2;dan<=9;dan++) {
			System.out.println(dan + "��");
			for(int su=1;su<=9;su++) {
				System.out.println(dan + " x " + su + "=" + dan * su);
				if(su>=5) break gugu;
			}
			System.out.println();
		}
	}
}
 