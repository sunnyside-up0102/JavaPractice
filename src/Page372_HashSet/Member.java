package Page372_HashSet;

public class Member {
	String name;
	int age;
	
	Member(String name,int age){
		this.name = name;
		this.age = age;
	}

	
	
	@Override
	public int hashCode() {
		return this.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age == m.age;
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "(" + name + "," + age +")" ; 
	}
}
