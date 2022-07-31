package BonusCalculator;

import java.util.Scanner;

public class BonusCalculator {

	public static void main(String[] args) {
		// Initialize the the known values
		int salary = 1000;
		int bonus = 250;
				
		//Get the unknown values
		System.out.println("Enter the number of item sold");
		Scanner scanner = new Scanner(System.in);
		int itemsold = scanner.nextInt();
		scanner.close();
		
		//Calculate the bonus for bonus earners
		if (itemsold > 10) {
			salary += bonus;
		}
		// output the results
		System.out.println("Your salary is $" + salary);

	}

}
