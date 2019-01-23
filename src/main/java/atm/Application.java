package atm;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Atm atm = new Atm();
		
		boolean foo = true;
		
		System.out.println("Hello, what would you like to do");
		while (foo) {			
			System.out.println("Please select an option:");
			System.out.println("1. Check All Balances");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Add an Account");
			System.out.println("5. Exit");
			
			String userResponse = input.nextLine();
			System.out.println(userResponse);
			
			switch (userResponse) {
			case "1":
				Collection<Account> userAccounts = atm.getAccounts().values();
				System.out.println("Your Account balances are as follows:");
				for (Account account : userAccounts) {
					// Identify how many account are available, then loop through each one
					System.out.println("Account " + account.getAccountNumber() +" has $" + account.checkBalance());
				}
				break;
			case "4":
				// Get info to make account
				System.out.println("Please enter a unique Account number");
				String userAccountNumber = input.nextLine();
				System.out.println("Please enter a starting balance for the account");
				int userStartingBalance = input.nextInt();
				input.nextLine(); // Clearing our input line

				// Make said Account
				Account newUserAccount = new Account(userAccountNumber, userStartingBalance);
				
				// Add the Account to Atm
				atm.addAccount(newUserAccount);
				System.out.println("Current user Account number: " + atm.getAccountsLength());
				break;
			case "5":
				foo = false;
				break;
			}
		}
	}
}
