/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

public class DataTypeAndOperators {
	// Class level variables or instance variables
	int i = 10;
	double j = 20;
	float k = 30;
	long z = 50;
	String name = null;
	// programs to use all the data types and given arithmetic operations

	/*
	 * + for Addition - forsubtraction for multiplication / for division ++
	 * Increment Operator -- Decrement Operator
	 */
	// this is the constructor class and is executed on the object instantiation
	public DataTypeAndOperators() {

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(z);
		System.out.println("Hello My name is Karthik Subramanya");
		System.out.println("************************************");
	}

	public static void main(String[] args) {
		DataTypeAndOperators obj = new DataTypeAndOperators();
		add(10, 20, 30, 50, "karthik");
	}

	private static void add(int i, double j, float k, long z, String name) {

		System.out.println("****************Arithmetic Operators ************");
		double addresult = i + j;
		double subtractresult = i - j;
		double multiplyresult = i * j;
		double divideresult = i / j;
		for (i = 0; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("************* Adding Decrement operator **************");
		for (i = 20; i >= 0; i -= 2) { 
			System.out.println(i);
		}
		System.out.println("************* Adding Increment operator **************");
		System.out.println("*************Display the results forvarious operations**********");
		System.out.println(addresult);
		System.out.println(subtractresult);
		System.out.println(multiplyresult);
		System.out.println(divideresult);
		System.out.println(name);

	}

}
