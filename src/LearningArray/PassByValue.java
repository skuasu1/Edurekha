package LearningArray;

public class PassByValue {

	public static void main(String[] args) {
		// passing the local variables
		int p = 6;
		increment(p);// this is the local variable to the method and henc ethis
		// this value is passed into to the n1 variable to the increment method
		System.out.println(p);

	}

	private static void increment(int n1) {
		int result = 0;
		result = n1 + 1;

	}

}
