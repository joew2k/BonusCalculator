/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class TestResult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get students score.
		System.out.println("Enter your test score");
		Scanner scanner = new Scanner(System.in);
		Double score = scanner.nextDouble();
		scanner.close();
		// Determine the numeric grade
		char grade;
		if (score< 60) {
			grade = 'F';
		}
		else if(score<70) {
			grade = 'E';
		}
		else if(score<80) {
			grade = 'D';
		}
		else if(score<85) {
			grade = 'C';
		}
		else if(score<90) {
			grade = 'B';
		}
		else grade = 'A';
		
		// output grade
		System.out.println("Your grade is " + grade);
		

	}

}
