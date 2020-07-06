package oopsConcepts;

class BankAccount {
   private double balance;
   //private String accountNumber;
   
 
   
   public void deposite(double amount) {
	   balance = balance + amount;
	   
   }
   public void withdraw(double amount) {
	   if(amount <= balance) {
		   balance = balance-amount;
	   }
	   else {
		   System.out.println("insufficinet balance");
	   }   
   }
   public double getBalance() {
		return balance;
	}
 public void transfer(double amount, BankAccount otherAccount) {
	 otherAccount. deposite(amount);
	 balance = balance- amount;
 }
   
}
