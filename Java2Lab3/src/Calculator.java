import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator extends JFrame implements ActionListener{
	JPanel topPan,centPan, botPan;
	JButton btns[] = new JButton[16];
	String btnLb[] = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
	JButton cbtn = new JButton("C");
	JButton cebtn = new JButton("Ce");
	JButton bbtn = new JButton("<--");
	JButton signbtn = new JButton("+/-");
	float nbr1 = 0;
	float nbr2 = 0;
	float result = 0;
	String Oper = "";
	
	public Calculator() {
		this.setTitle("Calculator");
		this.setSize(400,600);
		this.setAlwaysOnTop(true);
		
		//Creating the Panels
		topPan = new JPanel();
		centPan = new JPanel();
		botPan = new JPanel();
		
		topPan.setBackground(Color.WHITE);
		centPan.setBackground(Color.WHITE);
		botPan.setBackground(Color.WHITE);
		
		// Insert the text box
				JTextField tf1 = new JTextField();
				tf1.setPreferredSize(new Dimension(350,50));
				tf1.setFont(new Font("Arial", Font.PLAIN, 40));
				tf1.setHorizontalAlignment(SwingConstants.RIGHT);
				topPan.add(tf1);
		
			
		//Buttons on center
		for(int i=0; i<btns.length; i++) {
			btns[i] = new JButton(btnLb[i]);
			centPan.add(btns[i]);
			btns[i].addActionListener(this);
			btns[i].setPreferredSize(new Dimension(90,90));
			btns[i].setFont(new Font("Arial", Font.PLAIN, 40));
			}	
		botPan.add(cbtn);	
		cbtn.addActionListener(this);
		cbtn.setPreferredSize(new Dimension(90,90));
		cbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		botPan.add(cebtn);	
		cebtn.addActionListener(this);	
		cebtn.setPreferredSize(new Dimension(90,90));
		cebtn.setFont(new Font("Arial", Font.PLAIN, 40));
		botPan.add(bbtn);	
		bbtn.addActionListener(this);
		bbtn.setPreferredSize(new Dimension(90,90));
		bbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		botPan.add(signbtn);	
		signbtn.addActionListener(this);
		signbtn.setPreferredSize(new Dimension(90,90));
		signbtn.setFont(new Font("Arial", Font.PLAIN, 40));
		
			// Adding action to buttons to numbers
			btns[0].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "7" );
				}
			});
			btns[1].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "8" );
				}
			});
			btns[2].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "9" );
				}
			});
			
			btns[4].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "4" );
				}
			});
			btns[5].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "5" );
				}
			});
			btns[6].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "6" );
				}
			});
			
			btns[8].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "1" );
				}
			});
			btns[9].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "2" );
				}
			});
			btns[10].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "3" );
				}
			});
			
			btns[12].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "0" );
				}
			});
			btns[13].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText(tf1.getText() + "." );
				}
			});
		
			// Creating action to operator buttons (= + * / -)
					
			btns[15].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String n1s = tf1.getText();
					if (n1s.isEmpty()==true) {
						nbr1 = 0;
					}else {
					nbr1 = Float.valueOf(tf1.getText());
					}
					Oper = "+";
					tf1.setText("");
					System.out.println("Number 1 is " + nbr1);
					System.out.println(Oper);
				}
			});
			btns[3].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String n1s = tf1.getText();
					if (n1s.isEmpty()==true) {
						nbr1 = 0;
					}else {
					nbr1 = Float.valueOf(tf1.getText());
					}
					Oper = "/";
					tf1.setText("");
					System.out.println("Number 1 is " + nbr1);
					System.out.println(Oper);
				}
			});
			btns[7].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String n1s = tf1.getText();
					if (n1s.isEmpty()==true) {
						nbr1 = 0;
					}else {
					nbr1 = Float.valueOf(tf1.getText());
					}
					Oper = "*";
					tf1.setText("");
					System.out.println("Number 1 is " + nbr1);
					System.out.println(Oper);
				}
			});
			btns[11].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String n1s = tf1.getText();
					if (n1s.isEmpty()==true) {
						nbr1 = 0;
					}else {
					nbr1 = Float.valueOf(tf1.getText());
					}
					Oper = "-";
					tf1.setText("");
					System.out.println("Number 1 is " + nbr1);
					System.out.println(Oper);
				}
			});

			//Main executor
			btns[14].addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					nbr2 = Float.valueOf(tf1.getText());
					if(Oper.equals("+")) {
						tf1.setText(Float.toString(nbr1 + nbr2));}
						else if (Oper.equals("*")) {
						tf1.setText(Float.toString(nbr1 * nbr2));}
						else if (Oper.equals("/")) {
						tf1.setText(Float.toString(nbr1 / nbr2));}
						else if(Oper.equals("-")) {
						tf1.setText(Float.toString(nbr1 - nbr2));}
					nbr1 = 0;
					System.out.println("Number 2 is " + nbr2);
					System.out.println("Result is " + tf1.getText());
				}
			});
			//Clear all button
			cbtn.addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText("");
					nbr1 = 0;
					nbr2 = 0;
				}
			});
			//Clear entry button
			cebtn.addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					tf1.setText("");
					
				}
			});
			bbtn.addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String content = tf1.getText();
					String back = content.substring(0, content.length() - 1);
					tf1.setText(back);	
				}
			});
			signbtn.addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String signcheck = tf1.getText();
					char first = signcheck.charAt(0);
					boolean positive = first=='-';
					if (positive == true) {
						String signcorrector = 	signcheck.substring(1);
						tf1.setText(signcorrector);	
					}else {
						tf1.setText("-"+tf1.getText());	
					}
				}
			});
		this.add(topPan, BorderLayout.NORTH);
		this.add(centPan, BorderLayout.CENTER);
		this.add(botPan, BorderLayout.SOUTH);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
