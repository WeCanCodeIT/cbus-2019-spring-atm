package atm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldBeAbleToAddAccount() {
		// Arrange
		Atm underTest = new Atm();
		Account acctToAdd = new Account("1", 200);
		
		// Act
		int initialAccounts = underTest.getAccountsLength();
		underTest.addAccount(acctToAdd); // Add account to Atm instance
		int accountsAfterAddition = underTest.getAccountsLength();
		
		// Assert
		assertEquals(initialAccounts + 1, accountsAfterAddition); // check that there is a new account in Atm
	}
	
	@Test
	public void shouldGetSingleAccount() {
		Atm underTest = new Atm();
		Account account = new Account("1", 200);
		
		underTest.addAccount(account); // Add an Account to underTest so we can 'get' it
		Account actual = underTest.getAccount("1");
		
		assertEquals(account, actual);
	}
}
