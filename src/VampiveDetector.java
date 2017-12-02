import javax.swing.JOptionPane;

public class VampiveDetector {

	public static void main(String[] args) {
		boolean vampire = false;
		// TODO Auto-generated method stub
		String garlic = JOptionPane.showInputDialog("do you like garlic?");

		String light = JOptionPane.showInputDialog("do you like sun lights?");

		String age = JOptionPane.showInputDialog("how old are you ?");

		int old = Integer.parseInt(age);

		if (garlic.equals("no") && light.equals("no") && old > 100) {
			vampire = true;
		}

		else if (garlic.equals("no") && light.equals("yes") && old < 100) {
			vampire = false;
		} else if (garlic.equals("yes") && light.equals("no") && old < 100) {
			vampire = false;
		} else if (garlic.equals("yes") && light.equals("yes") && old < 100) {
			vampire = false;
		}else if (old >100){
			vampire=true;
		}
		if (vampire == true) {
			JOptionPane.showMessageDialog(null, "your're a vampire GET OUT!!!!");
		} else {
			JOptionPane.showMessageDialog(null, "your're not a vampire your hired");
		}

	}

}
