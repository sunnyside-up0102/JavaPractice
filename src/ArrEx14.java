
public class ArrEx14 {

	public static void main(String[] args) {
	int[] arrInt = {1,2,3};
	
	int[] arrInt2 = new int[5];
	
	System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
	
	for(int i : arrInt2)
	{
		System.out.println(i);
	}
	}

}
