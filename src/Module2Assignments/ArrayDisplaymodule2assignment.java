/*@Author Karthik Subramanya
Data Handling Module 2*/

package Module2Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDisplaymodule2assignment {

	public static void main(String[] args) throws InputMismatchException {

		int[] empid = new int[5];
		String[] empname = new String[5];
		double[] salary = new double[5];
		String name = null;

		for (int i = 0; i < 5; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.print("\n\tEnter Employee Id " + (i + 1) + ":");
			empid[i] = sc1.nextInt();

			System.out.print("\n\tEnter Employee name " + (i + 1) + ":");
			Scanner sc2 = new Scanner(System.in);
			empname[i] = sc2.nextLine();

			System.out.print("\n\tEnter Employee Salary " + (i + 1) + ":");
			Scanner sc3 = new Scanner(System.in);
			salary[i] = sc3.nextDouble();

		}
		// Case :01 to display the id,name and salary
		display(empid, empname, salary);
		// Case : 02 to display id and empname
		display(empid, empname);
		searchDisplay(name, empid, empname, salary);

	}

	private static void display(int[] empid, String[] empname) {
		try {
			System.out.println("\n");
			System.out.println("*************** Employee Details are as follows****************");
			System.out.print("\nEmployee Id\t\t\t Employee name");
			System.out.println("\n");
			for (int i1 = 1; i1 < 5; i1++) {
				System.out.println("\n\t" + empid[i1] + "\t\t\t" + empname[i1]);
			}
		} catch (InputMismatchException e) {
			System.out.println("You have entered incorrect data");
		}
	}

	private static void searchDisplay(String name, int[] empid, String[] empname, double[] salary) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("\n\tEnter Employee name to search" + ":");
			System.out.println("\n");
			name = sc.nextLine();
			for (int i = 0; i < 5; i++) {
				if (empname[i].equals(null) || (!empname[i].contains(name) || empname[i].equals(""))) {
					System.out.println("Name you are searching is not found in the employee details");
				}
				if (empname[i].contains(name)) {
					System.out.println(name + " is found in the employee details table ");
					System.out.println("\n");
					System.out.println("*************** Searched Employee Detail is as follows****************");
					System.out.print("\nEmployee Id\t\t\t Employee name \t\t Employee Salary\t\t\t");
					System.out.println("\n");
					System.out.println("\n\t" + empid[i] + "\t\t\t" + empname[i] + "\t\t\t" + salary[i]);
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("You have entered incorrect data");
		}

	}

	private static void display(int[] empid, String[] empname, double[] salary) {
		try {
			System.out.println("\n");
			System.out.println("*************** Employee Details are as follows****************");
			System.out.print("\nEmployee Id\t\t\t Employee name \t\t Employee Salary\t\t\t");
			System.out.println("\n");

			for (int i = 1; i < 5; i++) {
				System.out.println("\n\t" + empid[i] + "\t\t\t" + empname[i] + "\t\t\t" + salary[i]);
			}
		} catch (InputMismatchException e) {
			System.out.println("You have entered incorrect data");
		}

	}
}
