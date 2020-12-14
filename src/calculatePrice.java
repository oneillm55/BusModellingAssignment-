import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class calculatePrice extends JFrame{

	private JPanel p1, p2, p3;
	private JLabel cart, total;
	private JButton exit;
	
	ArrayList<item> cBasket;

	public calculatePrice(ArrayList<item> cBasket2)
	{
		cBasket2 = cBasket;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		cart = new JLabel("Cart Contents: ");
		JTextArea displayAll = new JTextArea();
		displayAll.setPreferredSize(new Dimension(370,300));
		displayAll.setLineWrap(true);
	    displayAll.setWrapStyleWord(false);
		displayAll.setText(cBasket.toString());
		
		total = new JLabel("Cart Total");
		JTextArea displayTotal = new JTextArea();
		displayTotal.setPreferredSize(new Dimension(370,300));
		displayTotal.setLineWrap(true);
		displayTotal.setWrapStyleWord(false);
		for(item i : cBasket) {
			double finalPrice;
			String fPrice;
			finalPrice = i.basketTotal();
			fPrice = String.valueOf(finalPrice);
			displayTotal.setText(fPrice);
			
		}
		
		
		
		//EITHER ADD ITEMS INTO COMBO BOX AND PICK THE ONE TO CLEAR
		//OR CLEAR BASKET BUTTON
		
		
		
		/*
		clear.addActionListener(new ActionListener() {
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
		
		p2.add(total);
		p2.add(displayTotal);
		
		p3.add(exit);
		add(p1);
		
	}
	
	
}
