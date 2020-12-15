import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class shoppingBasketGUI extends JFrame{

	private JPanel p1, p2;
	private JLabel lbtype, lquantity;
	private JButton calculate, vBasket, addB, cancel;
	private JComboBox<item> type = new JComboBox<item>();;
	ArrayList<item> List;
	
	static ArrayList<item> cBasket = new ArrayList<>();
	
	ArrayList<item> selectedItems = new ArrayList<>();
	
	public shoppingBasketGUI(ArrayList<item> refList){
		
		List = refList;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lbtype = new JLabel("Item:");  
		for(item i : List){ 
	        type.addItem(i);
		}
		
		
		
		p1 = new JPanel(new GridLayout(10,10));
		p2 = new JPanel(new GridLayout(1,1));
		
		calculate = new JButton("Calculate");
		vBasket = new JButton("View Basket");
		addB = new JButton("Add to basket");
		cancel = new JButton("Exit");
		
		p1.add(lbtype);
		p1.add(type);
		
		p2.add(calculate);
		p2.add(vBasket);
		p2.add(addB);
		p2.add(cancel);
		p1.add(p2);
		add(p1);
		
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calculatePrice calculate = new calculatePrice(cBasket);
				calculate.setTitle("Calculate");
				calculate.setSize(500, 300);
				calculate.setVisible(true);
				dispose();
				
			}
		});
		
		vBasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(cBasket!=null) {
					displayBasketGUI display = new displayBasketGUI();
					display.setTitle("Display Basket Items");
					display.setSize(400, 300);
					display.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Basket Empty", "ERROR", JOptionPane.ERROR_MESSAGE);
					
				}
				
				
			}
		});
		
		addB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//add the item to basket
				cBasket.add((item) type.getSelectedItem());

				
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