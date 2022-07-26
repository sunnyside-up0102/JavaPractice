package Page252_Interface;

public class Cpmputer {

	public static void main(String[] args) {
		GraphicCard gc;
		System.out.println("¸Þ¸ð¸® : " + GraphicCard.MEMORY);
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
	}

}
