import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
	String dime = JOptionPane.showInputDialog("How many dimes do you have?");
	int dimes = 	Integer.parseInt(dime);
	int cents = dimes * 10;
	 JOptionPane.showMessageDialog(null,"You have " + cents +  " cents.");



// Tell them how many cents they have (hint multiply by 10)




// Ask the user how tall they are (inches)
	 String height = JOptionPane.showInputDialog("How tall are you?");
	 int tall = 	Integer.parseInt(height);
		if(tall < 36) { 
			JOptionPane.showMessageDialog(null, "Eat your Bobzillas");
			
		}
		


// If they are shorter than 36 inches, tell them to eat their Wheaties
           



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 3; i <30; i++) {
if(i%3==0){
	System.out.println(i); }
}
}








void skill3() { // Get a random number that is less than 20 and print it to the console 



// Get another random number that is less than 10 and print it to the console 



// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



}
Random gen = new Random();
int mario = gen.nextInt(20);
void skill4() { // In a pop-up, ask the user for the city they live in 
String sd  = JOptionPane.showInputDialog(null, "What city do you live in boi?");


// If they answered "San Diego", tell them they live in America's Finest City 
if(sd.equals("san diego") ) {
	JOptionPane.showMessageDialog(null, "You live in America's stupidest city");
}


// Otherwise, tell them to move to San Diego 
else {
    JOptionPane.showMessageDialog(null, "Don't move to san diego at all costs!");    }

// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars = 2;


// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



}
}





	
 

	


