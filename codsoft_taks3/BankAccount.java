package codsoft_taks3;

public class BankAccount {
	 private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Successfully deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Successfully withdrawn: $" + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid withdrawal amount.");
	        }
	    }

}
