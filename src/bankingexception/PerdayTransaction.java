package bankingexception;

public class PerdayTransaction extends Exception  {
	int amount; 
	public PerdayTransaction(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		System.out.println("Transaction limit per day is"+amount);
	}

}
