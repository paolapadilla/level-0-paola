import javax.swing.JOptionPane;

public class Quizgame {
	public static void main(String[] args) {
		int score = 0;

		String ans = JOptionPane.showInputDialog("what color is the sky?");
		if (ans.equals("blue")) {
			score = score + 1;
		}
		ans = JOptionPane.showInputDialog("whats Paola's favorite animals?");
		if (ans.equals("animals")) {
			score++;
		}
		ans = JOptionPane.showInputDialog("what color are my socks?");
		if (ans.equals("none")) {
			score++;
		}
		ans = JOptionPane.showInputDialog("how old is paola");
		if (ans.equals("10")) {
			score++;
		}
		JOptionPane.showMessageDialog(null, "your total score is " + score + " points");
	System.out.print("12345677778890");
	System.out.print("243423423424711");
	}

}