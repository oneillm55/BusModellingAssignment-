import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
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
	//private JTextField carT, plateNo; 
	//private JSpinner carYear, s, s1;
	private JButton calculate, vBasket, addB;
	private JComboBox type, quan;
	ArrayList<item> List;
	
	ArrayList<item> cBasket = new ArrayList<item>();
	
	ArrayList<item> selectedItems = new ArrayList<item>();
	
	public shoppingBasketGUI(ArrayList<item> refList){
		List = refList;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//types.add("Luxury");
		//types.add("Essential");
		//types.add("Gift");
		
		lbtype = new JLabel("Item Type:");  
		lquantity = new JLabel("Quantity: ");
		type = new JComboBox();
		
		for(item i : List){ 
	        type.addItem(i);
		}
		
		
		quan = new JComboBox();
		for(int i=0;i<=10;i++){ 
	        quan.addItem(i);
		}
		
		p1 = new JPanel(new GridLayout(10,10));
		p2 = new JPanel(new GridLayout(1,1));
		
		calculate = new JButton("Calculate");
		vBasket = new JButton("View Basket");
		addB = new JButton("Add to basket");
		
		p1.add(lbtype);
		p1.add(type);
		p1.add(lquantity);
		p1.add(quan);
		
		p2.add(calculate);
		p2.add(vBasket);
		p2.add(addB);
		p1.add(p2);
		add(p1);
		
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calculatePrice calculate = new calculatePrice(cBasket);
				calculate.setTitle("Calculate");
				calculate.setSize(400, 300);
				calculate.setVisible(true);
				dispose();
				
			}
		});
		
		vBasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				displayBasketGUI display = new displayBasketGUI(cBasket);
				display.setTitle("Display Basket Items");
				display.setSize(400, 300);
				display.setVisible(true);
				
			}
		});
		
		addB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String itemType = (String)type.getSelectedItem();
				for(item i : List)
				{
					
					if(i.getType().equals(type.getSelectedItem()))
						{
							
							int qty = (int)quan.getSelectedItem(); //WORK ON
							for(int x = 0; x < qty; x++) {
								if(i.getQty() >= qty) {
									cBasket.add(i);
									
								}
								else
									dispose();
							}
						}
					}
				
				dispose();
				
			}
		});
	
	}
	
}
