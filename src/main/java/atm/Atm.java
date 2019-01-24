package atm;

import java.util.HashMap;

public class Atm {
	
	private HashMap<String, Account> accounts = new HashMap<String, Account>();

	public void addAccount(Account acctToAdd) {
		accounts.put(acctToAdd.getAccountNumber(), acctToAdd);
	}

	public HashMap<String, Account> getAccounts() {
		return accounts;
	}

	public int getAccountsLength() {
		return accounts.size();
	}

	public Account getAccount(String acctToGet) {
		return accounts.get(acctToGet);
	}

}
