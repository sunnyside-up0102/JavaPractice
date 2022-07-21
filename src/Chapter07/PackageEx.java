package Chapter07;

import Chapter07.test.TestPackage;

public class PackageEx {

	public static void main(String[] args) {
		Chapter07.test.TestPackage test 
		= new TestPackage();
		test.method();
	}

}
