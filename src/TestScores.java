import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		String wendy =JOptionPane.showInputDialog("what was your score in a test that you took??");
		int sky=Integer.parseInt(wendy);
		if(sky>80) {
			JOptionPane.showMessageDialog(null, "wow,you must have studied hard!!");
		}

	}

}
