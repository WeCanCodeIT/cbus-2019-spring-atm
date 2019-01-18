package atm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldReturnOneHundredForBalance() {
		// Arrange
		Atm underTest = new Atm(100);
		// Act
		int actual = underTest.checkBalance();
		// Assert
		assertEquals(100, actual);
	}

	@Test
	public void shouldReturnTwoHundredForBalance() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int actual = underTest.checkBalance();
		// Assert
		assertEquals(200, actual);
	}
	
	@Test
	public void shouldWithdraw() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int withdrawalAmount = underTest.withdraw();
		// Assert
		assertEquals(50, withdrawalAmount);
	}
	
	@Test
	public void shouldDecreaseWhenMoneyIsWithdrawn() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int originalBalance = underTest.checkBalance();
		underTest.withdraw();
		int newBalance = underTest.checkBalance();
		// Assert
		assertEquals(originalBalance - 50, newBalance);
	}
}
