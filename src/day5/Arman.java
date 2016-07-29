package day5;

import javax.swing.JOptionPane;

public class Arman {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Are you smart?");
	if(answer.equals("yes")){
		answer = JOptionPane.showInputDialog("Are you SURE??");
	}
	else{
		JOptionPane.showMessageDialog(null, "THEN GO AWAY!!");
	}
	if(answer.equals("yes")){
		answer = JOptionPane.showInputDialog("Ok, then spell it!");
	}
	else{
		JOptionPane.showMessageDialog(null, "THEN GO AWAY!!");
	}
	if(answer.equals("it")){
		answer = JOptionPane.showInputDialog("Good job! Now, this thing sucks blood from flies. What is it?");
	}
	else{
		JOptionPane.showMessageDialog(null, "NO!! 'It' is spelled 'it'");
	}
	if(answer.equals("spiders")||answer.equals("spider")){
		answer = JOptionPane.showInputDialog("Good job! Now the final test. This is an easy one! Please type gibberish in the box!");
	}
	else{
		JOptionPane.showMessageDialog(null, "Sorry, the answer was spiders.");
	}
	if(answer.equals("gibberish")){
		JOptionPane.showMessageDialog(null, "AMAZING!! YOU BEAT THE TEST!!");
	}
	else{
		JOptionPane.showMessageDialog(null, "NO!! WRONG!!! You have to type gibberish!");
	}
}
}

