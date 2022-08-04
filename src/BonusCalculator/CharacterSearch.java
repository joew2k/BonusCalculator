/**
 * 
 */
package BonusCalculator;

import java.util.Scanner;

/**
 * @author Covenant Visions
 *
 */
public class CharacterSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Get the text.
		System.out.println("Enter some text");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		scanner.close();
		
		char searchedText = 'A';
		boolean charFound = false;
		
		// Loop through the characters
		for (int i = 0; i < text.length(); i++) {
			char currentLetter = text.charAt(i);
			if (currentLetter == searchedText) {
				charFound = true;
				break;
			}
		}
		if (charFound) {
			System.out.println("The Character 'A' was found");
		}
		else {
			System.out.println("String does not contain the character 'A'");
		}

	}

}
