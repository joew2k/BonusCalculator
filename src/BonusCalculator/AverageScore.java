/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class AverageScore {

	/**
	 * @param args
	 * Calculate average score of 4 test for 24 students 
	 */
	public static void main(String[] args) {
		// TODO initialize what we know
		int students = 24;
		int test = 4;
		
		Scanner scanner = new Scanner(System.in);
		
		// Loop through each student to get score and calculate average score
		for(int i = 0; i < students; i++) {
			double total = 0;
			for(int j = 0; j < test; j++) {
				System.out.println("Enter the score for test #" + (j + 1));
				double score = scanner.nextDouble();
				total += score;
			}
			double average = total / test;
			System.out.println("The average score for student #" + (i + 1) + 
					" is " + average);
		}
		scanner.close();

	}

}
