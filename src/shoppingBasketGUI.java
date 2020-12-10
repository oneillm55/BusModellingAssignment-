import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class shoppingBasketGUI extends JFrame{

	private JPanel p1, p2;
	private JLabel lbtype, lquantity;
	//private JTextField carT, plateNo;hnghn gh 
	//private JSpinner carYear, s, s1;
	private JButton calculate, vBasket, addB;
	private JComboBox type, quan;
	ArrayList<item> List = new ArrayList<item>();
	
	public shoppingBasketGUI(){
		//Jayme is a poo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		item tLuxury = new item("Luxury", 20, 50);
		item tEssential = new item("Essential", 10, 30);
		item tGift = new item("Gift", 5, 20);
		List.add(tLuxury);
		List.add(tEssential);
		List.add(tGift);
		
		lbtype = new JLabel("Item Type:");  
		lquantity = new JLabel("Quantity: ");
		type = new JComboBox();
		
		for(int i=0; i< List.size();i++){ 
	        type.addItem(List.get(i));
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
		
	}
	
	public static void main(String[] args) 
	{	
		shoppingBasketGUI mainGUI = new shoppingBasketGUI();
		mainGUI.setTitle("Main Windiow");
		mainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainGUI.setSize(400, 300);
		mainGUI.setVisible(true);		
		
	}
	
}
