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
	
	private JPanel p1;
	private JLabel cart;
	private JButton submit, cancel;
	private JTextArea txtArea;
	private JButton exit;
	
	ArrayList<basket> cBasket;

	public displayBasketGUI(ArrayList<basket> cBasket2)
	{
		cBasket2 = cBasket;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		
		cart = new JLabel("Cart Contents: ");
		JTextArea displayAll = new JTextArea();
		displayAll.setPreferredSize(new Dimension(370,300));
		displayAll.setLineWrap(true);
	    displayAll.setWrapStyleWord(false);
		displayAll.setText(cBasket.toString());
		
		
		//EITHER ADD ITEMS INTO COMBO BOX AND PICK THE ONE TO CLEAR
		//OR CLEAR BASKET BUTTON
		
		
		
		/*
		returnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				dispose();
				
			}
		});
		*/
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		
		p1.add(cart);
		p1.add(displayAll);
		p1.add(exit);
		add(p1);
		
	}
}
