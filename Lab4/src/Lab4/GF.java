package Lab4;

import javax.swing.JFrame;

public class GF extends JFrame{
	public GF() {
		this.setTitle("Alejandro's Game");
		this.setSize(500,500);
		this.setResizable(false);
		this.setAlwaysOnTop(false);
		
		this.setContentPane(new MGP());
		
		this.setLocationRelativeTo(null);  //place frame in the middle of screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close application when frame closes
		this.setVisible(true); //display frame
	}	
}
