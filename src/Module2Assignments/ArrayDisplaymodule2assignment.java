/*@Author Karthik Subramanya
Data Handling Module 2*/

package Module2Assignments;

import java.util.Scanner;

public class ArrayDisplaymodule2assignment {

	public static void main(String[] args) {

		int[] empid = new int[5];
		String[] empname = new String[5];
		double[] salary = new double[5];

		for (int i = 0; i < 5; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.print("\n\tEnter Employee Id " + (i+1) + ":");
			empid[i] = sc1.nextInt();

			System.out.print("\n\tEnter Employee name " + (i+1) + ":");
			Scanner sc2 = new Scanner(System.in);
			empname[i] = sc2.nextLine();

			System.out.print("\n\tEnter Employee Salary " + (i+1) + ":");
			Scanner sc3 = new Scanner(System.in);
			salary[i] = sc3.nextDouble();

		}
		display(empid, empname, salary);

	}

	private static void display(int[] empid, String[] empname, double[] salary) {

		System.out.println("\n");
		System.out.println("*************** Employee Details are as follows****************");
		System.out.print("\nEmployee Id\t\t\t Employee name \t\t Employee Salary\t\t\t");
		System.out.println("\n");
		
		for (int i = 1; i < 5; i++) {
			System.out.println("\n\t"+empid[i]+"\t\t\t"+empname[i]+"\t\t\t" + salary[i]);
		}

	}

}
