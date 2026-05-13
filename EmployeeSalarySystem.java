package labEvalTwo;
import java.util.Scanner;

class Employee{
	protected String name;
	protected double baseSalary;
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public double calculateSalary() {
		return baseSalary;
	}
	public void display() {
		System.out.println("employee: "+name+" salary: "+calculateSalary());
	}
	
	
}
class Manager extends Employee{
		double bonus;
	public Manager(String name, double baseSalary, double bonus) {
		super(name, baseSalary);
		this.bonus=bonus;
		
	}
	@Override
	public double calculateSalary() {
		return baseSalary+bonus;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("bonus: "+bonus);
	}
	
	
}
public class EmployeeSalarySystem {

	public static void main(String[] args) {
		Employee e=new Employee("Alice",40000);
		Manager m=new Manager("Bob",50000,15000);
		e.display();
		m.display();
		
		Employee ref=new Manager("Bob",50000,15000);
		
		//Runtime Polymorphism
		
		System.out.println("ref test--> calculateSalary(): "+ref.calculateSalary());
		
		

	}

}
