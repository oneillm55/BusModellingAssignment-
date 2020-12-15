import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class deleteItemGUI extends JFrame {

	private JPanel p1, p3;
	private JLabel lbsearch;
	private JButton submit, cancel;
	private JTextField productid;

	
	ArrayList<item> List;
	
	
	
	public deleteItemGUI(ArrayList<item> refList) {
		
		List = refList;
		
		ArrayList<item> removalList = new ArrayList<item>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbsearch = new JLabel("Enter Product ID:");  //labels   
		productid = new JTextField();
		
        submit = new JButton("Submit");
		cancel = new JButton("Cancel");
	
		p1 = new JPanel(new GridLayout(10,10)); //panel
	    p3 = new JPanel(new GridLayout(1,1));
		p1.add(lbsearch);
		p1.add(productid);
		
		
		p3.add(submit);
		p3.add(cancel);
		
		p1.add(p3);
		add(p1);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String itemID = productid.getText();
				boolean found = false;
				//deleting an item
				for(item i : List) {
					 //getting text from textfield
					if(i.getId().equalsIgnoreCase(itemID)) {
						
						found = true;
						removalList.add(i);		
					}
					
				}//end for
				
				List.removeAll(removalList);
				
				if(found = false) {
					JOptionPane.showMessageDialog(null, "Item Not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
				}else {
					
					JOptionPane.showConfirmDialog(null, "Item Deleted", "Confirmed", JOptionPane.OK_OPTION);	
					
					
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
