/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class phoneBillCalculator {

	/**
	 * @param args
	 * This projects calculate telephone subscriber total bill
	 * The app will calculate total bill and 15% tax
	 * overage will be charged $0.25 per minutes 
	 */
	// Initializing what we known
	static Scanner scanner = new Scanner(System.in);
	static double overageRatePerMin = 0.25;
	static double taxRate = 0.15;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get what we don't know
		double planRate = getPlan();
		double totalOverage = getOverageMinute();
		scanner.close();
		// calculate total bill without taxRate
		double totalBill = getTotalBill(planRate, totalOverage);
		
		// calculate tax
		double tax= getTax(totalBill);
		
		
		// calculate total bill and 15% tax
		double getTotalBillWithTax = getTotalBillWithTax(totalBill, tax);
		
		// notify user with bill
		notifyBill(planRate, totalOverage, tax, getTotalBillWithTax );

	}
	
	public static double getPlan() {
		System.out.println("Enter your your plan");
		double plan = scanner.nextDouble();
		return plan;
	}
	
	public static double getOverageMinute() {
		System.out.println("Enter overage minute");
		int overage = scanner.nextInt();
		double totalOverage = overage * overageRatePerMin;
		return totalOverage;
	}
	
	public static double getTax(double totalBill) {
		double tax = totalBill * taxRate;
		return tax;
	}
	public static double getTotalBill(double planRate, double totalOverage) {
		double totalRateWithOverage = planRate + totalOverage;
		return totalRateWithOverage;
	}
	
	
	public static double getTotalBillWithTax(double totalBill, double tax) {
		double getTotalBillWithTax = totalBill + tax;
		return getTotalBillWithTax;
	}
	
	public static void notifyBill(double planRate, double totalOverage, double tax, double getTotalBillWithTax ) {
		System.out.println("Phone Bill Statement\r\n"
				+ "Plan: $" + String.format("%.2f", planRate) + "\r\n"
				+ "Overage: $" + String.format("%.2f", totalOverage) + "\r\n"
				+ "Tax: $" + String.format("%.2f", tax) + "\r\n"
				+ "Total: $" +  String.format("%.2f", getTotalBillWithTax));
	}

}
