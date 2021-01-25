
/*@Author Karthik Subramanya
Selenium Certification Training*/
package EssentialsJava;

public class MultiplicationTableDoWhile {

	public static void main(String[] args) {
		int i = 1,result;
		int length = 10;
		do {

			result = i*length;
			i++;
			System.out.println(result);

		} while (i <= 10);

	}

}
