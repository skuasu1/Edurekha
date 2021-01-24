/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class FibonnaciNumbers {
	

	// basically static keyword here is used to make sure that values are same
	// through out the class
	static int n1 = 0, n2 = 1, count = 10, sum = 0;

	public static void main(String[] args) {
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 2; i <= count; i++) {
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
		}
	}
}
