/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class FibannociusingWhileLoop {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int count = 8;
		int sum = 0, i = 1;

		System.out.println(n1);
		System.out.println(n2);
		while (i <= count) {
			sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
			i++;
		}
	}
}