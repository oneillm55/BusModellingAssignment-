import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MainGUI extends JFrame {

	private JPanel panel1;
	private JPanel panel2;
	private JButton displayitem;
	private JButton additem;
	private JButton deleteitem;
	private JButton exit;
	
	private ArrayList<item> itemlist;
	protected Component frame;
	
	public MainGUI() {
		
		makeGUI();
	}

	private void makeGUI() {
		//ArrayList
		itemlist = new ArrayList<item>();
		//Making Panels
		panel1 = new JPanel(); 
		panel1 = new JPanel(new GridLayout(2,2));
		//adding all four buttons for the different options
		additem = new JButton("Add New Item"); 
		displayitem = new JButton("Display Cars");
		deleteitem = new JButton("Search");
		exit = new JButton("Exit");
		
		panel1.add(additem); //Adding buttons to the panel
		panel1.add(displayitem);
		panel1.add(deleteitem);
		panel1.add(exit);
		add(panel1, BorderLayout.CENTER);
		
		additem.addActionListener(new ActionListener() {    //Making the add car window
			public void actionPerformed(ActionEvent e) {
				addItemsGUI item = new addItemsGUI(itemlist);
				item.setTitle("Add an Item");
				item.setSize(400, 300);
				item.setVisible(true);
				
			}
		});
		
		displayitem.addActionListener(new ActionListener() { //Making the display Car window
			public void actionPerformed(ActionEvent e) {
				
				displayGUI display = new displayGUI(itemlist);
				display.setTitle("Display Items");
				display.setSize(400, 300);
				display.setVisible(true);
				
				
			}
		});
		
		deleteitem.addActionListener(new ActionListener() { //Making the search car window 
			public void actionPerformed(ActionEvent e) {
				
				deleteItemGUI delete = new deleteItemGUI(itemlist);
				delete.setTitle("Delete Items");
				delete.setSize(400, 300);
				delete.setVisible(true);
				
				
			}
		});
		
		exit.addActionListener(new ActionListener() { //exit system
			public void actionPerformed(ActionEvent e) { //yes no cancel option given
				int option = JOptionPane.showConfirmDialog(frame,"Are you sure you wish to exit?", "Please Pick an option", JOptionPane.YES_NO_CANCEL_OPTION);  
				
				if(option==JOptionPane.YES_OPTION) {
					System.exit(0); //closes the system
					
					
					if(option!=JOptionPane.NO_OPTION) {
						remove(option);
					}
						
					if(option!=JOptionPane.CANCEL_OPTION) {
						remove(option);
					}
				}
				
				
			}
		
		});
	}
		
	
	
	
	public static void main(String[] args) 
	{	
		MainGUI mainGUI = new MainGUI();
		mainGUI.setTitle("Main Windiow");
		mainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainGUI.setSize(400, 300);
		mainGUI.setVisible(true);		
		
	}
}
