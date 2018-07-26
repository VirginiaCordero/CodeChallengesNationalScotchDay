/* Challenge by Andrew Foley and Virginia Cordero */

import java.util.ArrayList;

public class CodeChallenge {

	public static void main(String[] args) {

		/*
		 * Create an ArrayList of rectangles or circles. Find the largest one and print
		 * the dimensions or radius. Bonus 1: Also find smallest. Bonus 2: Sort the
		 * shapes by size.
		 */
		Rectangle iceCreamSandwich = new Rectangle(3, 1, "Klondike");
		Rectangle oneDollarBill = new Rectangle(7, 2, "Washington");
		Rectangle photograph = new Rectangle(4, 6, "Family Photo");

		ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();
		rectangleList.add(iceCreamSandwich);
		rectangleList.add(oneDollarBill);
		rectangleList.add(photograph);
		
		// variable to store biggest room
		String biggestRectangleName = "";
		double biggestRectangleArea = 0;
		
		for (Rectangle specificRectangle : rectangleList) {
			// reassign placeholder variables if specificRectangle is bigger!
			if (specificRectangle.getArea() > biggestRectangleArea) {
				biggestRectangleArea = specificRectangle.getArea();
				biggestRectangleName = specificRectangle.getName();
			}
		}
		
		System.out.println("The biggest rectangle is " + biggestRectangleName);
		System.out.println("It has an area of " + biggestRectangleArea);
		
	}
}