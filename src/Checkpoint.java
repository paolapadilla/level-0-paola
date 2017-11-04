import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("what's your favorite color");
		JOptionPane.showMessageDialog(null, color +" is also my favorite color");
		Robot paola = new Robot();
		paola.setSpeed(90);
		paola.penDown();
		paola.move(200);
		paola.turn(120);
		paola.move(200);
		paola.turn(120);
		paola.move(200);
	}
}
