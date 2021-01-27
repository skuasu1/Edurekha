package LearningArray;

public class Functionsinjava {

	// these are called as the class level variables
	static int result;
	static int perimeterresult;

	// this program will more focus on the method of calling a function
	// function is a mehod and it can be called many times in a class
	// it prevents the redundancy of writing implementaion of the code multiple
	// times

	public static void main(String[] args) {

		areaofrectangle(10, 20);
		perimeter(30, 40);
		System.out.println(result);
		System.out.println(perimeterresult);

	}

	private static int perimeter(int i, int j) {

		return perimeterresult = 2 * (i + j);

	}

	private static int areaofrectangle(int i, int j) {

		// this method is static in the sense objects are not needed
		// and the method access modifier is private then it is accessbile only in this
		// class
		// this method is void means no return type is needed
		// when our method is defined as static then no need to create an object to call
		// that functin instead direclty call that method

		result = i * j;
		return result;
	}

}
