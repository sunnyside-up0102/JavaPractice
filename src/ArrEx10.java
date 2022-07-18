
public class ArrEx10 {

	public static void main(String[] args) {
		int [][] matrix= {
				{1,2,3,4},
				{5,6},
				{7,8,9}
		};
		for(int row = 0;row<matrix.length;row++) {
			for(int col=0;col<matrix[row].length;col++)
				System.out.println(matrix[row][col] + " ");
		System.out.println();
	}
		System.out.println();
		for(int[] i : matrix) {
			for(int j : i)
				System.out.print(j + " ");
			System.out.println();
		}
}
}
