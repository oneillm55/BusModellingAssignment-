import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class removeExpiredItems extends JFrame {

	private JPanel p1, p3;
	private JLabel lbtype, lbexpiryCheck, lbformat;
	private JTextField expiryEntered; 
	private JButton submit, cancel;
	private JComboBox typebox;
	
	ArrayList<item> List;
	ArrayList<String> types;
	
	
	public removeExpiredItems(ArrayList<item> refList) {
		List = refList;
		
		types.add("Luxury");
		types.add("Essential");
		types.add("Gift");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbtype = new JLabel("Type:"); //labels   
        typebox = new JComboBox();
        for(String t: types) {
        	typebox.addItem(t);
        }
        
        lbexpiryCheck = new JLabel("Todays Date:");
        lbformat = new JLabel("Date Format: dd-mm-yyyy");
        expiryEntered = new JTextField(10);
		
        submit = new JButton("Submit");
		cancel = new JButton("Cancel");
		
		p1 = new JPanel(new GridLayout(10,10)); //panel
		//p2 = new JPanel(new GridLayout(10,10));
	    p3 = new JPanel(new GridLayout(1,1));
		p1.add(lbtype);
		p1.add(typebox);
		p1.add(lbexpiryCheck);
		p1.add(lbformat);
		p1.add(expiryEntered);
		
		
		p3.add(submit);
		p3.add(cancel);
		
		p1.add(p3);
		add(p1);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String itemType = (String)typebox.getSelectedItem();
				String dateInput = expiryEntered.getText();
				int input = Integer.parseInt(dateInput);
				boolean found = false;
				//deleting a type of expired item
				for(item i: List) {
					 //getting text from textfield
					int itemExpiry = Integer.parseInt(i.getExpiry());
					if(i.getType().equalsIgnoreCase(itemType) && itemExpiry >= input) {
						List.remove(i);
						found = true;
					}
					else {
						found = false;
						JOptionPane.showMessageDialog(null, "There are no " +itemType +" items expired", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
						
					}//end for
				
			
				dispose();	
				
			
			
		}
				
		});
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		
		
	}
}
