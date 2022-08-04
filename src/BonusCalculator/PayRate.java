/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 * WHILE LOOP
 * Every employee earn $15 per hour and and re not allowed to work overtime
 */
public class PayRate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Known Values
		int hourlyRate = 15;
		int maxHours = 40;
		
		// Get user input
		System.out.println("Enter Number of hours worked");
		Scanner scanner = new Scanner(System.in);
		Double workHours = scanner.nextDouble();
		
		// Loop through the conditions and
		while(workHours > maxHours) {
			System.out.println("Oops Sorry error. Overtime is not allowed");
			workHours = scanner.nextDouble();
		}
		scanner.close();
		// Calculate gross pay
		Double gross = hourlyRate * workHours;
		System.out.println("Your pay for the week is $" + gross);
				
				

	}

}
