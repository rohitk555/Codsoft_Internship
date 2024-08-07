package codsoft_taks3;

public class ATMSystem {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000); 
        ATM atm = new ATM(account);
        atm.showMenu();
	}

}
