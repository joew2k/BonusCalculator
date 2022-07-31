/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class QuotaCalculator {

	/**
	 * @param args
	 * Sales people are expected to make 10 sales per week.
	 * Sales person who meet the target receives congratulations messages.
	 * Those who don't meet the target, are informed how many sales the were short'
	 * 
	 */
	public static void main(String[] args) {
		// initialize the known
		int quota = 10;
		System.out.println("Enter number of sales for the week");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		// make decisions and print the results
		if(sales >= quota) {
			System.out.println("Congratulations you you have "
					+ "achieved the quota for the week your "
					+ "sales for the week is " + sales);
		}
		else {
			int shortQuota = quota - sales;
			System.out.println("You performed below quota "
					+ "for the week your outstanding is " + shortQuota);
		}
		

	}

}
