package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	


		// 2. Make a String variable to hold the value of Pie.
		//    Get the first few digits from http://www.piday.org/million/.
	String Pie = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461";
			
		// 3. Print out the first 3 digits of Pie to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
System.out.println(Pie.charAt(0));
System.out.println(Pie.charAt(1));
System.out.println(Pie.charAt(2));

		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
			for (int i = 0; i < Pie.length(); i++) {String jetpack = JOptionPane.showInputDialog("What is the next digit of pie?");
				if(Pie.charAt(i) == jetpack.charAt(0)){
				JOptionPane.showMessageDialog(null, "You won a #1 victory royale");
			}
				else {
					JOptionPane.showMessageDialog(null, " You lost like a pathetic noob! Start over!");
					break;
				}
			// 5. Ask the user for the NEXT digit of pi.
			
				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 

					// 7. If they are correct, print out "correct".

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
}
}
}

