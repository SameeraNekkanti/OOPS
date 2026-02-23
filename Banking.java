package objects;
import java.util.Scanner;
public class Banking {

	public static void main(String[] args) {
		BankAccount defaultAcc=new BankAccount();
		System.out.println("Default Acc Details:");
		defaultAcc.displayAccountDetails();
		System.out.println();
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter acc number: ");
        String accNum=sc.nextLine();
        System.out.print("Enter acc holder name: ");
        String accHolder=sc.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance=sc.nextDouble();
        BankAccount userAccount=new BankAccount(accNum, accHolder, initialBalance);

        System.out.println("Performing transactions...");
        userAccount.deposit(500);
        System.out.println();
        userAccount.withdraw(2000);
        System.out.println("\nFinal Account Details:");
        userAccount.displayAccountDetails();
        sc.close();
	}

}
class BankAccount{
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount() {
        accountNumber="N/A";
        accountHolder="N/A";
        balance=0.0;
    }
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Deposit amount: "+amount);
        System.out.println("Updated Balance: "+balance);
    }
    public void withdraw(double amount) {
        System.out.println("Withdraw amount: "+amount);
        if(amount>balance){
            System.out.println("Insufficient balance!");
            System.out.println("Balance remains: "+balance);
        }else{
        	balance-=amount;
            System.out.println("Updated Balance: "+balance);
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
}
        
    

