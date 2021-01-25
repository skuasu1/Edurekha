/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class FibonocciusingDoWhile {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, i = 2;
		int length = 6, result;

		System.out.println(n1);
		System.out.println(n2);

		do {
			result = n1 + n2;
			System.out.println(result);
			n1 = n2;
			n2 = result;
			i++;

		} while (i <= length-1);
		
	}

}
