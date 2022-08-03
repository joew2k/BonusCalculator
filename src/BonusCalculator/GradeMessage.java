/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class GradeMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Get student grade
		System.out.println("Enter your grade");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		scanner.close();
		// Check for grade 
		String message;
		switch(grade.toUpperCase()) {
			case "A":
				message = "Excellent Job";
				break;
			case "B":
				message = "Great Job";
				break;
			case "C":
				message = "Good Job";
				break;
			case "D":
				message = "You need to work harder";
				break;
			case "E":
				message = "Uh Oh";
				break;
			default: 
				message = "Error! Invalid grade";
				break;
		}
		System.out.println(message);
		

	}

}
