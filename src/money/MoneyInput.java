package money;

import java.util.Scanner;

import exception.DateFormatException;

public interface MoneyInput {
	
	public String getNote();
	
	public void setNote(String note);
	
	public String getDate();
	
	public void setDate(String date) throws DateFormatException;
	
	public int getAmount();
	
	public void setAmount(int amount);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMoneyNote(Scanner input);
	
	public void setMoneyDate(Scanner input);
	
	public void setMoneyAmount(Scanner input);
	
}
