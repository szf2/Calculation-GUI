 * A named HardDrive
 * @author surkuriafisher
 *@version 1.0
 *COP3022 Project #:6
 *File Name: HardDrive.java
 */



import java.awt.GridLayout;


import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class HardDrive extends JPanel {
    JLabel label = new JLabel(); // label to display selected icon
    String border; //border variable to create titled border
    JRadioButton button1;
    JRadioButton button2;
   
    
    // JPanel HardDrive;
    /*
	 * HardDrive constructor adds panel to JFrame
	 */
    
    
	public HardDrive() {

		setLayout(new GridLayout(2,1));	    
	    button1 = new JRadioButton(" 128 GB SSD"); //Creates radio button for 128 hard drive
	    button2 = new JRadioButton("256 GB SSD"); //Creates radio button for 256 for hard drive
		setSize(100, 200);
		add(button1);
		add(button2);
		BorderFactory.createTitledBorder(border);
		setBorder(BorderFactory.createTitledBorder("HardDrive"));
	}
	
	
	/**
	 * Returns the price if a choice is selected
	 * @return price
	 */
	
	public double getHardDriveCost() {
		double expenses = 0;
		if (button1.isSelected() == true) {
			expenses += 20.99;
		}
		if (button2.isSelected() == true) {
			expenses += 41.99;
		}
		return expenses;
	}
}
