/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class ReverseDigitsDoWhile {

	public static void main(String[] args) {
		int remainder, reversenumber=0;
		int num = 45;

		do {
			remainder = num % 10;
			num = num / 10;
			reversenumber = reversenumber * 10 + remainder;

		} while (num != 0);
		System.out.println(reversenumber);
	}

}
