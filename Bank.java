package hello_world;
import java.util.Scanner;
class BankAccount{
	String accNum;
	String accHolder;
	double balance;
	BankAccount() {
		this.accNum="N/A";
		this.accHolder="N/A";
		this.balance=0.0;
	}
	BankAccount(String accNum, String accHolder,double balance){
		this.accNum=accNum;
		this.accHolder=accHolder;
		this.balance=balance;
		
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance!");
            System.out.println("Balance remains: " + balance);
		}else if(amount>0) {
			balance-=amount;
			 System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
		
		}
	public void displaydetails() {
		System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
		
	}
}
public class Bank{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        BankAccount acc=new BankAccount(accNum, accHolder, balance);
        int choice;
        
        
        do {
        	System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice) {
            case 1:
            	System.out.print("Enter deposit amount: ");
                double depositAmount=sc.nextDouble();
                acc.deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = sc.nextDouble();
                acc.withdraw(withdrawAmount);
                break;
            case 3:
                acc.displaydetails();
                break;
            case 4:
                System.out.println("Thank you for using the bank system!");
                break;
            default:
                System.out.println("Invalid choice! Try again.");
            
            }
        }while(choice!=4);
        sc.close();
		
	}
}