package files;
import java.util.Scanner;

class Customer{
	private String name;
	private double income;
	private double loan;
	private double ratio;
	
	public Customer(String name, double income, double loan){
		this.name=name;
		this.income=income;
		this.loan=loan;
		this.ratio=calculateRatio();
	}
	
	public double calculateRatio() {
		if (income == 0) {
            return 0;
        } else {
            return loan / income;
            }
	}
	
	public double getRatio() {
        return ratio;
	}
	
	void display() {
		 System.out.println("Customer Name: " + name);
	        System.out.println("Income: " + income);
	        System.out.println("Loan: " + loan);
	        System.out.println("Loan-to-Income Ratio: " + ratio);
	        System.out.println("---------------------------");
	}
}
public class BankLoanApprovalNightmare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of customers: ");
		int n=sc.nextInt();
		Customer[] customers=new Customer[n];
		int i=0;
		int choice;
		
		do {
			System.out.println("\n--- Bank Loan Approval System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Show All Customers");
            System.out.println("3. Show Eligible Customers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
            	if(i>=n) {
            		System.out.println("max customers reached!");
            		break;
            	}
            	System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Monthly Income: ");
                double income = sc.nextDouble();

                System.out.print("Enter Existing Loan: ");
                double loan = sc.nextDouble();
                sc.nextLine();
                
                customers[i]=new Customer(name, income, loan);
                i++;
                System.out.println("Customer added successfully!");
                break;
                
            case 2:
            	if (i==0){
            		System.out.println("no customers available");
            	}else {
            		for(int j=0; j<i;j++) {
            			customers[j].display();
            		}
            	}break;
            	
            case 3:
            	int count=0;
            	for(int j=0; j<i; j++) {
            		if(customers[j].getRatio()<0.5) {
            			customers[j].display();
            			count++;
            		}
            	}
            	if(count==0) {
            		System.out.println("No eligible customers found.");
            	}
            	break;
            	
            case 4:
            	System.out.println("Exiting program...");
                break;
                
                default:
                	System.out.println("Invalid choice!");
            
		}
		
		
	}while(choice!=4);
		sc.close();
	}
}















