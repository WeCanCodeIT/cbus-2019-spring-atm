package atm;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean foo = true;
		
		System.out.println("Hello, what would you like to do");
		while (foo) {			
			System.out.println("Please select an option:");
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");
			
			String userResponse = input.nextLine();
			System.out.println(userResponse);
			
			switch (userResponse) {
			case "4":
				foo = false;
				break;
			}
		}
	}
}
