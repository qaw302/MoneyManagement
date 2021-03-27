import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
			System.out.println("*** Money Management System Menu ***");
			System.out.println("1. Income Money");
			System.out.println("2. Delete Money");
			System.out.println("3. Edit Money");
			System.out.println("4. View Money");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			if (num == 1) {
				addMoney();
			}
			else if (num == 2) {
				deleteMoney();
			}
			else if (num == 3) {
				editMoney();
			}
			else if (num == 4) {
				viewMoney();
			}
			else {
				continue;
			}
			
		}
		
	}
	
	public static void addMoney() {
		Scanner input = new Scanner (System.in);
		System.out.print("Income/Expenses : ");
		String ie = input.next();
		System.out.print("Date : ");
		String date = input.next();
		System.out.print("Amount : ");
		int amount = input.nextInt();
		System.out.print("Note : ");
		String note = input.next();
		
	}
	
	public static void deleteMoney() {
		Scanner input = new Scanner (System.in);
		System.out.print("");
		
	}
	
	public static void editMoney() {
		Scanner input = new Scanner (System.in);
		System.out.print("");

	}
	
	public static void viewMoney() {
		Scanner input = new Scanner (System.in);
		System.out.print("");
		
	}

}
