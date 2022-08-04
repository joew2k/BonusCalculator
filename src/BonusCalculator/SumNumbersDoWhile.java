/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *This program get two numbers and sum the numbers
 * The program will repeat as long as the user still want to play
 */
public class SumNumbersDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean again;
		// TODO get the two numbers
		do {
		System.out.println("Enter the first number");
		Double firstNumber = scanner.nextDouble();
		
		System.out.println("Enter the first number");
		Double secondNumber = scanner.nextDouble();
		
		
		
		Double sum = firstNumber + secondNumber;
		System.out.println("The Sum is " + sum);
		
		System.out.println("Do you want to play again?");
		again = scanner.nextBoolean();
		
		}while(again);
		scanner.close();

	}

}
