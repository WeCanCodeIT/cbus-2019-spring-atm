package atm;

public class Atm {
	
	private int balance;

	public Atm(int balance) {
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

}
