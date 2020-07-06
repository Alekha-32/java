package oopsConcepts;

public class TransactionManager {
	public static void main(String[] args) {
		BankAccount ac = new BankAccount();
		ac.deposite(10000);
		
		BankAccount ac2 = new BankAccount();
		ac2.deposite(20000);
		
		
		ac.withdraw(1000);
		ac.transfer(1000,ac2);
		
		
		
		System.out.println(ac.getBalance());
		System.out.println(ac2.getBalance());
	}

}
