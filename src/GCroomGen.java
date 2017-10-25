import java.util.Scanner;

public class GCroomGen {

	static double length, width, height, area, perimeter, volume = 0;
	static Scanner scnr;
	static Boolean plsContinue = true;

	public static void main(String[] args) {

		scnr = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		/*
		 * Create a while loop that will be used to continue calculating if required by
		 * user based on the plsContinue boolean.
		 */
		while (plsContinue == true) {
			System.out.println();

			// Get the user input for each value by using the getUserVal method and returning the values
			length = getUserVal("Enter length: ");
			width = getUserVal("Enter width: ");
			height = getUserVal("Enter height: ");

			// Calculate the different formulas by using the user input in the calcFormulas
			// method.
			calcFormulas();

			// Ask the user if they wish to continue.
			System.out.println();
			System.out.println("Would you like to continue the magic? (y/n)");

			String userResponse = scnr.next();

			// Check if the first character for their response is a y or Y in order to
			// continue
			if (userResponse.charAt(0) != 'y' && userResponse.charAt(0) != 'Y') {

				plsContinue = false; // If not, set plsContinue to false so we stop the generator
				System.out.println("Thank you for using the Grand Circus' Room Detail Generator!");

			}

			else {
				plsContinue = true; // This allows us to loop through the program again
			}

		}

	}

	//Method used to obtain user input
	public static double getUserVal(String prompt) {
		System.out.println(prompt); 				//Print whatever prompt we need
		while (!scnr.hasNextDouble()) { 			//Check if input is a double
			System.out.println("Please enter a valid length number: ");
			scnr.next();
		}
		return scnr.nextDouble(); 					//If input is a double, return the value

	}

	//Method used to calculate equations and print results
	public static void calcFormulas() {

		area = length * width;
		perimeter = (2 * length) + (2 * width);
		volume = length * height * width;

		System.out.println("Area:" + area);
		System.out.println("Perimeter:" + perimeter);
		System.out.println("Volume:" + volume);

	}

}
