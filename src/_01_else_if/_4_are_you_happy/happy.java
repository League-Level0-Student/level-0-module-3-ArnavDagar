package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class happy {
	public static void main(String[] args) {
		String q1ans;
		q1ans = JOptionPane.showInputDialog("Are you happy?");
		if (q1ans.equals("yes")) {
			JOptionPane.showMessageDialog(null,"Keep on doing whatever you are doing");
		}
		else {
			String q2ans;
			q2ans = JOptionPane.showInputDialog("Do you want to be happy?");
			if (q2ans.equals("no")) {
					JOptionPane.showMessageDialog(null,"keep on doing whatever you are doing");
			
				}
			else {
				JOptionPane.showMessageDialog(null,"Change something");
			}
			}
		}
	

	}


