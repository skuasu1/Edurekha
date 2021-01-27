package LearningArray;

// Program deals wih the call by value and call by refernce

public class Functioncalling {

	public static void main(String[] args) {

		int i = 10, a = 6;
		int j = 20, c;

		c = sum(i, j);// passed 2 parameers i,j are the actual parameters that is sent to the method
						// add
		System.out.println(c);
		increase(a);
		System.out.println(a);
	}

	private static int increase(int p) {

		return p = p + 1;

	}

	// the variable that is passed into the sum method is the reference variable
	private static int sum(int num1, int num2) {

		int addition = num1 + num2;

		return addition;

	}

}
