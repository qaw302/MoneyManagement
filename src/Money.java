
public class Money {
	String iore;
	String date;
	int amount;
	String note;
	
	public Money() {
	}
	
	public Money(String iore, String note, int amount) {
		this.iore = iore;
		this.note = note;
		this.amount = amount;
	}

	public Money(String iore, String date, int amount, String note) {
		this.iore = iore;
		this.date = date;
		this.amount = amount;
		this.note = note;
	}
	
	public void printInfo() {
		System.out.println("iore: " + iore +"\n"+ " date: " + date +"\n"+ " amount: " + amount +"\n"+ " note: " + note+"\n");
	}
	
}
