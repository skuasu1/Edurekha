/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class AddingDigitsofNumber {

	public static void main(String[] args) {
// local variables used
		int n = 678, sum = 0;
		for (int i = 1; i <= n; i++) {
			int remainder = n % 10;
			n = n / 10;
			sum += remainder;
		}
		System.out.println(sum);
	}
}
