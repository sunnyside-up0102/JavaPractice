
public class 함수적인터페이스 {

	public static void main(String[] args) {
		

	}

}

 interface NotFunctional{
	public boolean equals(Object obj);	//object 클래스의 멤버만 존재
}

  interface Functional {
	 public Object clone();	//public 멤버가 아니므로 protected
 }
  
  interface Funtional {
	  public boolean equals(Object obj);
	  public void execute();
  }
  
  interface NotFunctionl{
	  public Object clone();
	  public void execute();
	  //clone()과 존재
  }