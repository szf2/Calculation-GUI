 * A name Adds Ons gets add ons for purchase
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:6
 File Name: AddOns.java
 */

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AddOns extends JPanel {

	JCheckBox b1;
	JCheckBox b2;
	JCheckBox b3;
	JCheckBox b4;
	JLabel label = new JLabel();// label to display selected icon 
	private String border; // Stores information used for border
	

	/*
	 * AddOns constructor adds panel and border to JFrame 
	 */
	
	
	public AddOns() {
		setLayout(new GridLayout(4,1));
		 b1 = new JCheckBox("Memory"); //checkbox for memory
		 b2 = new JCheckBox("Graphic Card");//checkbox for graphic card
		 b3 = new JCheckBox("OS");//checkbox for OS
		 b4 = new JCheckBox("Warranty");//checkbox for Warranty
		setSize(30,50);
		add(b1);
		add(b2);
		add(b3);
		add(b4);		
		BorderFactory.createTitledBorder(border);
		setBorder(BorderFactory.createTitledBorder("Add Ons"));
	}

	/**
	 * Returns the price if a choice is selected
	 * @return price
	 */

	public double getAddOnCost() {
		double price = 0;
		if (b1.isSelected() == true) {
			price += 17.99;
		}
		if (b2.isSelected() == true) {
			price += 1199.95;
		}
		if (b3.isSelected() == true) {
			price += 499.99;
		}
		if (b4.isSelected() == true) {
			price += 100.00;
		}
		return price;
	}

}
