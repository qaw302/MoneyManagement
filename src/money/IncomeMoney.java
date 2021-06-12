package money;

import java.util.Scanner;

public class IncomeMoney extends Money{
	
	public IncomeMoney(MoneyKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMoneyNote(input);
		setMoneyDate(input);
		setMoneyAmount(input);
	}
	
	public void printInfo() {
		String mkind = getKindString();
		System.out.println("\n"+ "kind: " + mkind + "\n"+ "date: " + "\n"+ date +"\n"+ "amount: " + amount +"\n"+ "note: " + note+"\n");
	}
	
}
