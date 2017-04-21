
class SavingsAccount extends Account {
	
	private double interest;
	
	SavingsAccount(int accountNumber){
		super(accountNumber);
		interest = .1;
	}
	
	SavingsAccount(int accountNumber, double startingDeposit, double interest){
		super(accountNumber, startingDeposit);
		this.interest = interest;
	}

	public double getInterest(){
		return interest;
	}
	public void setInterest(double interest){
		this.interest = interest;
	}
	
	public void addInterest(){
		balance = balance + (1 + interest);
	}

	 @Override 
	  public void withdraw(double sum) {
		  if (balance > 0)
			  balance-=sum;
	  }
	
}