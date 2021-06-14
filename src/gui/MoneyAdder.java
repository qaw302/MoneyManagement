package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.MoneyAdderCancleListener;
import listener.MoneyAdderListener;
import manager.MoneyManager;

public class MoneyAdder extends JPanel {
		
	WindowFrame frame;
	
	MoneyManager moneyManager;
	
	public MoneyAdder(WindowFrame frame, MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager = moneyManager;

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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new MoneyAdderListener(fieldNote, fieldDate, fieldAmount, moneyManager));
		
		JButton cancleButton = new JButton("cancle");
		cancleButton.addActionListener(new MoneyAdderCancleListener(frame));
		
		panel.add(labelAmount);
		panel.add(fieldAmount);
		
		panel.add(saveButton);
		panel.add(cancleButton);

		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}
}
