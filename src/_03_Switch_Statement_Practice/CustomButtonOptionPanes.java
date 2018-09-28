package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(input) {
		case(0):
		System.out.println("You have school tomorrow");
		break;
		case(1):
			System.out.println("The worst day of the week");
		break;
		case(2):
			System.out.println("At least it's not Monday");
		break;
		case(3):
		System.out.println("Halfway though the week");
		break;
		case(4):
			System.out.println("Just a little more");
		break;
		case(5):
			System.out.println("You made it!");
		break;
		case(6):
		System.out.println("Do your homework now, don't procrastinate till Sunday");
		break;
			
		}
	}
}
