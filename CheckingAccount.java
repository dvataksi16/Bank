class CheckingAccount extends Account {
	
	double limit;
		
	CheckingAccount(int accountNumber){
		super(accountNumber);
		limit = -20;
	}
	CheckingAccount(int accountNumber, double startingDeposit, double limit){
		super(accountNumber, startingDeposit);
		this.limit = limit;
	}
	
	public double getLimit(){
		return limit;
	}
	
	public void setLimit(double limit){
		this.limit = limit;
	}
	
	@Override 
    public void withdraw(double sum) {
    	if ((balance - sum) < limit){
    		System.out.println("You cannot withdraw that much. You have reached your overdraft limit. You have $" + getBalance() + " in your account." );
    	}
    	else
    		balance-=sum;
    }
	
	
}