/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class FactorialofNumber {

	static int n = 3, factorial = 1;

	public static void main(String[] args) {
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}
