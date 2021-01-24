/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class CheckNumberisOddorEven {
	public static void main(String[] args) {
		// which number to check pass that number into the method as the argument or
		// parameter
		CheckNumberisOddorEven(20);
	}

	private static void CheckNumberisOddorEven(int i) {
		if (i % 2 == 0) {
			System.out.println("Passed number is an even number");
		} else {
			System.out.println("Passed number is an odd number");
		}

	}
}
