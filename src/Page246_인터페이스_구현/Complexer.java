package Page246_�������̽�_����;

public class Complexer implements Printer,Scanner,Fax{

	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "����" + tel +" �� ����");
		
	}

	@Override
	public void receive(String tel) {
		System.out.println("����" + FAX_NUMBER + "��" + tel +" �� ����");
		
	}

	@Override
	public void scan() {
	System.out.println("��ĵ ����");
		
	}

	@Override
	public void print() {
		System.out.println("��� ����");
		
	}

}
