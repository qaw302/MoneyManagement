import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MoneyManager moneyManager = new MoneyManager(input);
		
		int num = -1;
		
		while (num !=5) {
			System.out.println("*** Money Management System Menu ***");
			System.out.println("1. Add Money");
			System.out.println("2. Delete Money");
			System.out.println("3. Edit Money");
			System.out.println("4. View Money");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			if (num == 1) {
				moneyManager.addMoney();
			}
			else if (num == 2) {
				moneyManager.deleteMoney();
			}
			else if (num == 3) {
				moneyManager.editMoney();
			}
			else if (num == 4) {
				moneyManager.viewMoney();
			}
			else {
				continue;
			}
			
		}
		
	}

}
