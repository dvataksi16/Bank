import java.util.ArrayList;
import java.util.List;

public class Bank {
	protected ArrayList<Account> bank;
	protected String name;
	
	Bank(){
		bank = new ArrayList<>();
	}
	
	Bank(String name){
		this.name = name;
		bank = new ArrayList<>();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
    public Account openAccount() {
    	int accountNumber = bank.size() + 10000;
    	Account newAccount = new Account(accountNumber);
    	bank.add(newAccount);
    	return newAccount;
    }
    public Account openAccount(double dep) {
    	int accountNumber = bank.size() + 10000;
    	Account newAccount = new Account(accountNumber,dep);
    	bank.add(newAccount);
    	return newAccount;
    }	
    
    public CheckingAccount openChecking() {
    	int accountNumber = bank.size() + 10000;
    	CheckingAccount newChecking = new CheckingAccount(accountNumber);
    	bank.add(newChecking);
    	return newChecking;
    }
    public CheckingAccount openChecking(double dep, double limit) {
    	int accountNumber = bank.size() + 10000;
    	CheckingAccount newChecking = new CheckingAccount(accountNumber, dep,limit);
    	bank.add(newChecking);
    	return newChecking;
    }

    public SavingsAccount openSavings (double balance, double interest) {
    	int accountNumber = bank.size() + 10000;
    	SavingsAccount newSavings = new SavingsAccount (accountNumber, balance, interest);
    	return newSavings;
    }
    public SavingsAccount openSavings () {
    	int accountNumber = bank.size() + 10000;
    	SavingsAccount newSavings = new SavingsAccount (accountNumber);
    	return newSavings;
    }
    public void updateAll() {
    	for (Account a: bank){
    		if (a instanceof CheckingAccount){
    			if (((CheckingAccount)a).getBalance() == ((CheckingAccount)a).getLimit()){
    				System.out.println("You are in overdraft.");
    			}
    		}
    		if ( a instanceof SavingsAccount){
    			((SavingsAccount)a).addInterest();
    		}
    	}
    }

    public Account getAccount(int accountNumber) {
    	if (accountNumber-10000< bank.size())
    		return bank.get(accountNumber - 10000);
    	else
    		return null;
    }
}