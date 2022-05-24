package bankingexception;
import java.util.*;
public class BankingException {
	int transactioncount;
	int transactionamount;
	int accountbalance;
	Scanner obj= new Scanner(System.in);
	BankingException(int accountbalance){
		this.accountbalance=accountbalance;
	}
	
	public void WithDraw() {
		System.out.println("enter the amount to be withdrawn");
		int withDrawAmount=obj.nextInt();
		try {
			if (accountbalance<1000) {
				throw new AccountBalance(accountbalance);
				
			}
		}
		catch(AccountBalance e) {
			System.out.println("Alert! balance is below1000");
		}
		try {
			if(transactioncount>3) {
				throw new TransactionCount(transactioncount);
				
			}
		}
		catch (TransactionCount e) {
			System.out.println("per day transaction count should be 3");
			
		}
		try {
			if (transactionamount>100000) {
				throw new PerdayTransaction(transactionamount);
			}
		}
		catch(PerdayTransaction e) {
			System.out.println("Alert! transaction amount is more than 100000");
			
		}
		try {
			if(accountbalance < withDrawAmount ) {
				throw new InsufficientBalance(withDrawAmount-accountbalance);
				
			}
			else {
				accountbalance= accountbalance - withDrawAmount;
				System.out.println("balance after transaction is "+accountbalance);
				transactioncount++;
				transactionamount = transactionamount+withDrawAmount;
				try {
					if(accountbalance < 1000) {
						throw new AccountBalance(accountbalance);
					}
				}		
				catch(AccountBalance e) {
					System.out.println("alret! account balance below 1000");
				}
				
			}
		}
		catch(InsufficientBalance e) {
			System.out.println("alret! not enogh money");
		}
	}
	
	
	

}
