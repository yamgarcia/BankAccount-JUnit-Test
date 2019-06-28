package lab4b;

public class Main {
	
	public static void main (String [] args) {
		BankAccount acc1 = new BankAccount("John", "C", "Jones", 20000.00, false, 1977);
		BankAccount acc2 = new BankAccount("Mark", "J", "Mills", 10000.00, true, 1970);

		System.out.println(acc1.getFullName());
		System.out.println(acc2.getFullName());
//		System.out.println(acc1.getFullName());
//		System.out.println(acc1.getFullName());
//		System.out.println(acc1.getFullName());
		System.out.println(acc1.getlName());
		
		
	}

}
