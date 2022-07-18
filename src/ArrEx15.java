import java.util.Arrays;

public class ArrEx15 {

	public static void main(String[] args) {
	int[] arrInt = {1,2,3};
	
	int[] arrInt2 = null;
	
	arrInt2 = Arrays.copyOf(arrInt,5);
	for(int i : arrInt2)
	{
		System.out.println(i);
	}
	}

}
