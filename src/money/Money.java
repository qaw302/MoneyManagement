package money;

import java.io.Serializable;
import java.util.Scanner;
import exception.DateFormatException;

public abstract class  Money implements MoneyInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3928031007542589278L;
	
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

	public void setDate(String date) throws DateFormatException {
		if (!date.contains(".") || !date.equals("")) {
			throw new DateFormatException();
		}
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

	public abstract void printInfo();
	
	public void setMoneyNote(Scanner input) {
		System.out.println("Note: ");
		String note = input.next();
		this.setNote(note);
	}
	
	public void setMoneyDate(Scanner input) {
		String date ="";
		while (!date.contains(".")) {
			System.out.print("Date:");
			date = input.next();
			try {
				this.setDate(date);
			} catch (DateFormatException e) {
				System.out.println("Incorrect Date Format. put the date that contains .");
			}
		}
	}
	
	public void setMoneyAmount(Scanner input) {
		System.out.println("Amount: ");
		int amount = input.nextInt();
		this.setAmount(amount);
	}
	
	public String getKindString() {
		String mkind = "none";
		switch(this.kind) {
		case Income:
			mkind = "Income";
			break;
		case Expenses:
			mkind = "Expenses";
			break;
		default:
		}
		return mkind;
	}

	
}
