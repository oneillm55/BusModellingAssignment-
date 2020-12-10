import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addItemsGUI extends JFrame {

	private JPanel p1, p3;
	private JLabel lbtype, lbexpiryDate;
	private JButton submit, cancel;
	private JComboBox typebox;
	private JTextField expiryDate;
	
	ArrayList<item> List;
	ArrayList<String> types;
	
	
	public addItemsGUI(ArrayList<item> refList) {
		List = refList;
		
		types.add("Luxury");
		types.add("Essential");
		types.add("Gift");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbtype = new JLabel("Type:");  //labels
        lbexpiryDate = new JLabel("Expiry Date:");
        

        typebox = new JComboBox();
        for(String t: types) {
        	typebox.addItem(t);
        }
		expiryDate = new JTextField();
		
        submit = new JButton("Submit");
		cancel = new JButton("Cancel");
		
		p1 = new JPanel(new GridLayout(10,10)); //panel
		//p2 = new JPanel(new GridLayout(10,10));
	    p3 = new JPanel(new GridLayout(1,1));
		p1.add(lbtype);
		p1.add(typebox);
		p1.add(lbexpiryDate);
		p1.add(expiryDate);
		
		p3.add(submit);
		p3.add(cancel);
		
		p1.add(p3);
		add(p1);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				item anItem;
				double itemPrice = 0.00;
				int vat = 0;
				String itemType = (String)typebox.getSelectedItem(); //getting text from textfield
				if(itemType.equalsIgnoreCase("Luxury")) {
					itemPrice = 50.00;
					vat = 20;
				}
				else if(itemType.equalsIgnoreCase("Essential")) {
					itemPrice = 30.00;
					vat = 10;
				}
				else {
					itemPrice = 20.00;
					vat = 5;
				}
				String itemExpiry = expiryDate.getText(); //getting text from textfield
	
				anItem = new item(itemType, itemExpiry, itemPrice, vat);
				List.add(anItem); //adds a new car
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
