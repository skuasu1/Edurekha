/*@Author Karthik Subramanya
Case Assignments Training*/

package CaseAssignments;

import java.util.Scanner;

public class CinemaTickets {

	public static void main(String[] args) {
		int number = 0, ticketprice = 400, originalcost = 0, totalbill = 0;
		double discountedprice = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of ticket to buy ?");
		number = sc.nextInt();
		if (number == 0) {
			System.out.println("Please buy minimum of 1 ticket");
		}
		if (number == 1 || number > 1) {
			originalcost = number * ticketprice;
			System.out.println("Welcome to amusement Park, Ticket price is:" + originalcost);
		}
		if (number > 10) {
			originalcost = number * ticketprice;
			discountedprice = 0.4 * originalcost;
			System.out.println("Welcome to amusement Park, Since u have bought more than 10 tickets"
					+ " u have 10% discount so " + "Ticket price after discount:" + discountedprice);
		}
		System.out.println("");
		totalbill = (int) (totalbill + originalcost + discountedprice);
		System.out.println("Thank You for visiting our Amusement Park !");
		System.out.println("Total Bill is:" + totalbill);
	}
}
