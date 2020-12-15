
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

	static double basketTotal = 0.00;
	private JPanel p1, p2, p3;
	private JLabel cart, total;
	private JButton exit;
	

	public calculatePrice(ArrayList<item> cBasket2)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		cart = new JLabel("Cart Contents: ");
		exit = new JButton("Exit");
		
		JTextArea displayAll = new JTextArea();
		displayAll.setPreferredSize(new Dimension(200,100));
		displayAll.setLineWrap(true);
	    displayAll.setWrapStyleWord(false);
		displayAll.setText(shoppingBasketGUI.cBasket.toString());
		
		total = new JLabel("Cart Total");
		JTextArea displayTotal = new JTextArea();
		displayTotal.setPreferredSize(new Dimension(100,100));
		displayTotal.setLineWrap(true);
		displayTotal.setWrapStyleWord(false);
		String fPrice = null;
		for(item i : shoppingBasketGUI.cBasket) {
			
			basketTotal =basketTotal+ (i.getPrice()+ ((i.getVat()/100)*i.getPrice()));	
		}
		fPrice = String.valueOf(basketTotal);
		displayTotal.setText(fPrice);
		
	

		p1.add(cart);
		p1.add(displayAll);
		
		p2.add(total);
		p2.add(displayTotal);
		p2.add(exit);
		
		p1.add(p2);
		add(p1);
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		
		
	}
	
	
}