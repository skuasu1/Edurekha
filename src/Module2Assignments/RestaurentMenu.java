package Module2Assignments;

import java.util.Scanner;

public class RestaurentMenu {

	public static void main(String[] args) {

		String[] drinks = new String[6];
		double[] drinksprices = new double[6];
		String name = null;

		int no = 0;

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

	private static void searchDisplaycomputecost(String name, int no, String[] drinks, double[] drinksprices) {

		int cost = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter which Drink u need" + ":");
		System.out.println("\n");
		name = sc.nextLine();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("\n\tEnter how many drinks u need ?" + ":");

		no = sc1.nextInt();
		for (int i = 0; i < 5; i++) {

			if (no == 0) {
				System.out.println("Enter valid number of drinks greater than 1");
			}
			if (drinks[i].contains(name)) {
				System.out.println(" You have selected" + name);
				System.out.println("\n");
				System.out.println("*************** Drinks details are as follows****************");
				System.out.print("\nDrink Name\t\t\t\t Drinks Prize");
				System.out.println("\n");
				System.out.println("\n\t" + drinks[i] + "\t\t\t" + drinksprices[i]);
				System.out.println("\n");
				cost = (int) (drinksprices[i] * no);
				System.out.println("Total cost of the sleected driink is:" + cost);
			}
		}

	}

	private static void display(String[] drinks, double[] drinksprices) {

		System.out.println("\n");
		System.out.println("*************** Drinks details are as follows****************");
		System.out.print("\nDrink Name\t\t\t\t Drinks Prize");
		System.out.println("\n");
		for (int i1 = 1; i1 < 5; i1++) {
			System.out.println("\n\t" + drinks[i1] + "\t\t\t" + drinksprices[i1]);
		}

	}

}
