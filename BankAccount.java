package lab4b;

public class BankAccount {

	// fName, middleInitial, lName, balance, isSavings, yearOfBirth
	private String fName;
	private String middleInitial;
	private String lName;
	private double balance;
	private boolean isSavings;
	private int yearOfBirth;
	private static final double NOT_SAVINGS_MONTHLY_FEE = 35.00;
	private static final int MONTHS_IN_A_YEAR = 12;
	
	public BankAccount(String fName, String middleInitial, String lName, double balance, boolean isSavings,
			int yearOfBirth) {
		setfName(fName);
		setMiddleInitial(middleInitial);
		setlName(lName);
		setBalance(balance);
		setSavings(isSavings);
		setYearOfBirth(yearOfBirth);
	}
	
	public BankAccount() {
		setfName(this.fName);
		setMiddleInitial(this.middleInitial);
		setlName(this.fName);
		setBalance(this.balance);
		setSavings(this.isSavings);
		setYearOfBirth(this.yearOfBirth);
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean getIsSavings() {
		return isSavings;
	}

	public void setSavings(boolean isSavings) {
		this.isSavings = isSavings;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public static double getNotSavingsMonthlyFee() {
		return NOT_SAVINGS_MONTHLY_FEE;
	}

//	public double getBalanceFromAcc(BankAccount acc) {
//		double theBalance = acc.getBalance();
//		return theBalance;
//	}
	
	public String getFullName() {
		String fullName = this.getfName() + " " +this.getMiddleInitial() + " " +this.getlName();
		return fullName;
	}

	public double withdraw(double i) {
		boolean isTooHigh = false;
		double newBalance = this.getBalance();
		double thisBalance = this.getBalance();
		
		if(i <= thisBalance) {
			newBalance = thisBalance - i;
			this.setBalance(newBalance);
		} else {
			isTooHigh = true;
		}
		if(isTooHigh) {
			return newBalance;
		}
		
		return newBalance;
	}

	public double deposit(double d) {
		double newBalance = this.getBalance() + d;
		this.setBalance(newBalance);
		return newBalance;
	}
	
	public double notSavingsYearlyFee() {
		
		double fee = 0;
		if(this.getIsSavings() == false) {
			fee = NOT_SAVINGS_MONTHLY_FEE * MONTHS_IN_A_YEAR;
			this.setBalance(this.getBalance() - fee);
		} 
		
		return fee;
	}

}
