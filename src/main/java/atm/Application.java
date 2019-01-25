package atm;

import java.util.Collection;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Atm atm = new Atm();

		// Add default accounts to atm
		atm.addAccount(new Account("1", 100));
		atm.addAccount(new Account("2", 200));
		atm.addAccount(new Account("3", 300));
		
		// create PIN to check against
		String defaultUserPin = "1234";

		boolean sessionActive = true;

		// Change greeting to indicate the need for a PIN
		// System.out.println("Hello, what would you like to do");
		System.out.println("Hello, please enter your PIN to access the ATM:");

		// Get user input for PIN
		String userPin = input.nextLine();
		
		while (sessionActive) {
			// Add a nested while loop to check for the matching PIN - continue looping until PINs match
			while (!userPin.equals(defaultUserPin)) {
				// Prompt user for new PIN
				System.out.println("You have entered an incorrect PIN. Please try again...");
				userPin = input.nextLine();
			}
			
			System.out.println("Please select an option:");
			System.out.println("1. Check All Balances");
			System.out.println("2. Withdraw from single account");
			System.out.println("3. Deposit from single account");
			System.out.println("4. Add an Account");
			System.out.println("5. Transfer between accounts");
			System.out.println("6. Exit");

			String userResponse = input.nextLine();

			switch (userResponse) {
			case "1":
				Collection<Account> userAccounts = atm.getAccounts().values();
				System.out.println("Your Account balances are as follows:");
				listAccounts(atm);
				break;
			case "2":
				// To build out this case, we're going to need to access ONE Account in our Atm
				System.out.println("Please enter the account number you would like to witdraw from:");
				listAccounts(atm);

				// Get acct number from the user
				String userWithdrawalChoice = input.nextLine();

				// This is the method we test drove to select a SINGLE acct from the atm
				Account withdrawalAccount = atm.getAccount(userWithdrawalChoice);
				// Making the withdrawal
				withdrawalAccount.withdraw();

				// Printing a confirmation message so the user knows the transaction is complete
				System.out.println("You withdrew from " + withdrawalAccount.getAccountNumber()
						+ ". Remaining balance is: " + withdrawalAccount.checkBalance());
				break;
			case "3":
				// We're going to mimic the code from withdraw since it's so similar
				// There isn't any new logic here so we can just write out our UI - YAY!!
				System.out.println("Please enter the account number you would like to deposit to:");
				listAccounts(atm);

				String userDepositChoice = input.nextLine();

				Account depositAccount = atm.getAccount(userDepositChoice);
				// Change this to deposit or we don't get the expected behavior
				depositAccount.deposit();

				System.out.println("You deposited to " + depositAccount.getAccountNumber() + ". Updated balance is: "
						+ depositAccount.checkBalance());
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
				// Prompt user for acct to transfer from
				System.out.println("Which Account would you like to transfer from:");
				listAccounts(atm);
				String userAccountFrom = input.nextLine();
				Account transferAccountFrom = atm.getAccount(userAccountFrom);

				// Prompt the user for an account to transfer to
				System.out.println("Which Account would you like to transfer to:");
				listAccounts(atm);
				String userAccountTo = input.nextLine();
				Account transferAccountTo = atm.getAccount(userAccountTo);

				// Now - Test Drive the creation of the transfer method in the Atm class and
				// then include below
				atm.transfer(transferAccountFrom, transferAccountTo);

				System.out.println("Transfer complete. Current balances:");
				listAccounts(atm);

				break;
			case "6":
				sessionActive = false;
				break;
			}
		}
	}

	private static void listAccounts(Atm atm) {
		for (Account account : atm.getAccounts().values()) {
			System.out.println(account.getAccountNumber() + "'s current balance: " + account.checkBalance());
		}
	}
}
