package banking;
// create class main account
public class Main_Account {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account();
		ac.setaccount_Number(2304);
		
		ac.setCustomer_Name("vijay kumar");
		ac.setbalance(100000)         ;
		
		System.out.println("Enter Account Number:"+ac.getAccount_Number());
		
		System.out.println("Enter Customer Name:"+ac.getCustomer_Name())  ;
		
		CheckingAccount check = new CheckingAccount();
		SavingAccount save    = new SavingAccount();
		
		System.out.println("Balance"+ " "+ac.getbalance());
		
		save.setdeposit(10000)       ;
		ac.getmonthlyInterestRate();
		save.print()               ;
		
		System.out.println()  ;
		check.setwithDraw(5000);
		check.print()         ;
	
	}

}
class Account {
	long account_Number=0;
	public long getAccount_Number() {
	return account_Number;
  }
	public void setAccount_Number(long account_Number) {
	this.account_Number = account_Number;
  }
	public String getCustomer_Name() {
	return customer_Name;
  }
	public void setCustomer_Name(String customer_Name) {
	this.customer_Name = customer_Name;
  }
		String customer_Name=" ";
		protected double balance=0;
		double annualInterestRate=0;


		Account() {
		balance=100000;
		setbalance(balance);
		setannualInterestRate(annualInterestRate);
      }

 public void setaccount_Number(long i) {
	  account_Number=i;
 }

 public  void setannualInterestRate(double annualInterestRate) {
	
	annualInterestRate=annualInterestRate;
 }

 public void setbalance(double balance) {
	balance=balance;	
 }
 public long getaccount_Number() {
	return account_Number;
 }

 public double getbalance() {
		return balance;
	}
 public double getannualInterestRate() {
		return annualInterestRate;
 }

 public String dataCreated() {
	  String output ="The data created"+"  "+dataCreated().toString();
	  return output;
 }

 public double getmonthlyInterestRate() {
	  double interest=balance*(1*(7*1));
	  balance = balance + interest;
	  return balance;
	}
  
public void printInfo() {
	   String output= "Customer id:"+" "+getaccount_Number()+ " "+"\n The monthly interest rate:" +getmonthlyInterestRate()+" "+
			   "\n Orginal balance: "+ " "+ balance+ "\n Original Balance Amount is: "+" "+getbalance()+"\n"+dataCreated();
	   System.out.println(output);
  }
}

class SavingAccount extends Account{
	double deposit=0;
	
	SavingAccount(){
		super();
		
	}
	public void setdeposit(double d) {
		if(d>balance)
		{
			System.out.println("Can;t deposit a value greater than"+    "Your balnce");
			System.exit(0);
		}
		else
		deposit= d;
		balance +=d;
	}
	public double getdeposit() {
		return deposit;
	}
	
	public void print() {
		String output = "Deposited"+" "+deposit+    "\nSavings balance after deposit:"+ balance;
		System.out.println(output);
	}
}
class CheckingAccount extends Account {
	double withDraw=0;
	
CheckingAccount() {
	super();

	
		}
public void setwithDraw(double withDraw) {
	if(withDraw>balance) {
		System.out.println("Can't withdraw a value greater"+ "than your balance");
		System.exit(0);
	}
	else
		withDraw = withDraw;
		balance  = withDraw;
}
public double getwithDraw() {
	return withDraw;
}
public void print() {
	String output= "Withdraw"+" "+ withDraw+ "\n Checking  withdraw:"+" "+balance;
	System.out.println(output);
}
}

