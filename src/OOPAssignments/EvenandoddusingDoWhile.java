
/*@Author Karthik Subramanya
Selenium Certification Training*/

package OOPAssignments;

public class EvenandoddusingDoWhile {

	public static void main(String[] args) {
		int n = 1;
		do {
			if (n % 2 == 0) {
				System.out.println("Even number:" + n);
			} else {
				System.out.println("Odd number:" + n);
			}
			n++;
		} while (n <= 20);
	}

}
