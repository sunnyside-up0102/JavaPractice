
public class HashCodeEx2 {

	public static void main(String[] args) {
		Hash v1 = new Hash(20);
		Hash v2 = new Hash(20);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
		
		if(v1.equals(v2))
			System.out.println("값이 같음");
		else
			System.out.println("값이 다름");

	}
}

	class Hash{
		int value;
		Hash(int value){
			this.value = value;
			
		}
		@Override
		public int hashCode() {
			return value;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Hash)	{		//true
			Hash v = (Hash)obj;
			return value == v.value;	//return true;
			}
			else 
				return false;
				
		}		
	}

