package Page208_inheritance;

public class Camera {
	void take_a_pic() {
		System.out.println("사진을 찍는다");
	}
}

class GeneralPhone extends Camera {
	
		void make_a_call(String phoneNum) {
			System.out.println(phoneNum + "으로 전화를 겁니다");
		}
		
	void answer_a_call(String phoneNum) {
		System.out.println(phoneNum + "에서 걸려온 전화를 받는다");
	}
}
	public class PhoneCam{
		
		public static void main(String[] args) {
			GeneralPhone phone = new GeneralPhone();
			
			//전화걸기
			phone.make_a_call("010-1234-5678");
			
			//전화받기
			phone.answer_a_call("1588-0822");
			
			//사진 찍기
			phone.take_a_pic();
		}
	}
