 import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import money.ExpensesMoney;
import money.IncomeMoney;
import money.Money;
import money.MoneyInput;
import money.MoneyKind;

public class MoneyManager {
		ArrayList<MoneyInput> moneys = new ArrayList<MoneyInput>();
		Scanner input;
		MoneyManager(Scanner input) {
			this.input = input;
		}
		
		public void addMoney() {
			int kind = 0;
			MoneyInput moneyInput;
			while (kind != 1 || kind !=2 ) {
				try {
					System.out.println("1. for Income");
					System.out.println("2. for Expenses");
					System.out.println("Select one num: ");
					kind = input.nextInt();
					if (kind == 1) {
						moneyInput = new IncomeMoney(MoneyKind.Income);
						moneyInput.getUserInput(input);
						moneys.add(moneyInput);
						break;
					} else if (kind == 2) {
						moneyInput = new ExpensesMoney(MoneyKind.Expenses);
						moneyInput.getUserInput(input);
						moneys.add(moneyInput);
						break;
					} else {
						System.out.print("Select one num: ");
					}
				}
				catch(InputMismatchException e) {
					System.out.println("Please put integer between 1 and 2!");
					if (input.hasNext()) {
						input.next();
					}
					kind = -1;
				}
			}
		}
		
		public void deleteMoney() {
			System.out.print("Note to delete: ");
			String moneyNote = input.next();
			int index = findIndex(moneyNote);
			removefromMoneys(index, moneyNote);
		}
		
		public int findIndex(String moneyNote) {
			int index = -1;
			for(int i=0; i<moneys.size(); i++) {
				if (moneys.get(i).getNote().equals(moneyNote)) {
					index = i;
					break;
				}
			}
			return index;
		}
		
		public int removefromMoneys(int index, String dnote) {
			if(index >=0) {
				moneys.remove(index);
				System.out.println("the money "+ dnote + " is deleted");
				return 1;
			}
			else {
				System.out.println("The note has not been registered.");
				return -1;
			}
		}
		
		public void editMoney() {
			System.out.print("Note to Edit: ");
			String dnote = input.next();
			for (int i=0; i < moneys.size(); i++) {
				MoneyInput money = moneys.get(i);
				if (money.getNote().equals(dnote)) {
					int num = -1;
					while (num != 4) { 
						showEditMenu();
						num = input.nextInt();
						switch(num) {
						case 1:
							money.setMoneyNote(input);
							break;
						case 2:
							money.setMoneyDate(input);
							break;
						case 3:
							money.setMoneyAmount(input);
							break;
						default:
							continue;
						}
					} //while
					break;
				} //if
			} // for
		}
		
		public void viewMoneys() { 
			for(int i=0; i<moneys.size(); i++) {
				moneys.get(i).printInfo();
			}
		}	
		
		public void showEditMenu() {
			System.out.println("** Money Info Edit Menu **");
			System.out.println(" 1. Edit Note");
			System.out.println(" 2. Edit Date");
			System.out.println(" 3. Edit Amount");
			System.out.println(" 4. Exit");
			System.out.println("Select one number between 1-4: ");
		}

}
