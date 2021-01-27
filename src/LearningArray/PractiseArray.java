package LearningArray;

public class PractiseArray {

	// this classs is used for practtising an array
	// this class contains the single dimesional and the multidimensional array and printing its vaues

	public static void main(String[] args) {

		// the below arry is an single dimensional array used here
		int[] a = { 1, 2, 3, 4, 5 };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
