/*@Author Karthik Subramanya
Case Assignments Training*/

package CaseAssignments;

import java.util.Scanner;

public class TicketBookingApplication {

	static int number = 0;
	static int ticketpricenormal = 400;
	static int ticketpricegold = 200;
	static int ticketpricesilver = 150;
	static int originalcostnormal = 0;
	static int originalcostsilver = 0;
	static int originalcostgold = 0;
	static int goldclassinputnumber = 0;
	static int silverclassinputnumber = 0;
	static int totalinputnumber = 0;
	static int totalcost = 0;
	static boolean boolenavar = false;

	public static void main(String[] args) {
		// i was not able to solve 1 case when more than 1 ticket is booked with
		// different categories like 3 tickets 1 normal, 1 gold and 1 silver

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the world of cinema ");
		System.out.println("How many tickets do u need ? ");
		number = sc.nextInt();
		if (number == 0 && goldclassinputnumber == 0 && silverclassinputnumber == 0) {
			System.out.println("Enter at least 1 ticket");
		} else if (number < 0) {
			System.out
					.println("The number entered is not valid, Please enter the valid ticket number between 1..to..5");
		}

		else if (number > 5) {
			System.out.println("Maximum of 5 tickets are allowed per person");
			System.out.println("......Thank you visit again.....");

		} else {
			System.out.println(
					"There are 3 categories of ticket 1. Normal- cost(400) 2.Gold Class- cost(200) and 3.Silver Class-cost(200)");
			System.out.println("How many Gold class tickets do u need ?");
			goldclassinputnumber = sc.nextInt();
			validategoldtickets();
			if (!boolenavar) {
				System.out.println("How many Silver class tickets do u need ?");
				silverclassinputnumber = sc.nextInt();
				validatesilvertickets();
				calculatecost();
				totalinputnumber = (number - (goldclassinputnumber + silverclassinputnumber));
			}
		}
	}

	private static void calculatecost() {
		if (goldclassinputnumber > 0 && goldclassinputnumber != 0 || totalinputnumber < 0 || totalinputnumber > 5) {
			originalcostgold = goldclassinputnumber * ticketpricegold;
			System.out.println("You have taken " + goldclassinputnumber
					+ " gold class ticket, so cost of gold ticket(s) is:" + originalcostgold);
		}
		if (silverclassinputnumber > 0 && silverclassinputnumber != 0 || totalinputnumber < 0 || totalinputnumber > 5) {
			originalcostsilver = silverclassinputnumber * ticketpricesilver;
			System.out.println("You have taken " + silverclassinputnumber
					+ " silver class ticket, so cost of silver ticket(s) is:" + originalcostsilver);
		}
		if (number > 0 && number <= 5 && totalinputnumber <= 0 || totalinputnumber > 5) {
			originalcostnormal = (number - (goldclassinputnumber + silverclassinputnumber)) * ticketpricenormal;
			totalcost = originalcostnormal + originalcostgold + originalcostsilver;

			System.out.println("You have taken " + number + "  ticket(s) in total so cost is:" + totalcost);
		}

	}

	public static void validatesilvertickets() {
		if ((goldclassinputnumber + silverclassinputnumber) > number || (goldclassinputnumber) > number
				|| (silverclassinputnumber) > number) {
			System.out.println("U have given wrong no of tickets :" + "Normal- " + number + " Gold class : "
					+ goldclassinputnumber + " Silver class " + silverclassinputnumber + " , "
					+ " Total number of tickets entered greater than ticket " + number);
			boolenavar = true;
		}

	}

	public static void validategoldtickets() {

		if ((goldclassinputnumber + silverclassinputnumber) > number || (goldclassinputnumber) > number
				|| (silverclassinputnumber) > number) {
			System.out.println("U have given wrong no of tickets :" + "Normal- " + number + " Gold class : "
					+ goldclassinputnumber + " Silver class " + silverclassinputnumber + " , "
					+ " Total number of tickets entered greater than ticket " + number);
			boolenavar = true;
		}

	}

}
