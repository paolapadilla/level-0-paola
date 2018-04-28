import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		String wendy =JOptionPane.showInputDialog("what was your score in a test that you took??");
		double sky=Double.parseDouble(wendy);
		if(sky>=80&&sky<=100) {
			JOptionPane.showMessageDialog(null, "wow,you must have studied hard!!");
		}if(sky<=79&&sky>=0) {
			JOptionPane.showMessageDialog(null, "Try harder next time!");
		}
	if(sky>100) {
		JOptionPane.showMessageDialog(null, "please enter a real test score between 1-100%");
	}

}
}

