package Module2Assignments;

public class Mobile {

	public static void main(String[] args) {

		// instantiating a object here and calling the methods using the object reference
		Mobile mobile = new Mobile();
		mobile.dial();
		mobile.recieve();
		mobile.message();
		mobile.display();
	}

	private void display() {
		System.out.println("Hi Mobile this is the display");
	}

	private void message() {
		System.out.println("Hi Mobile this is the message");
	}

	private void recieve() {
		System.out.println("Hi Mobile this is the recieveing");
	}

	private void dial() {
		System.out.println("Hi Mobile this is the dial");
	}

}
