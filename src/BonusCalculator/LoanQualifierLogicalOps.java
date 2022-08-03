/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * LoGICAL OPERATORS
 * @author Covenant Visions
 * This method check if an employee qualify for a loan
 *
 */
public class LoanQualifierLogicalOps {

	/**
	 * @param args
	 * To qualify for a loan the person must earn at least $30000
	 * The person must have worked for at least 2 years
	 */
	public static void main(String[] args) {
		// What we known
		int qualifySalary = 30000;
		int qualifyYears = 2;
		
		// What we don't know
		System.out.println("Enter your current salary: ");
		Scanner scanner = new Scanner(System.in);
		Double salary = scanner.nextDouble();
		
		System.out.println("Enter number of years employed: ");
		double years = scanner.nextDouble();
		scanner.close();
		
		// Decisions nested if statement
		if( salary >= qualifySalary && years >= qualifyYears ) {
				System.out.println("Congratulations, you qualify for a loan");
			}
//			else {
//				System.out.println("Sorry, you didn't qualify for a loan, "
//						+ "years employed must be at least " + qualifyYears 
//						+ " years");
//			}
		//}
		else {
			System.out.println("Sorry, you didn't qualify for a loan, minimum "
					+ "salary must be at least " + qualifySalary);
		}
		

	}

}
