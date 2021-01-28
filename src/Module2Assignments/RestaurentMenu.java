package Module2Assignments;

import java.util.Scanner;

public class RestaurentMenu {

	public static void main(String[] args) {

		String[] drinks = new String[5];
		double[] drinksprices = new double[5];
		String[] name = new String[5];

		int[] no = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("****Welcome to our Restaurent*****");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the drink Name");
			drinks[i] = sc.nextLine();

			System.out.println("\n");

			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the drink Price");
			drinksprices[i] = sc.nextDouble();
		}
		display(drinks, drinksprices);
		searchDisplaycomputecost(name, no, drinks, drinksprices);
	}

	private static void searchDisplaycomputecost(String[] name, int[] no, String[] drinks, double[] drinksprices) {

		int cost = 0, totalcost = 0;
		String letter;

		for (int i = 0; i < 5; i++) {

			Scanner sc1 = new Scanner(System.in);
			System.out.print("\n\tEnter which Drink u need" + ":");
			System.out.println("\n");
			name[i] = sc1.nextLine();

			Scanner sc2 = new Scanner(System.in);
			System.out.print("\n\tEnter how many drinks u need ?" + ":");
			no[i] = sc2.nextInt();

			if (no[i] == 0) {
				System.out.println("Enter valid number of drinks greater than 1");
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("Do u need anything else ? Yes or No ");
			letter = sc.nextLine();

			if (letter == "No" || letter.contains("no")) {
				break;
			}
		}

		for (int j = 0; j < name.length; j++) {

			for (int i = 0; i < 5; i++) {

				if (drinks[i].equals(name[j])) {
					System.out.println("\n");
					System.out.println("*************** Drinks details are as follows****************");
					System.out.print("\nDrink Name\t\t\t\t Drinks Prize");
					System.out.println("\n");
					System.out.println("\n\t" + drinks[i] + "\t\t\t" + drinksprices[i]);
					System.out.println("\n");
					cost = (int) (drinksprices[i] * no[i]);

					totalcost += cost;
					System.out.println("cost of the selected drink is:" + cost);
				}
			}
		}
		System.out.println("Total cost of the drink is:" + totalcost);
	}

	private static void display(String[] drinks, double[] drinksprices) {

		System.out.println("\n");
		System.out.println("*************** Drinks details are as follows****************");
		System.out.print("\nDrink Name\t\t\t\t Drinks Prize");
		System.out.println("\n");
		for (int i1 = 0; i1 < 5; i1++) {
			System.out.println("\n\t" + drinks[i1] + "\t\t\t" + drinksprices[i1]);
		}

	}

}
