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
	private JLabel lbtype, lbexpiryDate, lbid;
	private JButton submit, cancel;
	private JComboBox typebox;
	private JTextField expiryDate, productID;
	
	ArrayList<item> List;
	
	
	public addItemsGUI(ArrayList<item> refList) {
		
		List = refList;
		
		List = refList;
		ArrayList<String> types = new ArrayList<String>();
		types.add("Luxury");
		types.add("Essential");
		types.add("Gift");
		item anitem1 = new item("L001", "Luxury", "02/04/2020", 50.0, 20.0);
		item anitem2 = new item("L002", "Luxury", "12/05/2020", 50.0, 20.0);
		item anitem3 = new item("L003", "Luxury", "25/12/2020", 50.0, 20.0);
		List.add(anitem1);
		List.add(anitem2);
		List.add(anitem3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lbid = new JLabel("Product ID: ");
		lbtype = new JLabel("Type:");  //labels
        lbexpiryDate = new JLabel("Expiry Date:");
        
        productID = new JTextField();
        typebox = new JComboBox();
        for(String t: types) {
        	typebox.addItem(t);
        }
		expiryDate = new JTextField();
		
        submit = new JButton("Submit");
		cancel = new JButton("Cancel");
		
		p1 = new JPanel(new GridLayout(10,10)); //panel
	    p3 = new JPanel(new GridLayout(1,1));
	    p1.add(lbid);
	    p1.add(productID);
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
				int qty = 10;

				String pID = productID.getText();
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
	

				//anItem = new item(itemType, itemExpiry, itemPrice, vat, qty);
				//List.add(anItem); //adds a new car

				anItem = new item(pID, itemType, itemExpiry, itemPrice, vat);
				List.add(anItem); //adds a new Item
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
