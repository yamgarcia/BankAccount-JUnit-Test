package lab4b;

import static org.junit.Assert.*;


import org.junit.Test;


import org.junit.After;
import org.junit.Before;

/**
 * 
 * @author Windows 10 1COMP1451[LAB4B] WRITE A UNIT TEST CLASS THAT THOROUGHLY
 *         TESTS AN (IMAGINARY) BankAccount class and at least six BankAccount
 *         methods, plus its constructor. You must supply at least 20 tests.
 *         Then write code to pass them.
 */

public class BankAccountTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	public BankAccountTest() {
		BankAccount acc = new BankAccount();
	}

	// fName, middleInitial, lName, balance, isSavings, yearOfBirth
//	@Before
//	void init() {
//		System.out.println("setting up");
//		acc = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
//	}

//	@After
//	public void tearDown() {
//		System.out.println("tearing down");
//	}

	@Test
	public void testGetFName1() {
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		assertEquals("John", acc1.getfName());
	}

	@Test
	public void testGetFName2() {
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);

		assertEquals("Mark", acc2.getfName());
	}

	@Test
	public void testGetLName1() {
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		assertEquals("Jones", acc1.getlName());
	}

	@Test
	public void testGetLName2() {
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);
		assertEquals("Mills", acc2.getlName());
	}

	@Test
	public void testGetMiddleInicial1() {
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		assertEquals("C", acc1.getMiddleInitial());
	}

	@Test
	public void testGetMiddleInicial2() {
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);
		assertEquals("J", acc2.getMiddleInitial());
	}

	@Test
	public void testGetFullName1() {
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		assertEquals("John C Jones", acc1.getFullName());
	}

	@Test
	public void testGetFullName2() {
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);
		assertEquals("Mark J Mills", acc2.getFullName());
	}

	@Test
	public void testWithdraw1() {
		// double i = acc.testWithdraw1();
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		double newBalance = acc1.withdraw(5000.00);

		// boolean isTooHigh = i < balance;
		// assertFalse(isTooHigh);

		assertEquals(15000.00, newBalance, 0.1);
	}

	@Test
	public void testWithdraw2() {
		// double i = acc.testWithdraw1();
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);
		double newBalance = acc2.withdraw(1000.00);
		assertEquals(9000.00, newBalance, 0.1);
	}

	public void testDeposit1() {
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		double newBalance = acc1.deposit(1000.00);
		assertEquals(21000.00, newBalance, 0.1);
	}

	public void testDeposit2() {
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);
		double newBalance = acc2.deposit(5000.00);
		assertEquals(15000.00, newBalance, 0.1);
	}

	public void testGetIsSavings1() {
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		boolean isSavings = acc1.getIsSavings();
		assertFalse(isSavings);
		assertEquals(false, 0.1);

	}

	public void testGetIsSavings2() {
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);
		boolean isSavings = acc2.getIsSavings();
		assertTrue(isSavings);
		assertEquals(true, 0.1);
	}

	public void testNotSavingsYearlyFee1() {
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		double fee = acc1.notSavingsYearlyFee();
		// assertFalse(this.getIsSavings());
		assertEquals(420, fee, 0.1);
	}

	public void testNotSavingsYearlyFee2() {
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);
		double fee = acc2.notSavingsYearlyFee();
		// assertFalse(this.getIsSavings());
		assertEquals(0, fee, 0.1);

	}
}
