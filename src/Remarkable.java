import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String bobthebuilder = JOptionPane.showInputDialog("what is your name");
		if (bobthebuilder.equals("Alexa")) {
			JOptionPane.showMessageDialog(null, " your're remarkable because i like how you dress");
		} else if (bobthebuilder.equals("Celena")) {
			JOptionPane.showMessageDialog(null, "your're remarkable beacuse i like your shoes");

		} else if (bobthebuilder.equals("Chris")) {
			JOptionPane.showMessageDialog(null, "your're remarkable becuase i like your glasses");

		} else {
			JOptionPane.showMessageDialog(null, "your're remarkable beacuse your awesome");
		}
	}
}
