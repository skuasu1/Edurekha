package LearningArray;

// Deepy coy is a process in which copying occurs recursively
// Deepcpy is also known as cloning the arrry if the array is the 1d array then 
// deep coy is the process of copying the exact emlements of the arry recursively

public class DeepCoyArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int clonearray[] = a.clone();
		for (int i = 0; i < a.length; i++)
			System.out.println(clonearray[i]);

	}

}
