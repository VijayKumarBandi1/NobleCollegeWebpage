package bankingexception;

public class AccountBalance extends Exception {
	int balance; 
	public AccountBalance(int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		System.out.println(" your balance is "+balance);
	}

}
