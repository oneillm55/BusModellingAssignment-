import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class displayGUI extends JFrame {

	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JButton returnB, newItem; 
	private JLabel itemlist1;
	
	ArrayList<item> List;
	
	public displayGUI(ArrayList<item> refitem) {
		
		List = refitem;
		makeGUI();
	}

	private void makeGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		itemlist1 = new JLabel("List of Items are as follows: ");
		JTextArea displayAll = new JTextArea();
		displayAll.setPreferredSize(new Dimension(370,300));
		displayAll.setLineWrap(true);
	    displayAll.setWrapStyleWord(false);
		displayAll.setText(List.toString());
		
		returnB = new JButton("Return to Menu");
		newItem = new JButton("Add New Item");
		
		
		p1.add(itemlist1);
		p2.add(displayAll);
		p3.add(returnB);
		p3.add(newItem);
		//p1.add(newCar);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		returnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		
		newItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addItemsGUI item = new addItemsGUI(List);
				item.setTitle("Add an Item");
				item.setSize(400, 300);
				item.setVisible(true);
				dispose();
			}
		});
		
	}
	
	public static void main(String[] args) {
		displayGUI displayGUI = new displayGUI(new ArrayList<item>());
		displayGUI.setTitle("Display Items");
		displayGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayGUI.setSize(300, 300);
		displayGUI.setVisible(true);

	
		
	}
}
