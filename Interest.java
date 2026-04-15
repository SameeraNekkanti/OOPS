package files;
import java.util.Date;
class Account{
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	
	//default account
	public Account() {
		dateCreated=new Date();
		
		
	}
	public Account(int id, double balance) {
		this.id=id;
		this.balance=balance;
		dateCreated=new Date();
		
	}
	//accessor
	public int getId() {
		return id;
	} public double getBalance() {
        return balance;
	}public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
 // Mutator methods
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }
 // Monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }
    // Monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
 // Withdraw method
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    // Deposit method
    public void deposit(double amount) {
        balance = balance + amount;
    }
}


public class Interest {

	public static void main(String[] args) {
		Account acc=new Account(1122,20000);
		 acc.setAnnualInterestRate(4.5);
		 acc.withdraw(2500);
	        acc.deposit(3000);

	        System.out.println("Balance: $" + acc.getBalance());
	        System.out.println("Monthly Interest: $" + acc.getMonthlyInterest());
	        System.out.println("Date Created: " + acc.getDateCreated());
	}

}
