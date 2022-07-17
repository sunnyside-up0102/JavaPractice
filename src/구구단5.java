
public class 구구단5 {
	public static void main(String[] args) {
		for(int dan =2;dan<=9;dan++) {
			if(dan%2!=0) continue; 
			System.out.println(dan + "단");
			for(int su=1;su<=9;su++) {
				System.out.println(dan + " x " + su + "=" + dan * su);
			}
			System.out.println();
			
		}
	}
}
 