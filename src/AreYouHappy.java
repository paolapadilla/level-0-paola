import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog("are you happy?");
		if (happy.equalsIgnoreCase("yes") || happy.equalsIgnoreCase("y")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever your doing.");
		} else if (happy.equalsIgnoreCase("no")) {
			String feliz = JOptionPane.showInputDialog("do you want to be happy.");
			if (feliz.equalsIgnoreCase("no")||feliz.equalsIgnoreCase("n")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever your doing.");

			} else if (feliz.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			}
		} else {
			JOptionPane.showMessageDialog(null, "that's not a yes or a no");
		}

	}
}
