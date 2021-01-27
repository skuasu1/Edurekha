package LearningArray;

// pass by reference means passing the object as the parameter to the method

public class CallByReference {
	// one of the method of calling reference is making the class level variable as
	// public
	// this is the class level variable that is added here
	public int number;

	// this is the defualt constructor that has the variables which is a class level
	// variable
	public CallByReference() {
		number = 1;

	}

	public static void main(String[] args) {

		CallByReference obj = new CallByReference();
		// here u are passing the object variable that calls fromthe constructor and
		// display instead of the value we are passing the object itself
		System.out.println("The value in the object is " + obj.number);

	}

}
