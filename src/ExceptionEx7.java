
public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			first();
		}
		catch(Exception e) {
			System.out.println("Main ���� ó��");
			System.out.println(e.getMessage());
		}
	}
	
		static void first() throws Exception {
			try {
				second();
			}
			catch(Exception e) {
				System.out.println("first ����ó��");
				throw e;	//���� ��߻�
			}
		}
		static void second() throws Exception {
			try {
				throw new Exception("���� �߻�");
			}
			catch(Exception e) {
				System.out.println("second ���� ó��");
				throw e; //���� ��߻�
			}
		}
}
