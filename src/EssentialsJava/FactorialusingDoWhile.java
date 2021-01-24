
/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class FactorialusingDoWhile {

	public static void main(String[] args) {
		int n = 5, i = 1;
		int factorial = 1;
		do {
			factorial = factorial * i;
			i++;
		} while (i <= n);
		System.out.println(factorial);
	}
}
