package cont;

import javax.swing.JOptionPane;
//JOptionPane class, allows me to display messages and allows for user inputs
public class JOP {
	//Allows for a message to be displayed
	public static void msg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	//allows for a msg to be displayed as well as allows for user input
	public static String in(String msg){
		return JOptionPane.showInputDialog(msg);
	}
}
