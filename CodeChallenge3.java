import java.util.Scanner;

public class CodeChallenge3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String favColor;
		int posNumber = 0;

		// get favorite color
		System.out.println("Please enter your favorite color:");
		favColor = scan.nextLine();

		// get position number
		System.out.println("Enter a number and we'll print the character at that position!");
		System.out.println("So enter a number 1-" + favColor.length() + ":");

		boolean inputIsValid = false;
		do {
			try {
				posNumber = Integer.parseInt(scan.nextLine()); /* could throw NumberFormat Exception */
				System.out.println("The letter at position " + posNumber + " is " + favColor.charAt(posNumber - 1)
						+ "!!"); /* could throw IndexOutOfBoundsException */
				inputIsValid = true; /* good job, you followed instructions, break this loop */
			} catch (IndexOutOfBoundsException | NumberFormatException ex) {
				System.out.println("Sorry. You must enter a number 1-" + favColor.length() + ". Try again.");
			}
			// scan.nextLine(); /* clear garbage input */ only needed if you use .nextInt()
		} while (!inputIsValid);


		scan.close();
	}

}
