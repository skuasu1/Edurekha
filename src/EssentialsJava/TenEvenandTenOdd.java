/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class TenEvenandTenOdd {
	// Program to display 10 even numbers and 10 odd numbers

	static int n = 30;
	int result;

	public static void main(String[] args) {
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " is a even number");

			}
			if (i % 2 != 0) {
				System.out.println(i + " is a odd number");

			}
		}
	}

}
