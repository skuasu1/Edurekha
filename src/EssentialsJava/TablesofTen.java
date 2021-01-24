/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class TablesofTen {

	static // Program to display the multiplication of 10
	int length = 10;
	static int number;

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			number = i * length;
			System.out.println(number);
		}
	}

}
