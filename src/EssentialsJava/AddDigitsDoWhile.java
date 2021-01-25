/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class AddDigitsDoWhile {

	public static void main(String[] args) {
		int remainder;
		int n = 476;
		int sum =0;
		
		do {
			remainder = n%10;
			n= n/10;
			sum+= remainder;
			
		}while(n !=0);
		
		System.out.println(sum);

	}

}
