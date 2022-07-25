package Page218_Poly;

class Graphic{
	int memory;
	
	public void process() {
		System.out.println("�׷��� ó��");
	}
}


class AMD extends Graphic{
	@Override
	public void process() {
		System.out.println("AMD ó��");
	}
}



class Nvidia extends Graphic{
	@Override
	public void process() {
		System.out.println("Nvidia ó��");
	}
	
	@Override
	public String toString() {
		return new Nvidia().getClass().getName();
		//return Nvidia
	}
}

public class GraphicCard {
	static AMD graphicAMD;
	static Nvidia graphicNvida;
	
	public static void main(String[] args) {
		Graphic gc = new Graphic();
		gc.process();
		
		graphicProcess(new AMD());
		graphicProcess(new Nvidia());
		
		allObject(new Graphic());
		allObject(new AMD());
		allObject(new Nvidia());
		allObject("�ȳ�");
		
	}
	public static void graphicProcess (Graphic gc) {
		if(gc instanceof AMD) {
			graphicAMD = (AMD)gc;
			graphicAMD.process();
		}
		else {
			graphicNvida = (Nvidia)gc;
			graphicNvida.process();
		}
			
	}
	public static void allObject(Object obj) {
	System.out.println(obj.toString);
	}
}
