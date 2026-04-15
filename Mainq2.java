
import java.util.Scanner;

interface Payment{
	double processPayment(double balance, double amt);
}

class CreditCard implements Payment{
	public double processPayment(double balance, double amt) {
		System.out.println("Processing Payment through Credit Card...");
		return balance-amt;
	}
}
 
class UPI implements Payment{
	public double processPayment(double balance, double amt) {
		System.out.println("Processing Payment through UPI...");
		return balance-amt;
	}
}
class other implements Payment{
	public double processPayment(double balance, double amt) {
		System.out.println("processing through other method");
		return balance-amt;
	}
}
class MainBank{
	private String name;
	private double balance;
	
	public MainBank(String name,double balance) {
		this.name=name;
		this.balance=balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public String getName() {
		return name;
	}
}
public class Mainq2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Bank Service!");
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Enter your bank balance");
		double balance=sc.nextDouble();
		System.out.println(name+", enter amt to withdraw: ");
        double amt=sc.nextDouble();
        
		while(true){
            System.out.println("Enter 1 for credit card");
            System.out.println("Enter 2 for UPI");
            System.out.println("Enter 3 to add new payment method");
           
            System.out.println("Enter 4 to check balance");
            System.out.println("Enter 5 to exit");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
            case 1:
                System.out.println("you chose credit card!");
                if (amt > balance) {
                    System.out.println("❌ Insufficient balance!");
                } else {
                    balance = new CreditCard().processPayment(balance, amt);
                }
                break;
                
                
            case 2:
                System.out.println("you chose UPI!");
                if (amt > balance) {
                    System.out.println("❌ Insufficient balance!");
                } else {
                    balance = new UPI().processPayment(balance, amt);
                }
                break;
            case 3:
            	System.out.println("enter new payment method");
            	String newpay=sc.nextLine();
            	 if (amt > balance) {
            	        System.out.println("❌ Insufficient balance!");
            	    } else {
            	        balance = new other().processPayment(balance, amt);
            	    }
            	    break;
            case 4:
                System.out.println("Current Balance: " + balance);
                break;
            case 5:
                System.out.println("Exiting...");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice!");
            }
        }
	}
}
