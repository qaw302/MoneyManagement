package money;

import java.util.Scanner;

public class ExpensesMoney extends Money {
	
	public ExpensesMoney(MoneyKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Note : ");
		String note = input.next();
		this.setNote(note);
		
		System.out.print("Date : ");
		String date = input.next();
		this.setDate(date);
		
		System.out.print("Amount : ");
		int amount = input.nextInt();
		this.setAmount(amount);
		
	}
	
	public void printInfo() {
		String mkind = "none";
		switch(this.kind) {
		case Income:
			mkind = "Income";
			break;
		case Expenses:
			mkind = "Expenses";
			break;
		}
		System.out.println("\n"+ "kind: " + mkind + "\n"+ "date: " + "\n"+ date +"\n"+ "amount: " + amount +"\n"+ "note: " + note+"\n");
	}
}
