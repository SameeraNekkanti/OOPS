package labEvalTwo;

public class BankSystem {
	public static void main (String[] args) {
		int balance=5000;
		int amount=7000;
		try{
			withdraw(balance,amount);
		}catch(ArithmeticException e){
			System.out.println("exception: "+e.getMessage());
		}
		
	}
	public static void withdraw(int balance, int amount) {
		if(amount>balance) {
			throw new ArithmeticException("insufficient balance");
		}
		balance=balance-amount;
	
	System.out.println("successful");
	System.out.println("remaining balance: "+balance);
	}
}
