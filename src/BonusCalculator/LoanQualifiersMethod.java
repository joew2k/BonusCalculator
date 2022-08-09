/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 * This is a practice on variable scope
 * Approve Credit for anyone whose monthly pay is $25,000 and credit score is 700 above
 * 
 *
 */
public class LoanQualifiersMethod {

	/**
	 * 
	 */
	// TODO What we know 
			static int qualifiedEarnings = 25000;
			static int qualifiedCreditScore = 700;
			static Scanner scanner = new Scanner(System.in);
	public LoanQualifiersMethod() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO what we don't know
		double salary = getSalary();
		int creditScore = getCreditScore();
		scanner.close();
		// Check if user qualify
		boolean qualified = isUserQualify(salary, creditScore);
		
		// Notify the user
		notifyUser(qualified);

	}

	public static double getSalary() {
		
		System.out.println("Enter your total Earning for the year");
		double salary = scanner.nextDouble();
		return salary;
	}
	public static int getCreditScore() {
		System.out.println("Enter your credit score");
		int creditScore = scanner.nextInt();
		return creditScore;
		
	}
	
	public static boolean isUserQualify(double salary, int creditScore) {
		if(salary>=qualifiedEarnings && creditScore>=qualifiedCreditScore) {
			return true;
		}
		return false;
	}
	public static void notifyUser(boolean isUserQualify) {
		if(isUserQualify) {
			System.out.println("Congrats! you qualify for a loan");
		}
		else {
			System.out.println("Sorry, you are not qualified for a loan");
		}
	}
	

}
