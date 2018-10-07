package extra;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Fortnite4Life {
	public static void main(String[] args) {
		
	

	// 1. Ask the user how many hours they spent playing fortnite this week.
        String scar =  JOptionPane.showInputDialog("How many hours did you spend playing fortnite this week?");
	// 2. If it is less than or equal to 2, tell them to stop coding and
	// play fortnite instead.
        double pizza = Double.parseDouble(scar);
        if( pizza <= 2) {
        	JOptionPane.showMessageDialog(null, "Stop coding and play fortnite instead.");
        
        }
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're Ninja
if(pizza >= 3 & pizza <=5) {
JOptionPane.showMessageDialog(null, "You are Ninja and found gold scars for days!");	
}
	// 4. If it is more than 5, call the method below to play the Fortnite theme song.
if(pizza > 5) {
	playBatmanTheme();
}
	}
	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Fortnite4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}