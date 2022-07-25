package Pkg2;

import Pkg1.Aclass;

public class Cclass extends Aclass {
	Cclass(){
		this.varA = "varA";
//		this.varA2= "varA2";
		this.methodA();
//		this.methodA2();
		//default 값은 동일한 클래스 안에서만 접근 가능하다.
	}
}
