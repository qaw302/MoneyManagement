package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.MoneyManager;
import money.MoneyInput;

public class MoneyViewer extends JPanel {
	
	WindowFrame frame;
	
	MoneyManager moneyManager;

	public MoneyManager getMoneyManager() {
		return moneyManager;
	}

	public void setMoneyManager(MoneyManager moneyManager) {
		this.moneyManager = moneyManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Note");
		model.addColumn("Date");
		model.addColumn("Amount");
		model.addColumn("Contact Info.");
		
		for (int i=0; i < moneyManager.size(); i++) {
			Vector row = new Vector();
			MoneyInput mi = moneyManager.get(i);
			row.add(mi.getNote());
			row.add(mi.getDate());
			row.add(mi.getAmount());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public MoneyViewer(WindowFrame frame, MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		
		System.out.println("***" + moneyManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Note");
		model.addColumn("Date");
		model.addColumn("Amount");
		model.addColumn("Contact Info.");
		
		for (int i=0; i < moneyManager.size(); i++) {
			Vector row = new Vector();
			MoneyInput mi = moneyManager.get(i);
			row.add(mi.getNote());
			row.add(mi.getDate());
			row.add(mi.getAmount());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
