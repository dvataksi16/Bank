import java.util.*;

public class ATM {
	protected ArrayList<Bank> banks;
	private boolean login = false;
	
	ATM(){
		banks= new ArrayList<>();
	}
	
	public void addBank(Bank b){
		banks.add(b);
	}
	
	public Account login(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter bank name");
		String name = input.nextLine();
		int accountNumber = input.nextInt();
		System.out.println("Login Successful ....");
		login = true;
		int indexOfBank = 0;
		for (int b = 0; b < banks.size(); b++){
			if (name==banks.get(b).getName())
				indexOfBank = b;
		}
		return banks.get(indexOfBank).getAccount(accountNumber-10000);
		
	}
	
	public void run(Account a){
		if (login == false){
			System.exit(0);
		}
		Scanner input = new Scanner(System.in);
		String command = input.nextLine();
		while(command != "Exit"){
			if (command == "Deposit"){
				System.out.println("Enter Amount");
				int amount = input.nextInt();
				a.deposit(amount);
				System.out.println("Deposit Successful ....");
			}
			if(command == "Withdraw"){
				System.out.println("Enter Amount");
				int amount = input.nextInt();
				a.withdraw(amount);
				System.out.println("Withdrawl Successful ....");
			}
		}
		System.out.println("Thank you for banking with us");
		
		
	}
	
	
	
	
}
