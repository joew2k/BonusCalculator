/**
 * 
 */
package BonusCalculator;

import java.util.Random;

/**
 * @author Covenant Visions
 * Die Roll game, when a player move 20 steps, the player wins
 * A player can only roll the die 5 times
 */
public class DiceRole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Initialize what we know about
		Random rand = new Random();
		int boardSpace = 20;
		int noOfRolls = 5;
		
		// Roll die
		int rollTotal = 0;
		for (int i = 0; i < noOfRolls; i++) {
			int die = rand.nextInt(6) + 1;
			rollTotal = rollTotal + die;
			if(rollTotal < boardSpace && i <= 3) {
			System.out.println("Roll #" + (i+1) +": You've rolled a " + die
					+ ". You are now on space " + rollTotal + " and have "
					+(boardSpace - rollTotal ) +" more to go.");
			}
			else if (rollTotal == boardSpace) {
				System.out.println("Roll #" + (i+1) +": You've rolled a " + die
						+ ". You are now on space " + rollTotal + " Congrats you win!.");
				break;
				
			}
			else {
				System.out.println("Roll #" + (i+1) +": You've rolled a " + die
						+ ". You are now on space " + rollTotal + " sorry you loose.");
				break;
			}
			
		}

	}

}
