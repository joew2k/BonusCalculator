/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 * The game check if player change is equal $1
 * if its equla to one dollar the player wins the
 * if the change is greater than one dollar the player the player is notified the excess
 * if the change is less than one dollar the player the player is notified the how much they went under
 */
public class DollarConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Get number of pennie, nickle, dime and quarter
		System.out.println("Enter number of pennies");
		Scanner scanner = new Scanner(System.in);
		Double pennies = (scanner.nextDouble() * 1)/100;
		
		System.out.println("Enter number of nickle");
		Double nickle = (scanner.nextDouble() * 5)/100;
		
		System.out.println("Enter number of dime");
		Double dime = (scanner.nextDouble() * 10)/100;
		
		System.out.println("Enter number of quarter");
		Double quarter = (scanner.nextDouble()* 25)/100;
		scanner.close();
		// Sum the input and convert to 
		Double amtDollar = pennies +nickle + dime + quarter;
		
		// Check the value of the change
		Double winChange = 1.0;
		Double overchange = amtDollar - winChange;
		Double underchange = amtDollar - winChange;
		if (amtDollar.equals(winChange)) {
			System.out.println("Congratulations you win");
		}
		else if (amtDollar>winChange) {
			System.out.println("Oops! you went over by $" + overchange); 
		}
		else{
			System.out.println("Oops! you went under by $" + underchange);
		}


	}

}
