package atm;

public class Account {

	private int balance;
	private String accountNumber;

	public Account(String string, int balance) {
		this.accountNumber = string;
		this.balance = balance;
	}

	public int checkBalance() {
		return balance;
	}

	public int withdraw() {
		int withdrawalAmount = 50;
		balance -= withdrawalAmount;
		return withdrawalAmount;
	}

	public void deposit() {
		balance += 50;

	}

	public String getAccountNumber() {
		return "0";
	}

}
