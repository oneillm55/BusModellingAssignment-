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

public class removeExpiredItems extends JFrame {

	private JPanel p1, p3;
	private JLabel lbtype;
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
		
		lbtype = new JLabel("Type:");  //labels   

        typebox = new JComboBox();
        for(String t: types) {
        	typebox.addItem(t);
        }
		
        submit = new JButton("Submit");
		cancel = new JButton("Cancel");
		
		p1 = new JPanel(new GridLayout(10,10)); //panel
		//p2 = new JPanel(new GridLayout(10,10));
	    p3 = new JPanel(new GridLayout(1,1));
		p1.add(lbtype);
		p1.add(typebox);
		
		
		p3.add(submit);
		p3.add(cancel);
		
		p1.add(p3);
		add(p1);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String itemType = (String)typebox.getSelectedItem();
				boolean found = false;
				//deleting a type of expired item
				for(item i: List) {
					 //getting text from textfield
					if(i.getType().equalsIgnoreCase(itemType)) {
						List.remove(i);
						found = true;
					}
					else {
						found = false;
						JOptionPane.showMessageDialog(null, "There are no " +itemType +" items expired", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
						
					}
			
				dispose();	
				
			
			
		}});
		
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		
		
	}
}
