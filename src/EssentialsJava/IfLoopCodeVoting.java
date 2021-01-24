/*@Author Karthik Subramanya
Selenium Certification Training*/

package EssentialsJava;

// Program to check a candiate is eligible for vote or not

public class IfLoopCodeVoting {
	// class level variables to pass the vote age and the person age 
	static int vote = 18;
	static int result;
	static int personage = 100;

	public static void main(String[] args) {

		checkVotingage(vote, result, personage);

	}

	// method to check whether the person can vote or not
	private static void checkVotingage(int vote2, int result2, int personage2) {
		if (personage2 == vote2) {
			System.out.println("This person can vote");
		} else if (personage < vote2) {
			System.out.println("This person cannot vote");
		} else if (personage > vote2) {
			System.out.println("This person can vote");
		}

	}

}
