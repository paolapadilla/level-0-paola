import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("how old are you?");
		int age = Integer.parseInt(input);
		if (age<18){
			JOptionPane.showMessageDialog(null,"no one cares what you think  ");
			
		}else {
			JOptionPane.showInputDialog("who do you think the next president will be?");
		}
	}
}
