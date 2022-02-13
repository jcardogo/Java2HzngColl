package Lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MGP extends JPanel implements ActionListener{
	JPanel topPan,centPan, botPan, topPan1, topPan2, centPan1, centPan2, botPan1, botPan2, topPan11, topPan12, centPan11, centPan12, centPan21, centPan22, centPan23, botPan11, botPan12, botPan21, botPan22, botPan23, topPan121, topPan122;
	int lvn = 10, tries=0,  trycount = 0, GPcount = 00, GWcount = 00, GLcount =00, triesleft=0, pricenumber = 0, btnpricen =0;
	boolean WoL = false, started = false;
	JButton NAME = new JButton("NAME");
	JButton PLAY = new JButton("START");
	JPanel centPan221 = new JPanel();
	String [] options = new String [(lvn*lvn)];
	String name = "";
	String Lbtxt[] = {"SELECT LEVEL: ", "LEVEL: ", "TRIES: ", "GAME PLAYED: ", "GAME WON: ", "GAME LOST: ", "PLAYER NAME"};
	JLabel Lbs [] = new JLabel[7];
	String Levels[] = {"EASY", "MEDIUM", "HARD"};
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
		
		//Adding the panels
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
		centPan22.setBackground(Color.RED);
		
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
		
		topPan11.add(NAME);
		NAME.setPreferredSize(new Dimension(200,20));
		NAME.setFont(new Font("Arial", Font.PLAIN, 10));

		
		//Creating Labels 
		for(int i=0; i<Lbs.length; i++) {
			Lbs[i] = new JLabel(Lbtxt[i]);
			Lbs[i].setPreferredSize(new Dimension(100,20));
			Lbs[i].setBackground(Color.gray);
		}
		
		// Panel content
		// Panel top 
		
		JComboBox <String> Level = new JComboBox<String>(Levels);
		Level.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
			String s = (String) Level.getSelectedItem();//get the selected item 
			switch (s) {//check for a match
                case "EASY":
                	lvn=3;
                	tries = 3;
                	Lvl = "EASY";
                    break;
                case "MEDIUM":
                	lvn = 5;                            
                	tries = 5;
                	Lvl = "MEDIUM";
                	break;
                case "HARD":
                	lvn = 10;
                	tries = 10;
                	Lvl = "HARD";
                	break;  
            	}
			topPan2.add(PLAY);
			PLAY.setPreferredSize(new Dimension(150,60));
			PLAY.setFont(new Font("Arial", Font.PLAIN, 25));
			topPan12.removeAll();
			}
		});
		

		
		
		//ENTERING THE NAME
		NAME.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				do{
					name = JOptionPane.showInputDialog(null, "Please enter your name: ", "Name popup", JOptionPane.PLAIN_MESSAGE);	
						if(!name.equals("")) {
							//SELECTING THE LEVEL
							topPan122.add(Level);
							Level.setPreferredSize(new Dimension(150,20));
							Level.setFont(new Font("Arial", Font.PLAIN, 12));
							topPan121.add(Lbs[0]);
							JLabel nmlb = new JLabel(name);
							botPan11.add(nmlb);
							topPan11.removeAll();
						}
						else{
							JOptionPane.showMessageDialog(null, "No Name entered!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
						}
				}while(name.equals(""));	
			}
			

		});
		
		
		//PLAY BUTTON
		PLAY.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				// TODO Auto-generated method stub//topPan.removeAll();
					//Creating the price button ID
						new creatinggrid();
						new showlabels();
						topPan2.removeAll();
			}
		});		
	}
	public class btnsPress implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		      JButton btn = (JButton) e.getSource();
		      do{
		    	  btn.setBackground(Color.DARK_GRAY);
		    	  centPan12.removeAll();
		    	  tries--;
		    	  System.out.println(tries);
		    	  JLabel triesl = new JLabel("TRIES: " + String.valueOf(tries));
		    	  centPan12.add(triesl);
	    		  triesl.setPreferredSize(new Dimension(80,20));
	    		  triesl.setFont(new Font("Arial", Font.PLAIN, 12));
			      
		      }while(Integer.valueOf(tries)<0);
		      if (Integer.valueOf(tries)==0) {
		    	  botPan12.removeAll();
		    	  JLabel LOSE = new JLabel ("LOSE");
	    		  botPan12.add(LOSE);
		    	  int out = JOptionPane.showConfirmDialog(null,"Would you like to play again?","YOU LOSE", JOptionPane.YES_NO_OPTION);
		    	  GLcount++;
		    	  GPcount++;
		    	  if( out==1) {
		    		  JOptionPane.showMessageDialog(null, "Hasta la vista Baby", "bye", JOptionPane.INFORMATION_MESSAGE);
		    		  System.exit(0);
		    	  }else {
		    		  JOptionPane.showMessageDialog(null, "Lets Play Again", "play", JOptionPane.INFORMATION_MESSAGE);
		    		  tries=lvn;
		    		  centPan221.removeAll();
		    		  new creatinggrid();
		    		  centPan22.add(centPan221);
		    		  centPan221.setPreferredSize(new Dimension(270,270));
		    		  centPan221.setFont(new Font("Arial", Font.PLAIN, 12));
			    	  new showlabels();
		    	  }
		      }
		}
	
	}
	public class btnsPressw implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		      JButton btn = (JButton) e.getSource();
			      botPan12.removeAll();
		      	  JLabel WIN = new JLabel ("WIN");
	    		  WIN.setSize(20,20);
		      	  botPan12.add(WIN);
		    	  btn.setBackground(Color.GREEN);
		    	  int out = JOptionPane.showConfirmDialog(null,"Would you like to play again?","YOU WIN", JOptionPane.YES_NO_OPTION);
		    	  GWcount++;
		    	  GPcount++;
		    	  if( out==1) {
		    		  JOptionPane.showMessageDialog(null, "Hasta la vista Baby", "bye", JOptionPane.INFORMATION_MESSAGE);
		    		  System.exit(0);
		    	  }else {
		    		  JOptionPane.showMessageDialog(null, "Lets Play Again", "play", JOptionPane.INFORMATION_MESSAGE);
		    		  tries=lvn;
		    		  centPan221.removeAll();
		    		  new creatinggrid();
		    		  centPan22.add(centPan221);
		    		  centPan221.setPreferredSize(new Dimension(270,270));
		    		  centPan221.setFont(new Font("Arial", Font.PLAIN, 12));
		    		  new showlabels();
		    	  }
		}
	
	}
	public class showlabels {
		public showlabels(){
			centPan11.removeAll();
			centPan12.removeAll();
			botPan21.removeAll();
			botPan22.removeAll();
			botPan23.removeAll();
			Lbs[1]= new JLabel ("LEVEL: " + Lvl);
			Lbs[2]= new JLabel ("TRIES: " + tries);
			Lbs[2].setPreferredSize(new Dimension(80,20));
			Lbs[2].setFont(new Font("Arial", Font.PLAIN, 12));
			Lbs[3]= new JLabel ("GAMES PLAYED " + GPcount);
			Lbs[4]= new JLabel ("GAME WON: " + GWcount);
			Lbs[5]= new JLabel ("GAME LOST " + GLcount);
			centPan12.add(Lbs[2]);
			botPan23.add(Lbs[5]);
			botPan22.add(Lbs[4]);
			botPan21.add(Lbs[3]);
			centPan11.add(Lbs[1]);
		}
		
	}
	public class creatinggrid {
		public creatinggrid() {
			int price = (int) (Math.random()*(lvn*lvn));
			for (int i=0; i< options.length; i++) {
				options[i]=Integer.toString(i);
				if (Integer.valueOf(options[i])==price) {
					options[i] = "PRICE";
				}else {} 
			}
			System.out.println(price);
			//Creating the grid  
			centPan221.setLayout(new GridLayout(lvn,lvn));
			JButton btns[] = new JButton[lvn*lvn];
				for(int i=0; i<btns.length; i++) {
						btns[i] = new JButton(options[i]);
						btns[i].setFont(new Font("Arial", Font.PLAIN, 1));
						centPan221.add(btns[i]);	
						btns[i].setPreferredSize(new Dimension((270/lvn),(270/lvn)));
						if(btns[i].getText()=="PRICE") {
							btns[i].addActionListener(new btnsPressw());
							//btns[i].setBackground(Color.GREEN);
						}else {
						btns[i].addActionListener(new btnsPress());
						}
				}
				centPan22.add(centPan221);
				centPan221.setPreferredSize(new Dimension(270,270));
				centPan221.setFont(new Font("Arial", Font.PLAIN, 12));		
		}
	}

}
