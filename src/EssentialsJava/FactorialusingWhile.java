package EssentialsJava;

public class FactorialusingWhile {

	public static void main(String[] args) {

		int factorial = 1, n = 4, i = 1;
		while (i <= n) {
			factorial = factorial * i;
			i++;
		}
		System.out.println(factorial);
	}
}
