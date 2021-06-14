package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		MoneyManager moneyManager = getObject("Moneymanager.ser");
		if(moneyManager == null) {
			moneyManager = new MoneyManager(input);
		}

		WindowFrame frame = new WindowFrame(moneyManager);
		selectMenu(input, moneyManager);
		putObject(moneyManager, "Moneymanager.ser");
	} 

	public static void selectMenu(Scanner input, MoneyManager moneyManager) {
		int num = -1; 
		while (num !=5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					moneyManager.addMoney();
					logger.log("add a money");
					break;
				case 2:
					moneyManager.deleteMoney();
					logger.log("delete a student");
					break;
				case 3:
					moneyManager.editMoney();
					logger.log("edit a student");
					break;
				case 4:
					moneyManager.viewMoneys();
					logger.log("add a student");
					break;
				default:	
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Money Management System Menu ***");
		System.out.println("1. Add Money");
		System.out.println("2. Delete Money");
		System.out.println("3. Edit Money");
		System.out.println("4. View Moneys");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-6: ");
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
