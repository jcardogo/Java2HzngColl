package Java2Lab4;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	public GameFrame() {
		this.setTitle("Alejandro's Game");
		this.setSize(500,500);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		
		this.setContentPane(new MainGamePanel());
		
		this.setLocationRelativeTo(null);  //place frame in the middle of screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close application when frame closes
		this.setVisible(true); //display frame
	}	
}
