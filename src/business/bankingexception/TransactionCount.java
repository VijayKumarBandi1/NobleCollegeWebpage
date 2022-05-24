package bankingexception;

public class TransactionCount extends Exception {
	int count; 
	public TransactionCount(int amount) {
		// TODO Auto-generated constructor stub
		this.count = count;
		System.out.println("this is your "+count+" transaction");
	}

}
