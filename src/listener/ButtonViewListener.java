package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.MoneyViewer;
import gui.WindowFrame;
import manager.MoneyManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	public static MoneyManager getObject(String filename) {
		MoneyManager moneyManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			moneyManager = (MoneyManager)in.readObject();
			
			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return moneyManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return moneyManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MoneyManager moneyManager = getObject("Moneymanager.ser");
		MoneyViewer moneyViewer = frame.getMoneyviewer();
		moneyViewer.setMoneyManager(moneyManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(moneyViewer);
		frame.revalidate();
		frame.repaint();
		/*
		 * JButton b = (JButton) e.getSource(); MoneyViewer viewer =
		 * frame.getMoneyviewer(); frame.setupPanel(viewer);
		 */
	}

}
