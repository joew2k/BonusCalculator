/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 * Calculate price of item based on the amount quantity and price
 *
 */
public class Cashier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Initialize total and quantity of
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter quantity of items");
		int quantity = scanner.nextInt();
		
		double total = 0;
		
		for(int i=0; i<quantity; i++) {
			System.out.println("Enter Amount");
			double price = scanner.nextDouble();
			total += price;
		}
		System.out.println("Total amount is $" + total);
		scanner.close();

	}

}
