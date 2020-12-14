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
	
	
	
	
	public removeExpiredItems(ArrayList<item> refList) {
		List = refList;
		ArrayList<String> types = new ArrayList<String>();
		types.add("Luxury");
		types.add("Essential");
		types.add("Gift");
		ArrayList<item> expiredList = new ArrayList<item>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbtype = new JLabel("Item Type:"); //labels   
        typebox = new JComboBox();
        for(String t: types) {
        	typebox.addItem(t);
        }
        
        lbexpiryCheck = new JLabel("Todays Date:");
        lbformat = new JLabel("Date Format: dd-mm-yyyy");
        expiryEntered = new JTextField(10);
		
        submit = new JButton("Submit");
		cancel = new JButton("Cancel");
		
		//panel
		p1 = new JPanel(new GridLayout(10,10)); 
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
				Date date = null;
				boolean found = false;
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(dateInput);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
				
				//deleting a type of expired item
				for(item i: List) {
					
					if(i.getType().equalsIgnoreCase(itemType) && i.getDate().before(date)) {
						
						found = true;
						expiredList.add(i);
						
					}
					
				}//end for
				
				List.removeAll(expiredList);
				
				if (found = false) {
					JOptionPane.showMessageDialog(null, "There are no " +itemType +" items expired", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
					
				
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
