import javax.swing.JOptionPane;

public class UnBirhtday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String unbirthday = JOptionPane.showInputDialog(null, "when is your birhtday ");
		if (unbirthday.toLowerCase().equals("august 26")) {
			JOptionPane.showMessageDialog(null, "happy birthday ");
			
		}else{ JOptionPane.showMessageDialog(null, " happy unbirthday");
		}

	}
}
