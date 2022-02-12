package Lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger.Level;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MGP extends JPanel implements ActionListener{
	JPanel topPan,centPan, botPan, topPan1, topPan2, centPan1, centPan2, botPan1, botPan2, topPan11, topPan12, centPan11, centPan12, centPan21, centPan22, centPan23, botPan11, botPan12, botPan21, botPan22, botPan23, topPan121, topPan122;
	int lvn = 3, trycount = 0, GPcount = 00, GWcount = 00, GLcount =00, triesleft=0 ;
	boolean WoL = false, play = false;
	JPanel centPan221 = new JPanel();
	String [] options = new String [lvn*lvn];
	String name = "";
	String Lbtxt[] = {"LEVEL: ", "LEVEL: ", "TRIES: ", "GAME PLAYED: ", "GAME WON: ", "GAME LOST: ", "PLAYER NAME"};
	JLabel Lbs [] = new JLabel[7];
	String Levels[] = {"EASY       ", "MEDIUM      ", "HARD       "};
	String Lvl = "";
	
	public MGP() {
		
		
		// Creating Panels
		topPan = new JPanel();
		topPan.setLayout(new BorderLayout());
		topPan1 = new JPanel();
		topPan11 = new JPanel();
		topPan12 = new JPanel();
		topPan121 = new JPanel();
		topPan122 = new JPanel();
		topPan2 = new JPanel();
		centPan = new JPanel();
		centPan.setLayout(new BorderLayout());
		centPan1 = new JPanel();
		centPan1.setLayout(new BorderLayout());
		centPan2 = new JPanel();
		centPan11 = new JPanel();
		centPan11.setSize(50,100);
		centPan12 = new JPanel();
		centPan11.setSize(50,100);
		centPan21 = new JPanel();
		centPan22 = new JPanel();
		centPan22.setSize(300,300);
		centPan23 = new JPanel();
		
		
		
		botPan = new JPanel();
		botPan.setLayout(new BorderLayout());
		botPan1 = new JPanel();
		botPan2 = new JPanel();
		botPan11 = new JPanel();
		botPan12 = new JPanel();
		botPan21 = new JPanel();
		botPan22 = new JPanel();
		botPan23 = new JPanel();
		
		
		this.setLayout(new BorderLayout());
		this.add(topPan, BorderLayout.NORTH);
		this.add(centPan, BorderLayout.CENTER);
		this.add(botPan, BorderLayout.SOUTH);
		topPan.add(topPan1, BorderLayout.WEST);
		topPan.add(topPan2, BorderLayout.EAST);
		topPan1.setLayout(new BorderLayout());
		topPan1.add(topPan11, BorderLayout.NORTH);
		topPan1.add(topPan12, BorderLayout.SOUTH);
		topPan12.setLayout(new BorderLayout());
		topPan12.add(topPan121, BorderLayout.WEST);
		topPan12.add(topPan122, BorderLayout.EAST);
		
		centPan.add(centPan1, BorderLayout.NORTH);
		centPan.add(centPan2, BorderLayout.CENTER);
		centPan1.setLayout(new BorderLayout());
		centPan1.add(centPan11, BorderLayout.WEST);
		centPan1.add(centPan12, BorderLayout.EAST);
		centPan2.add(centPan21, BorderLayout.WEST);
		centPan2.add(centPan22, BorderLayout.CENTER);
		centPan2.add(centPan23, BorderLayout.EAST);
		centPan22.setLayout(new GridLayout(0,1));
		
		botPan.add(botPan1, BorderLayout.EAST);
		botPan1.setLayout(new BorderLayout());
		botPan1.add(botPan11, BorderLayout.NORTH);
		botPan1.add(botPan12, BorderLayout.SOUTH);
		botPan.add(botPan2, BorderLayout.WEST);
		botPan2.setLayout(new BorderLayout());
		botPan2.add(botPan21, BorderLayout.NORTH);
		botPan21.setLayout(new BorderLayout());
		botPan2.add(botPan22, BorderLayout.CENTER);
		botPan22.setLayout(new BorderLayout());
		botPan2.add(botPan23, BorderLayout.SOUTH);
		botPan23.setLayout(new BorderLayout());
		
		//Creating the buttons
		
		JButton PLAY = new JButton(" PLAY ");
		topPan2.add(PLAY);	
		PLAY.setPreferredSize(new Dimension(150,60));
		PLAY.setFont(new Font("Arial", Font.PLAIN, 25));
		
		JButton NAME = new JButton("NAME");
		topPan11.add(NAME);
		NAME.setPreferredSize(new Dimension(200,20));
		NAME.setFont(new Font("Arial", Font.PLAIN, 10));
		
		//Creating Labels 
		for(int i=0; i<Lbs.length; i++) {
			Lbs[i] = new JLabel(Lbtxt[i]);
			Lbs[i].setPreferredSize(new Dimension(100,20));
			Lbs[i].setFont(new Font("Arial", Font.PLAIN, 10));
		}
		
		// Panel content
		// Panel top 
		topPan121.add(Lbs[0]);
		gridcreation();
		
		JComboBox <String> Level = new JComboBox<String>(Levels);
		Level.addActionListener(this);
		Level.addActionListener(new ActionListener() {
			int tries = 0 ;
			@Override
            public void actionPerformed(ActionEvent e) { 
			String s = (String) Level.getSelectedItem();//get the selected item 
			switch (s) {//check for a match
                case "EASY       ":
                	lvn=3;
                	tries = 3;
                    break;
                case "MEDIUM      ":
                	lvn = 5;                            
                	tries = 5;
                	break;
                case "HARD       ":
                	lvn = 10;
                	tries = 10;
                    break;  
            	}
			System.out.println(s);
			gridcreation();
			}
			private void gridcreation() {
				// TODO Auto-generated method stub
				centPan22.removeAll();
				centPan12.removeAll();

				int price = (int) (Math.random()*(lvn*lvn));
				for (int i=0; i< options.length; i++) {
					options[i]=Integer.toString(i);
					if (Integer.valueOf(options[i])==price) {
						options[i] = "PRICE";
					}else {
					}
				}
				System.out.println(price);
				centPan221.setLayout(new GridLayout(lvn,lvn));
				class btnsPress implements ActionListener {
					public void actionPerformed(ActionEvent e) {
					      JButton btn = (JButton) e.getSource();
					      btn.setBackground(Color.DARK_GRAY);
					      tries--;
					}
				} 
				JButton btns[] = new JButton[lvn*lvn];
					for(int i=0; i<btns.length; i++) {
							btns[i] = new JButton(options[i]);
							btns[i].setFont(new Font("Arial", Font.PLAIN, 5));
							centPan221.add(btns[i]);	
							btns[i].setPreferredSize(new Dimension((270/lvn),(270/lvn)));
							btns[i].addActionListener(new btnsPress());		
					}
				centPan22.add(centPan221);
				JLabel trs = new JLabel("TRIES:                       " + Integer.toString(tries));
				centPan12.add(trs);
			}
		});
		
		NAME.addActionListener(this);
		NAME.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//do{
					name = JOptionPane.showInputDialog("Wha is your name?");
					//if(name != null)
						System.out.println("Your name is: " + name);
					//else
						//JOptionPane.showMessageDialog(null, "No Name entered!");
				//}while(name == null);
						JLabel nmlb = new JLabel(name);
						botPan11.add(nmlb);
			}

		});
		
		//PLAY.addActionListener(this);
		//PLAY.addActionListener(new ActionListener() {
			//@Override
			//public void actionPerformed(ActionEvent e) {
			//play = true; 
		//	}
			//});
		
		
		
		
		
		//Creating bottom panel
		
		//String Lbtxt[] = {"NAME", "LEVEL: ", "TRIES: ", "GAME PLAYED: ", "GAME WON: ", "GAME LOST: ", "PLAYER NAME"};
		
		
		
		
		/*
		btns[(lvn*lvn)+2].addActionListener(this);
		btns[(lvn*lvn)+2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name;
				do{
					name = JOptionPane.showInputDialog("Wha is your name?");
					if(name != null)
						System.out.println("Your name is: " + name);
					else
						JOptionPane.showMessageDialog("No Name entered!");
					
				}while(name == null);
				
			}

		});
		*/
		
		
		topPan122.add(Level);
		
		centPan11.add(Lbs[1]);
		centPan12.add(Lbs[2]);
		
		botPan21.add(Lbs[3]);
		botPan22.add(Lbs[4]);
		botPan23.add(Lbs[5]);

	}
	
	public void gridcreation() {
		// TODO Auto-generated method stub
			centPan22.removeAll();
			//centPan12.removeAll();

			int price = (int) (Math.random()*(lvn*lvn));
			for (int i=0; i< options.length; i++) {
				options[i]=Integer.toString(i);
				if (Integer.valueOf(options[i])==price) {
					options[i] = "PRICE";
				}else {
				}
			}
			System.out.println(price);
			centPan221.setLayout(new GridLayout(lvn,lvn));
			class btnsPress implements ActionListener {
				public void actionPerformed(ActionEvent e) {
				      JButton btn = (JButton) e.getSource();
				      btn.setBackground(Color.DARK_GRAY);
				      tries--;
				}
			} 
			JButton btns[] = new JButton[lvn*lvn];
				for(int i=0; i<btns.length; i++) {
						btns[i] = new JButton(options[i]);
						btns[i].setFont(new Font("Arial", Font.PLAIN, 5));
						centPan221.add(btns[i]);	
						btns[i].setPreferredSize(new Dimension((270/lvn),(270/lvn)));
						btns[i].addActionListener(new btnsPress());		
				}
			centPan22.add(centPan221);
	}

	/*//Action listeners for the grid buttons
	btns[i].addActionListener(this);
	btns[i].addActionListener(new ActionListener() {
		JButton tb = btns
		@Override
		public void actionPerformed(ActionEvent e) {
			btns[i].setBackground(Color.DARK_GRAY);
		}
	});
	*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
