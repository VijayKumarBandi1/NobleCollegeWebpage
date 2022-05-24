package bankingexception;

public class InsufficientBalance extends Exception {
	int amount; 
	public InsufficientBalance(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		System.out.println("Account is shortage of amount"+amount);
		System.out.println("Please maintain the minimal balance of 1000 rs");
	}
}
