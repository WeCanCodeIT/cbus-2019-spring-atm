package atm;

import java.util.HashMap;

public class Atm {
	
	HashMap<String, Account> accounts = new HashMap<String, Account>();

	public void addAccount(Account acctToAdd) {
		accounts.put(acctToAdd.getAccountNumber(), acctToAdd);
	}

	public int getAccountsLength() {
		return accounts.size();
	}

}
