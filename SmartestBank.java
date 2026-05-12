package labEvalTwo;

import java.io.*;
import java.util.Scanner;

abstract class Accountz{
	protected int accountNumber;
	protected String accountHolderName;
	protected double balance;
	
	public static final double min_balance=1000;
	
	public Accountz(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		
	}
	public abstract double calculateInterest();
	
		public final void generateStatement() {
			System.out.println("Account Number: "+accountNumber);
			System.out.println("Account Holder: "+accountHolderName);
			System.out.println("Balance: "+balance);	
		}
		
}
interface TransactionService{
	void deposit(double amount) throws Exception;
	void withdraw(double amount) throws Exception;
}
		class PremiumAccountz extends Accountz implements TransactionService{
			private int withdrawalLimit;

			public PremiumAccountz(int accountNumber, String accountHolderName, double balance, int withdrawalLimit) {
				super(accountNumber, accountHolderName, balance);
				this.withdrawalLimit = withdrawalLimit;	
	}
			@Override
			public double calculateInterest() {
				return balance*0.03;
			}
			
			@Override
			public void deposit(double amount) throws Exception{
				if(amount<=0) {
					throw new Exception("invalid deposit amount");
				}
				balance+=amount;
				System.out.println("Deposited: " + amount);
			}
			@Override
			public void withdraw(double amount) throws Exception{
				if (amount <= 0) {
		            throw new Exception("Invalid withdrawal amount!");
		        }

				
				if(amount>withdrawalLimit) {
					throw new Exception("amount exceeded withdrawal amount");
				}
				if(balance-amount<min_balance) {
					throw new Exception("Minimum balance must be maintained.");
				}
				balance-=amount;
				System.out.println("Withdrawn: " + amount);
			}
			
			public String getDetails() {
		        return accountNumber + "," + accountHolderName + "," + balance + "," + withdrawalLimit;
			}
		}
		
public class SmartestBank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("enter acc number: ");
		int accNo=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name: ");		
		String name=sc.nextLine();
		System.out.println("enter acc balance: ");
		double balance=sc.nextDouble();
		
		System.out.println("enter withdrawal limit : ");
        int limit = sc.nextInt();

        PremiumAccountz acc = new PremiumAccountz(accNo, name, balance, limit);
        
        System.out.println("account created successfully!");
        
        //transactions
        System.out.println("enter deposit amount: ");
        acc.deposit(sc.nextDouble());
        
        System.out.println("enter withdrawal amount: ");
        acc.withdraw(sc.nextDouble());
        
        acc.generateStatement();
		
        
        //write file
        FileWriter fw=new FileWriter("accounts.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(acc.getDetails()+"/n");
        fw.close();
        
        //read file
        System.out.println("file data");
        BufferedReader br=new BufferedReader(new FileReader("accounts.txt"));
        String line;
        while((line=br.readLine())!=null){
        	System.out.println(line);
        }
        br.close();
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
        
        
        sc.close();
		
		

	}

}
