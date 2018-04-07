import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String wendy=JOptionPane.showInputDialog("You found a Pizza with your friends, do you want to share it?");
       if(wendy.equalsIgnoreCase("yes")){
    	   JOptionPane.showMessageDialog( null, "you're a nice person!!");
       }
       else if(wendy.equalsIgnoreCase("no")){
       String alfredo=JOptionPane.showInputDialog("A random homeless guy attacks to take your pizza,do you want to beat him up?");
       if(alfredo.equalsIgnoreCase("yes")){
    	    JOptionPane.showMessageDialog(null,"you're a horrible person, SORRY!!");
       }
       else if(alfredo.equalsIgnoreCase("no")){
    	   JOptionPane.showMessageDialog(null, "you're a nice person!!");
       }
    	   
    	   
    	   
    	   
    	   
       }
	}

}
