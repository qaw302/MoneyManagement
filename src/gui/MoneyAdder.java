package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MoneyAdder extends JPanel {
		
	WindowFrame frame;
	
	public MoneyAdder(WindowFrame frame) {
		this.frame = frame;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelNote = new JLabel("Note: ", JLabel.TRAILING);
		JTextField fieldNote = new JTextField(10);
		labelNote.setLabelFor(fieldNote);
		panel.add(labelNote);
		panel.add(fieldNote);

		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelNote.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);

		JLabel labelAmount = new JLabel("Amount: ", JLabel.TRAILING);
		JTextField fieldAmount = new JTextField(10);
		labelNote.setLabelFor(fieldAmount);
		panel.add(labelAmount);
		panel.add(fieldAmount);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancle"));

		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}
}
