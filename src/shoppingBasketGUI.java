import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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
	private JLabel lbtype, answer;
	//private JTextField carT, plateNo; 
	//private JSpinner carYear, s, s1;
	private JButton calculate, vBasket, addB;
	private JComboBox type, quan;
	ArrayList<item> List;
	
	List<item>cBasket = new ArrayList();
	
	//ArrayList<item> selectedItems = new ArrayList<item>();
	
	public shoppingBasketGUI(ArrayList<item> refList){
		
		List = refList;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbtype = new JLabel("Item Type:");  
		answer = new JLabel("Enter ID of Product");
		type = new JComboBox();
		
		JTextField txtArea = new JTextField();
		
		/*
		for(item i : List){ 
	        type.addItem(i);
		}
		*/
		JTextArea displayAll = new JTextArea();
		displayAll.setPreferredSize(new Dimension(370,300));
		displayAll.setLineWrap(true);
	    displayAll.setWrapStyleWord(false);
		displayAll.setText(List.toString());
		
		/*
		quan = new JComboBox();
		for(int i=0;i<=10;i++){ 
	        quan.addItem(i);
		}
		*/
		p1 = new JPanel(new GridLayout(10,10));
		p2 = new JPanel(new GridLayout(1,1));
		
		calculate = new JButton("Calculate");
		vBasket = new JButton("View Basket");
		addB = new JButton("Add to basket");
		
		
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
		
		/*
		addB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(item i : List){ 
					cBasket.add((item) type.getSelectedItem());
				}
				
			}
		});
			
		*/
		
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
				
				/*
				for(item i : List)
				{
					if(i.getId().equals(txtArea.getText()))
						{
							cBasket.add(i);
						}
						dispose();
						*/
				//}
			}
		});
	
		p1.add(lbtype);
		p1.add(displayAll);
		p1.add(answer);
		p1.add(txtArea);
		p2.add(calculate);
		p2.add(vBasket);
		p2.add(addB);
		p1.add(p2);
		add(p1);
		
		
	}
	
	
	
	
	
}
