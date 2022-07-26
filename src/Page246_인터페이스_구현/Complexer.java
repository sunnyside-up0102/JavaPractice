package Page246_인터페이스_구현;

public class Complexer implements Printer,Scanner,Fax{

	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "에서" + tel +" 로 전송");
		
	}

	@Override
	public void receive(String tel) {
		System.out.println("에서" + FAX_NUMBER + "로" + tel +" 로 수신");
		
	}

	@Override
	public void scan() {
	System.out.println("스캔 실행");
		
	}

	@Override
	public void print() {
		System.out.println("출력 실행");
		
	}

}
