import java.util.Scanner;

public class MoneyManager {
		Money money;
		Scanner input;
		
		MoneyManager(Scanner input) {
			this.input = input;
		}
		
		public void addMoney() {
			money = new Money();
			System.out.print("Note : ");
			money.note = input.next();
			System.out.print("Income/Expenses : ");
			money.iore = input.next();
			System.out.print("Date : ");
			money.date = input.next();
			System.out.print("Amount : ");
			money.amount = input.nextInt();

		}
		
		public void deleteMoney() {
			System.out.print("Note to delete: ");
			String note = input.next();
			if (money.note == null) {
				System.out.println("The note has not been registered.");
				return;
			}
			if (money.note == note) {
				note = null;
				System.out.println("The note is deleted");
			}
		}
		
		public void editMoney() {
			System.out.print("Note to Edit: ");
			String note = input.next();
			if (money.note == note) {
				note = null;
				System.out.println("The note to be edited is " + note);
			}
			
		}
		
		public void viewMoney() { 
			System.out.print("Note: ");
			String note = input.next();
			if (money.note.equals(note)) {
				money.printInfo();
			} 
		}

}
