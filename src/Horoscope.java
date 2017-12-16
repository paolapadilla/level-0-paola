import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {

		String starsign = JOptionPane.showInputDialog("What is your star sign?");
		if (starsign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Aries is full of life and possesses high energy");

		} else if (starsign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "your caracteristics is to be peaceful and methodical");
		} else if (starsign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "you rarely like to do anything alone");

		} else if (starsign.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, " you have a sence of humor");
		}else if (starsign.equalsIgnoreCase("Leo")){
			JOptionPane.showMessageDialog(null, "you are relax,proud,in charge,and regal");
		}else if (starsign.equalsIgnoreCase("Virgo")){
			JOptionPane.showMessageDialog(null, " you have the heart for their fellow man");
		} else if (starsign.equalsIgnoreCase("Libra")){
			JOptionPane.showMessageDialog(null, " you have sence of fairness");
		}else if (starsign.equalsIgnoreCase("scorpio")){
			JOptionPane.showMessageDialog(null, "you are protective and are very intrested in others.");
		}
	}
}
