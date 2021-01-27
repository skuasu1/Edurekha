package Module2;

/*
THis program is all about the poymorohisim types are method overloading and method overriding
Method overloading is called as the compile time polymorphism
Method overriding is nothing but inhertinace or run time polymorphism
*/
public class Polymorphism extends PolychParentClass {

	public void method() {
		System.out.println("This is the method inside the child class");
	}

	public static void main(String[] args) {

		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 50, 70);
		// Now let us instantiate the object
		// to access the parent class method we need to isntantiate object of the parent
		// class
		PolychParentClass p = new PolychParentClass();
		p.method();

		Polymorphism p1 = new Polymorphism();
		p1.method();
	}
	// Overloading with 2 parameters

	private static void add(int i, int j) {
		System.out.println(i + j);

	}
	// Overloading with 3 parameters

	private static void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	// Overloading with 4 parameters
	private static void add(int i, int j, int k, int y) {
		System.out.println(i + j + k + y);
	}

}
