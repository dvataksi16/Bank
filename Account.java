class Account {
	
	protected double balance;
	protected int accountNumber;
	
	Account(int accountNumber){
		this.accountNumber = accountNumber;
		balance = 0;
	}
	Account(int accountNumber, double startingDeposit){
		this.accountNumber = accountNumber;
		deposit(startingDeposit);
	}
		
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public double getBalance(){
		return balance;
	}

    public void deposit(double sum) {
    	balance+=sum;	
    }

    public void withdraw(double sum) {
    	balance-=sum;
    }
}