package atm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {

	@Test
	public void shouldReturnOneHundredForBalance() {
		// Arrange
		Account underTest = new Account("0", 100);
		// Act
		int actual = underTest.checkBalance();
		// Assert
		assertEquals(100, actual);
	}

	@Test
	public void shouldReturnTwoHundredForBalance() {
		// Arrange
		Account underTest = new Account("0", 200);
		// Act
		int actual = underTest.checkBalance();
		// Assert
		assertEquals(200, actual);
	}

	@Test
	public void shouldWithdraw() {
		// Arrange
		Account underTest = new Account("", 200);
		// Act
		int withdrawalAmount = underTest.withdraw();
		// Assert
		assertEquals(50, withdrawalAmount);
	}

	@Test
	public void shouldDecreaseWhenMoneyIsWithdrawn() {
		// Arrange
		Account underTest = new Account("", 200);
		// Act
		int originalBalance = underTest.checkBalance();
		underTest.withdraw();
		int newBalance = underTest.checkBalance();
		// Assert
		assertEquals(originalBalance - 50, newBalance);
	}

	@Test
	public void shouldIncreaseWhenMoneyIsDeposited() {
		// Arrange
		Account underTest = new Account("", 200);
		// Act
		int originalBalance = underTest.checkBalance();
		underTest.deposit();
		int newBalance = underTest.checkBalance();
		// Assert
		assertEquals(originalBalance + 50, newBalance);
	}
	
	@Test
	public void shouldHaveAccountNumber() {
		Account underTest = new Account("0", 200);
		
		String expected = underTest.getAccountNumber();
		
		assertEquals(expected, "0");
	}
}
