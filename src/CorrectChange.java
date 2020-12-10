import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CorrectChange  extends JFrame{
	//create variables that will hold the numbers used in the calculations
	double amountPaid=0;
	
	//remove this line once basket functionality is added
	double basketTotal=0;
	
	public CorrectChange(){

		//create all the required panels, and buttons and textFeilds
		JPanel panel = new JPanel();
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bC = new JButton("Clear");
		JButton bChange = new JButton("=");
	
		
		JTextField display = new JTextField(30);
		display.setEditable(false);//means the user can only edit the display via the buttons
		display.setHorizontalAlignment(SwingConstants.RIGHT);//Aligns the text in the display to the right
		panel.add(display);//tells the text field to span the panel and wrap after it 
		
		JTextArea changeDisplay = new JTextArea();
		changeDisplay.setPreferredSize(new Dimension(370,300));
		changeDisplay.setLineWrap(true);
		changeDisplay.setWrapStyleWord(false);
		
		
		
		
		panel.add(bC);

		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		panel.add(b4);
		panel.add(b5);
		panel.add(b6);


		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b0);
		
		panel.add(bChange);
		panel.add(changeDisplay);
		
		//row 6
	
		add(panel, BorderLayout.CENTER);
		
		//set action listeners for each of the buttons
		
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//resets all the values stored in the calculator
				display.setText(null);
				amountPaid=0;
				
			}
		});

		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String num = display.getText() + b7.getText();
					display.setText(num);
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String num = display.getText() + b8.getText();
					display.setText(num);
					
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String num = display.getText() + b9.getText();
					display.setText(num);
					
			}
		});
		
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
					String num = display.getText() + b4.getText();
					display.setText(num);
				
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
					String num = display.getText() + b5.getText();
					display.setText(num);
				
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + b6.getText();
					display.setText(num);
					
			}
		});
	
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + b1.getText();
					display.setText(num);
					
					
				
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + b2.getText();
					display.setText(num);
					
				
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + b3.getText();
					display.setText(num);
					
			}
		});
	
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + b0.getText();
					display.setText(num);
					
			}
		});
		
		bChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//take the number in the display feild, minus basket from it 
				double changeNeeded= Double.parseDouble(display.getText()) -basketTotal;
				changeDisplay.setText(getNotes(changeNeeded));
					
			}
		});
		
		
	}
	
	public String getNotes(double change ) {
		 String changeNeeded="";
	      
	      int fiftyNoteNeeded=0;
	      int twentyNoteNeeded=0;
	      int tenNoteNeeded=0;
	      int fiveNoteNeeded=0;
	      int fiftyCentNeeded=0;
	      int twentyCentNeeded=0;
	      int tenCentNeeded=0;
	      int fiveCentNeeded=0;
	      int oneCentNeeded=0;
	      
	      double changeRemaining= change;//this gets the value of the change and be updated every time a new number of notes is calculated
	      
	      //get the amount of notes needed and subtract this value from changeRemaining
	      if(changeRemaining/50.00>=1) {
	    	  fiftyNoteNeeded=(int) (changeRemaining/50.00);
	    	  changeRemaining=Math.round((changeRemaining-(fiftyNoteNeeded*50.00)) * 100.0) / 100.0;//round the new value to 2 decimal places 
	      }
	      
	      if(changeRemaining/20.00>=1) {
	      twentyNoteNeeded=(int) (changeRemaining/20.00);
	      changeRemaining=Math.round((changeRemaining-(twentyNoteNeeded*20.00)) * 100.0) / 100.0;
	      }
	      
	      if(changeRemaining/10.00>=1) {
	      tenNoteNeeded=(int) (changeRemaining/10.00);
	      changeRemaining=Math.round((changeRemaining-(tenNoteNeeded*10.00)) * 100.0) / 100.0;
	      }
	      
	      if(changeRemaining/5.00>=1) {
	      fiveNoteNeeded=(int) (changeRemaining/5.00);
	      changeRemaining=Math.round((changeRemaining-(fiveNoteNeeded*5.00)) * 100.0) / 100.0;
	      }
	      
	      if(changeRemaining/0.50>=1) {
		  fiftyCentNeeded=(int) (changeRemaining/0.50);
		  //changeRemaining=changeRemaining-(fiftyCentNeeded*0.50);
		  changeRemaining=Math.round((changeRemaining-(fiftyCentNeeded*0.50)) * 100.0) / 100.0;
		  } 
	      
	      
	      if(changeRemaining/0.20>=1) {
		  twentyCentNeeded=(int) (changeRemaining/0.20);
		  changeRemaining=Math.round((changeRemaining-(twentyCentNeeded*0.20)) * 100.0) / 100.0;
		  }

	      
	      if(changeRemaining/0.10>=1) {
		  tenCentNeeded=(int) (changeRemaining/0.10);
		 // changeRemaining=changeRemaining-(tenCentNeeded*0.10);
		  changeRemaining=Math.round((changeRemaining-(tenCentNeeded*0.10)) * 100.0) / 100.0;
		  }

	      
	      if(changeRemaining/0.05>=1) {
		  fiveCentNeeded=(int) (changeRemaining/0.05);
		  changeRemaining=Math.round((changeRemaining-(fiveCentNeeded*0.05)) * 100.0) / 100.0;
		  }

	      if(changeRemaining/0.01>=1) {
			  oneCentNeeded=(int) (changeRemaining/0.01);
			  changeRemaining=Math.round((changeRemaining-(oneCentNeeded*0.01)) * 100.0) / 100.0;
	      }
	      changeNeeded="Fifty Notes:"+fiftyNoteNeeded+"\nTwenty notes:"+twentyNoteNeeded+"\nTen notes:"+tenNoteNeeded+"\nFive notes:"+fiveNoteNeeded+
	    		  "\nFifty cent coin:"+ fiftyCentNeeded +"\nTwenty cent coin:"+ twentyCentNeeded+"\nTen cent coin:"+ tenCentNeeded
	    		  +"\nFive cent coin:"+ fiveCentNeeded+"\nOne cent coin:"+ oneCentNeeded;
	      
		return changeNeeded;
	}

	//main method 
	public static void main(String[] args) {
		CorrectChange calc = new CorrectChange();
		calc.setTitle("Calculator");
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(300,270);
		calc.setVisible(true);

	}
}