package EssentialsJava;

public class FactorialusingWhile {

	public static void main(String[] args) {

		int factorial = 1, i = 4;
		while (i > 0) {
			factorial = factorial * i;
		}

		System.out.println(factorial);
	}

}
