import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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

	public displayBasketGUI(List<item> cBasket2)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		JTextArea displayAll = new JTextArea();
		displayAll.setPreferredSize(new Dimension(370,300));
		displayAll.setLineWrap(true);
	    displayAll.setWrapStyleWord(false);
		displayAll.setText(cBasket2.toString());
		
		cart = new JLabel("Cart Contents: ");
		
		
		p1.add(cart);
		p1.add(displayAll);
		//p1.add(p2);
		add(p1);
		
	}

	
}
