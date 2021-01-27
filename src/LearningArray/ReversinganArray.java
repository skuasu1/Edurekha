package LearningArray;

public class ReversinganArray {
	/*
	 * Following program is used to reverse an array
	 * 
	 */
	// need to decalre the array with the values

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		// reversing an array using
		// reverse(arr, arr.length);
		reversewithinarray(arr, arr.length);

	}
	// below method is reversing the varaible using extra b[]
	// another method  is splitting the array into half and then reversing it

	private static void reversewithinarray(int[] arr, int n) {

		for (int i = 0; i < n / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;

		}
		for (int k = 0; k < n; k++)
			System.out.println(arr[k]);
	}

	@SuppressWarnings("unused")
	private static void reverse(int[] arr, int n) {

		int b[] = new int[n];// by taking another array then it is wate of memory because it holds ,e,ory for this arrayb[]
		int j = n;
		int i;

		for (i = 0; i < n; i++) {
			b[j - 1] = arr[i];
			j = j - 1;
		}
		for (int k = 0; k < n; k++) {
			System.out.println(b[k]);
		}

	}

}
