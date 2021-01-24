/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class ReverseDigitusingWhileLoop {

	// basically static keyword here is used to make sure that values are same
	// through out the class
	static int remainder;
	static int num = 52;
	static int reversenumber = 0;

	public static void main(String[] args) {
		while (num != 0) {
			remainder = num % 10;
			num = num / 10;
			reversenumber = reversenumber * 10 + remainder;
		}
		System.out.println("Reversed Number: " + reversenumber);
	}

}
