/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	int buttonNum;
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) throws InterruptedException {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() throws InterruptedException {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String buttonString = JOptionPane.showInputDialog("Enter a positive integer. The larger the number, the harder the game will be. Easier games should have the number be anywhere from 250-1000. \n Harder games should have around 1500");
		buttonNum = Integer.parseInt(buttonString);
		buttons = new JButton[buttonNum];
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton ();
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "In this game a button will briefly present itself as the hidden button by saying 'ME'. Your goal is to click the hidden button. ");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random ran = new Random();
		int randomNum = ran.nextInt(buttonNum +1);
		hiddenButton = randomNum;
		//14. Set the text of the JButton located at hiddenButton to  "ME"
buttons[randomNum].setText("ME");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
Thread.sleep(1000);
		//16. Set the text of the JButton located at hiddenButton to be blank.
buttons[randomNum].setText(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if (e.getSource() == buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You Win!!! The reward is $0.00! Enjoy");	
		}
		//18. else tell them to try again
		else {
			JOptionPane.showMessageDialog(null, "You lose. Try again. ");	
		}
	}
}
