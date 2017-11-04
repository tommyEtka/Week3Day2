package labNumberNine;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		String choice = "yes";
		// int i = 0;
		int count = 0;
		CircleMethods circle1 = new CircleMethods();

		System.out.println("Welcome to the Circle Tester");

		
		for (int i = 1;; i++) {
		while(choice.equalsIgnoreCase("yes")) { // just put in the while loop
			
				System.out.println("Enter Radius: ");
				Scanner input1 = new Scanner(System.in);

				circle1.setRadius(input1.nextDouble());
				// circle1.setRadius(3.5);

				System.out.print("Circumference: ");
				circle1.getFormattedCircumference();

				System.out.print("Area: ");
				circle1.getFormattedArea();

				input1.nextLine();
				System.out.println();
				System.out
						.println("Would you like to enter another radius? (yes or no) ");
				choice = input1.nextLine();

				
				while (choice.equalsIgnoreCase("no")) {
					System.out.println("Goodbye");
					System.out.println("You have created " + i + " object(s).");
					break;
					
				} break;
			}
			// end while loop

		}
	}
}
