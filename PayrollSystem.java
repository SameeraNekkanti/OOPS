import java.util.Scanner;

abstract class Employee{
	protected String name;
	
	public Employee(String name){
		this.name=name;
	}
	public abstract double calculateSalary();
	
	public String getName() {
		return name;
	}
}

class FulltimeEmployee extends Employee{
	private double baseSalary;
	private double benefits;
	
	public FulltimeEmployee(String name, double baseSalary, double benefits){
		super(name);
		this.baseSalary=baseSalary;
		this.benefits=benefits;
		
	}
	public double calculateSalary() {
		return baseSalary+benefits;
	}
}

class ContractEmployee extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	
	public ContractEmployee(String name, int hoursWorked, double hourlyRate) {
		super(name);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		
	}
	public double calculateSalary() {
		return hoursWorked*hourlyRate;
	}
	
}



public class PayrollSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of employees: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Employee[] employees=new Employee[n];
		for(int i=0; i<n;i++) {
			System.out.println("Employee "+(i+1));
			System.out.println("Enter 1 for Full-Time");
			System.out.println("Enter 2 for Contract");
			int choice=sc.nextInt();
			sc.nextLine();
			
			System.out.println("enter name: ");
			String name=sc.nextLine();
			
			if(choice==1) {
				System.out.println("Enter base salary");
				double baseSalary=sc.nextDouble();
				
				System.out.print("enter benefits: ");
				double benefits=sc.nextDouble();
				
				employees[i]=new FulltimeEmployee(name, baseSalary, benefits);
			
		}
			else if(choice==2) {
				System.out.println("enter hours worked");
				int hours = sc.nextInt();

                System.out.print("Enter hourly rate: ");
                double rate = sc.nextDouble();
                
                employees[i]=new ContractEmployee(name, hours, rate);
			}
			else {
				System.out.println("invalid");
			}
				
			}
		System.out.println("pay: ");
		for(Employee emp: employees) {
			System.out.println(emp.getName()+" salary: "+emp.calculateSalary());
		}
		sc.close();

	}

}

