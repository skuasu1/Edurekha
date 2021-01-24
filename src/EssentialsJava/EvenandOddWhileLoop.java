package EssentialsJava;

public class EvenandOddWhileLoop {

	public static void main(String[] args) {
		int n = 9;
		while (n != 0) {
			n = n % 2;
			if (n == 0) {
				System.out.println("Number is even");
			}
		}

	}
}
