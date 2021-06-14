package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.DateFormatException;
import manager.MoneyManager;
import money.IncomeMoney;
import money.MoneyInput;
import money.MoneyKind;

public class MoneyAdderListener implements ActionListener {
	JTextField fieldNote;
	JTextField fieldDate;
	JTextField fieldAmount;
	
	MoneyManager moneyManager;
 
	public MoneyAdderListener(JTextField fieldNote, JTextField fieldDate, JTextField fieldAmount, MoneyManager moneyManager) {
		this.fieldNote = fieldNote;
		this.fieldDate = fieldDate;
		this.fieldAmount = fieldAmount;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		MoneyInput money = new IncomeMoney(MoneyKind.Income);
		try {
			money.setNote(fieldNote.getText());
			money.setDate(fieldDate.getText());
			money.setAmount(Integer.parseInt(fieldAmount.getText()));
			moneyManager.addMoney(money);
			putObject(moneyManager, "Moneymanager.ser");
			money.printInfo();
		} catch (DateFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static MoneyManager putObject(MoneyManager moneyManager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(moneyManager);
			
			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return moneyManager;
	}


}
