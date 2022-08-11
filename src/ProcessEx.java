import java.io.IOException;

public class ProcessEx {

	public static void main(String[] args) throws IOException,InterruptedException{
		Process p1 = Runtime.getRuntime().exec("calc.exe");
		Process p2 = Runtime.getRuntime().exec("mspaint.exe");
		
		p1.waitFor();
		p2.destroy();
	}
}
//calc.exe. 실행 -> 계산기 프로세스 생성 -> calc.exe종료 -> 14L에 의해 계산기 프로세스만 남음