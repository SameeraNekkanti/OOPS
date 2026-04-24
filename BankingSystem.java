import java.util.Scanner;

interface BankOperations{
	void deposit(double amt);
	void withdraw(double amt);
}

interface LoanManagement{
	double interest_rate= 5.0;
	void calculateSimpleInterest(double principal,double time);
	
	void calculateEMI(double principal,int months);
}

interface FinancialServices extends BankOperations, LoanManagement{

}

class BankAccount implements FinancialServices {
	String name;
	BankAccount(String name, double amt){
		this.name=name;
		this.balance=amt;
		
	}
	double balance=0;
	
	public void deposit(double amt) {
		balance+=amt;
		System.out.println("deposited "+amt);
		
		System.out.println("balance: "+balance);
	}
	public void withdraw(double amt) {
		if(balance>=amt) {
		balance-=amt;
		System.out.println("balance: "+balance);
		}else {
			System.out.println("insufficient balance");
		}
		
		
	}
	public void calculateSimpleInterest(double p,double t) {
		double si=(p*t*interest_rate)/100;
		System.out.println("simple interest: "+si);
	}
	public void calculateEMI(double p,int n) {
		double monthlyRate=interest_rate/(12*100);
		double emi = (p * monthlyRate * Math.pow(1 + monthlyRate, n)) /
                (Math.pow(1 + monthlyRate, n) - 1);
   System.out.println("EMI: " + emi);
	}
}

public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name: ");
		String name=sc.nextLine();
		
		System.out.println("enter amt in ur bank: ");
		double amt=sc.nextDouble();
		
		BankAccount bank=new BankAccount(name, amt);
		
		bank.deposit(500);
		bank.withdraw(300);
		
		bank.calculateSimpleInterest(5000,2);
		
		
        bank.calculateEMI(5000, 2);
        
		
		

	}

}
