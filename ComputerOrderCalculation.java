 * A name ComputerOrderCalculations calculates items selected
 *@author Surkuria Fisher
 *version 1.0
 COP3022 Project #:6
 File Name: ComputerOrderCalculations.java
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ComputerOrderCalculation extends JFrame {
	JPanel drive = new JPanel();
	JPanel adding = new JPanel();
	JPanel processing = new JPanel();
	HardDrive drives = new HardDrive();
	AddOns add = new AddOns();
	Processor process = new Processor();
	JFrame frame = new JFrame();
	JButton button = new JButton("Calculate");
	JButton button2 = new JButton("EXIT");
    JPanel buttonPan = new JPanel();
    
    /*
	 * ComputerOrderCaluclation constructor adds panel to JFrame
	 */

	public ComputerOrderCalculation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		buildPanels();
		add(buttonPan, BorderLayout.SOUTH);
		add(drives, BorderLayout.WEST);
		add(add, BorderLayout.CENTER);
		add(process, BorderLayout.EAST);
		setTitle("Laptop Order Calculator");
		buttonPan.setSize(400,500);
		frame.add(drive, BorderLayout.WEST);
		frame.add(adding,BorderLayout.CENTER);
		frame.add(processing,BorderLayout.EAST);
		

		setVisible(true);

	}
	
	/**
	 * Builds panel to be able to display information
	 */

	private void buildPanels() {
		buttonPan = new JPanel();

		button.addActionListener(new ButtonListeners());
		button2.addActionListener(new ButtonListener2());
		buttonPan.add(button);
		buttonPan.add(button2);

	}
	
	/**
	 * Handles button action when calculate is selected
	 * @author surkuriafisher
	 *
	 */

	private class ButtonListeners implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double price = 0;
		 double tax = 0.06;

			price = drives.getHardDriveCost() + add.getAddOnCost() + process.getProcessorCost();

			double taxPrice = price * tax;
			double totalPrice = price + taxPrice;
			double total = (double)Math.round(totalPrice*100)/100.0;
			JOptionPane.showMessageDialog(frame,String.format("Subtotal: $%.2f\n Tax: $%.2f\n Total: $%.2f", price, taxPrice, total));

			
		}
	}

	/**
	 * Handles button action when exit is selected
	 * @author surkuriafisher
	 *
	 */
	
	private class ButtonListener2 implements ActionListener {
		public void actionPerformed(ActionEvent f) {
			System.exit(0);
		

			
		}
	}

}
