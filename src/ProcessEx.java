import java.io.IOException;

public class ProcessEx {

	public static void main(String[] args) throws IOException,InterruptedException{
		Process p1 = Runtime.getRuntime().exec("calc.exe");
		Process p2 = Runtime.getRuntime().exec("mspaint.exe");
		
		p1.waitFor();
		p2.destroy();
	}
}
//calc.exe. ���� -> ���� ���μ��� ���� -> calc.exe���� -> 14L�� ���� ���� ���μ����� ����