package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class CYOA {
	public static void main(String[] args) {
		String q1ans;
		q1ans = JOptionPane.showInputDialog("You are being prosecuted for something you didn't do! Are you going to court or escape?");
		if (q1ans.equals("go to court")) {
			String q2ans;
			q2ans = JOptionPane.showInputDialog("The prosecutors are lying! Do you punch them or stay calm?");
			if (q2ans.equals("Stay Calm")) {
				JOptionPane.showMessageDialog(null, "Success! You have been proved not guilty");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Nuts! You were arrested!");
			}
		}
		else {
			String q3ans;
			q3ans = JOptionPane.showInputDialog("Do you hide in the grass or the skyscraper");
			if (q3ans.equals("grass")) {
				JOptionPane.showMessageDialog(null, "Success! They didn't find you!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Nuts! They found you!");
			}
		}
	}
}
