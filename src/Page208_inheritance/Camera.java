package Page208_inheritance;

public class Camera {
	void take_a_pic() {
		System.out.println("������ ��´�");
	}
}

class GeneralPhone extends Camera {
	
		void make_a_call(String phoneNum) {
			System.out.println(phoneNum + "���� ��ȭ�� �̴ϴ�");
		}
		
	void answer_a_call(String phoneNum) {
		System.out.println(phoneNum + "���� �ɷ��� ��ȭ�� �޴´�");
	}
}
	public class PhoneCam{
		
		public static void main(String[] args) {
			GeneralPhone phone = new GeneralPhone();
			
			//��ȭ�ɱ�
			phone.make_a_call("010-1234-5678");
			
			//��ȭ�ޱ�
			phone.answer_a_call("1588-0822");
			
			//���� ���
			phone.take_a_pic();
		}
	}
