 * A name Processor to purchase processor products
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:6
 File Name: Processor.java
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Processor extends JPanel {


	JRadioButton b1;
	JRadioButton b2;
	JRadioButton b3;
	JLabel label = new JLabel(); // label to display selected icon 
	String border;
	
	
	/*
	 * Processor constructor adds panel to JFrame
	 */
	
	public Processor() {
		setLayout(new GridLayout(3,1));
		 b1 = new JRadioButton("3.6GHz Processor"); //Creates radio button for 3.6 processor
		 b2 = new JRadioButton("4.1GHz Processor"); // Creates radio button for 4.1 processor
		 b3 = new JRadioButton("4.7GHz Processor"); // Creates radio button for 4.7 processor
	    add(b1);
		add(b2);
		add(b3);
		setSize(100,200);
		BorderFactory.createTitledBorder(border);
		setBorder(BorderFactory.createTitledBorder("Processor"));
	}
	
	/**
	 * Returns the price if a choice is selected
	 * @return price
	 */

	public double getProcessorCost() {
		double price = 0;
		if (b1.isSelected() == true) {
			price += 1384.99;
		}
		if (b2.isSelected() == true) {
			price += 1500.00;
		}
		if (b3.isSelected() == true) {
			price += 2700.00;
		}
		return price;
	}

}
