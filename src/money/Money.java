package money;

import java.util.Scanner;

public class Money {
	protected MoneyKind kind = MoneyKind.Expenses;
	protected String date;
	protected int amount;
	protected String note;
	protected int all;
	
	public Money() {
	}
	
	public Money(MoneyKind kind) {
		this.kind = kind;
	}
	
	public Money(String note, int amount) {
		this.note = note;
		this.amount = amount;
	}

	public Money(String date, int amount, String note) {
		this.date = date;
		this.amount = amount;
		this.note = note;
	}
	
	public Money(MoneyKind kind,String date, int amount, String note) {
		this.kind = kind;
		this.date = date;
		this.amount = amount;
		this.note = note;
	}
	
	public MoneyKind getKind() {
		return kind;
	}

	public void setKind(MoneyKind kind) {
		this.kind = kind;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/*
	 * public int getAmount() { return all; }
	 */
	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
		System.out.println("\n"+ "kind" + mkind +"date: " + date +"\n"+ "amount: " + amount +"\n"+ "note: " + note+"\n");
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Note :  ");
		String note = input.next();
		this.setNote(note);
		
		System.out.print("Date : ");
		String date = input.next();
		this.setDate(date);
		
		System.out.print("Amount : ");
		int amount = input.nextInt();
		this.setAmount(amount);
	}
}
