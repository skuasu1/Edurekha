package EssentialsJava;

public class AddDigitsofNumberIfLoop {

	public static void main(String[] args) {
		int n = 56, remainder, sum = 0;
		while (n != 0) {
			remainder = n % 10;
			n = n / 10;
			sum += remainder;
		}
		System.out.println(sum);

	}
}
