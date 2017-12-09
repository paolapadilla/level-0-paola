import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {

		String starsign = JOptionPane.showInputDialog("What is your star sign?");
		if (starsign.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "Aries is full of life and possesses high energy");

		} else if (starsign.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "your caracteristics is to be peaceful and methodical");
		} else if (starsign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "you rarely like to do anything alone");

		} else if (starsign.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, " you have a sence of humor");
		}else if (starsign.equals("Leo")){
			JOptionPane.showMessageDialog(null, "you are relax,proud,in charge,and regal");
		}else if (starsign.equals("Virgo")){
			JOptionPane.showMessageDialog(null, " you have the heart for their fellow man");
		} else if (starsign.equals("Libra")){
			JOptionPane.showMessageDialog(null, " you have sence of fairness");
		}else if (starsign.equals(""))
	}
}
