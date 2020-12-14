import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class displayBasketGUI extends JFrame{
	
	private JPanel p1, p2;
	private JLabel cart;
	private JButton submit, cancel;
	private JTextArea txtArea;
	private JButton exit, clear;
	private JComboBox basketContents;
	
	ArrayList<item> cBasket;

	public displayBasketGUI(ArrayList<item> cBasket2)
	{
		cBasket2 = cBasket;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		basketContents = new JComboBox();
		
		for(item i : cBasket){ 
			basketContents.addItem(i);
		}
		
		cart = new JLabel("Cart Contents: ");
		
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(item i : cBasket)
				{
					
					if(i.getType().equals(basketContents.getSelectedItem()))
						{
							cBasket.remove(i);
						}
						dispose();
				}
				
			}
		});
		
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		
		p1.add(cart);
		p1.add(basketContents);
		p2.add(exit);
		p2.add(clear);
		p1.add(p2);
		add(p1);
		
	}

	
}
