package Page263_Annotation;

public class UserClass {
	@UserAnnot(value = "A")
	public void methodA() {
		System.out.println("method A ����");
		}
	@UserAnnot(value = "B",number =10)
	public void methodB() {
		System.out.println("method B ����");
	}
}
