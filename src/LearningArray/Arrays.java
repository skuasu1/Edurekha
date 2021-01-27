package LearningArray;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		// Following are the way of defining the arrays of differen types

		double[] prices = new double[5]; // integer type
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 prices : ");
		prices[0] = sc.nextDouble();
		prices[1] = sc.nextDouble();
		prices[2] = sc.nextDouble();
		prices[3] = sc.nextDouble();
		prices[4] = sc.nextDouble();
		double total = prices[0] + prices[1] + prices[2] + prices[3] + prices[4];
		System.out.println("Totalvalue is : " + total);

	}

}
