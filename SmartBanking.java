package labEvalTwo;

import java.util.Scanner;

class Account{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public Account(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}	
		public void displayAccountDetails() {
			System.out.println("Account Number: "+accountNumber);
			System.out.println("Account Holder: "+accountHolderName);
			System.out.println("Balance: "+balance);	
		}
}
		class PremiumAccount extends Account{
			int withdrawalLimit;

			public PremiumAccount(int accountNumber, String accountHolderName, double balance, int withdrawalLimit) {
				super(accountNumber, accountHolderName, balance);
				this.withdrawalLimit = withdrawalLimit;	
	}
			@Override
			public void displayAccountDetails() {
				System.out.println("Premium Account Details:");
			    super.displayAccountDetails();
				System.out.println("Withdrawal Limit: " + withdrawalLimit);
				
			}
}
public class SmartBanking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter acc number: ");
		int accNo=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name: ");		
		String name=sc.nextLine();
		System.out.println("enter acc balance: ");
		double balance=sc.nextDouble();
		
		Account acc= new Account(accNo, name, balance);
		
		System.out.println("Enter premium account number: ");
		int pAccNo = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter premium account holder name: ");
		String pName = sc.nextLine();

		System.out.println("Enter premium account balance: ");
		double pBalance = sc.nextDouble();

		System.out.println("Enter withdrawal limit: ");
		int limit = sc.nextInt();

        PremiumAccount p = new PremiumAccount(pAccNo, pName, pBalance, limit);
        
        acc.displayAccountDetails();
        p.displayAccountDetails();
        
        sc.close();
		
		

	}

}
