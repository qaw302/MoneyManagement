 import java.util.ArrayList;
import java.util.Scanner;

import money.ExpensesMoney;
import money.IncomeMoney;
import money.Money;
import money.MoneyKind;

public class MoneyManager {
		ArrayList<Money> moneys = new ArrayList<Money>();
		Scanner input;
		MoneyManager(Scanner input) {
			this.input = input;
		}
		
		public void addMoney() {
			int kind = 0;
			Money money;
			while (kind != 1 && kind !=2 ) {
				System.out.println("1. for Income");
				System.out.println("2. for Expenses");
				System.out.println("Select one num: ");
				kind = input.nextInt();
				if(kind == 1) {
					money = new IncomeMoney(MoneyKind.Income);
					money.getUserInput(input);
					moneys.add(money);
					break;
				}
				else if(kind == 2) {
					money = new ExpensesMoney(MoneyKind.Expenses	);
					money.getUserInput(input);
					moneys.add(money);
					break;
				}
				else {
					System.out.print("Select one num: ");
				}
			}
		}
		
		public void deleteMoney() {
			System.out.print("Note to delete: ");
			String dnote = input.next();
			int index = -1;
			for(int i=0; i<moneys.size(); i++) {
				if (moneys.get(i).getNote() == dnote) {
					index = i;
					break;
				}
			}
			
			if(index >=0) {
				moneys.remove(index);
				System.out.println("the money "+ dnote + "is deleted");
			}
			else {
				System.out.println("The note has not been registered.");
				return;
			}
		
		}
		
		public void editMoney() {
			System.out.print("Note to Edit: ");
			String dnote = input.next();
			for (int i=0; i < moneys.size(); i++) {
				Money money = moneys.get(i);
				if (money.getNote().equals(dnote)) {
					int num = -1;
					while (num != 4) {
						System.out.println("** Money Info Edit Menu **");
						System.out.println(" 1. Edit Note");
						System.out.println(" 2. Edit Date");
						System.out.println(" 3. Edit Amount");
						System.out.println(" 4. Exit");
						System.out.print("Select one number between 1-4: ");
						num = input.nextInt();
						if (num == 1) {
							System.out.println("Note: ");
							String note = input.next();
							money.setNote(note);
						}
						else if (num == 2) {
							System.out.println("Date: ");
							String date = input.next();
							money.setDate(date);
						}
						else if (num == 3) {
							System.out.println("Amount: ");
							int amount = input.nextInt();
							money.setAmount(amount);
						}
						else {
							continue;
						} // if
					} //while
					break;
				} //if
			} // for
		}
		
		public void viewMoneys() { 
//			System.out.print("Note: ");
//			String note = input.next();
			for(int i=0; i<moneys.size(); i++) {
				moneys.get(i).printInfo();
			}

		}

}
