import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
			System.out.println("1. Add Money");
			System.out.println("2. Delete Money");
			System.out.println("3. Edit Money");
			System.out.println("4. View Money");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("Date : ");
				String date = input.next();
				System.out.println("Income : ");
				int income = input.nextInt();
				System.out.println("Note : ");
				String note = input.next();
				break;
			case 2:
				System.out.println("Income : ");
				int income2 = input.nextInt();
			case 3:
				
			case 4:
				
				
			}
		}
		
	}

}
