package Java2Lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainGamePanel extends JPanel {
	public MainGamePanel() {
		JPanel topPan,centPan, botPan, topPan1, topPan2, centPan1, centPan2, botPan1, botPan2;
		JButton btns[] = new JButton[11];
		String btnLb[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "NAME", "START"};
		String Lbtxt[] = {"NAME", "LEVEL: ", "TRIES: ", "GAME PLAYED: ", "GAME WON: ", "GAME LOST: ", "PLAYER NAME"};
		JLabel Lbs [] = new JLabel[7];
		
		// Creating Panels
		topPan = new JPanel();
		topPan.setLayout(new BorderLayout());
		topPan1 = new JPanel();
		topPan2 = new JPanel();

		centPan = new JPanel();
		centPan.setLayout(new BorderLayout());
		centPan1 = new JPanel();
		centPan2 = new JPanel();
		centPan2.setLayout(new GridLayout(3,3));
		centPan2.setSize(300,300);
		
		
		botPan = new JPanel();
		botPan.setLayout(new BorderLayout());
		botPan1 = new JPanel();
		botPan2 = new JPanel();
		
		topPan.setBackground(Color.GRAY);
		centPan.setBackground(Color.BLUE);
		botPan.setBackground(Color.GRAY);
		
		this.setLayout(new BorderLayout());
		this.add(topPan, BorderLayout.NORTH);
		this.add(centPan, BorderLayout.CENTER);
		this.add(botPan, BorderLayout.SOUTH);
		
		topPan.add(topPan1, BorderLayout.WEST);
		topPan.add(topPan2, BorderLayout.EAST);
		
		centPan.add(centPan1, BorderLayout.NORTH);
		centPan.add(centPan2, BorderLayout.CENTER);
		
		botPan.add(botPan1, BorderLayout.WEST);
		botPan.add(botPan2, BorderLayout.EAST);
		
		
		//Creating the buttons
		for(int i=0; i<btns.length; i++) {
			btns[i] = new JButton(btnLb[i]);
			
			//btns[i].addActionListener((ActionListener) this);
			btns[i].setPreferredSize(new Dimension(90,90));
			
			if (i<9) {
				centPan2.add(btns[i]);	
				btns[i].setPreferredSize(new Dimension(90,90));
			}else if(i==10){
				topPan2.add(btns[i]);	
				btns[i].setPreferredSize(new Dimension(200,30));
				btns[i].setFont(new Font("Arial", Font.PLAIN, 10));
			}else {
				topPan1.add(btns[i]);
				btns[i].setPreferredSize(new Dimension(100,20));
				btns[i].setFont(new Font("Arial", Font.PLAIN, 15));
			}
		}
		
		//Creating Lables 
		for(int i=0; i<Lbs.length; i++) {
			Lbs[i] = new JLabel(Lbtxt[i]);
			Lbs[i].setFont(new Font("Arial", Font.PLAIN, 10));
			centPan1.add(Lbs[i]);
			switch (Lbtxt[i]) {
			case "NAME":
				
			}
		}
		
	}
}
