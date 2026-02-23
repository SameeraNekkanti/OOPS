package hello_world;
class Employee{
	String name;
	double salesAmount;
	Employee(String name, double salesAmount){
		this.name=name;
		this.salesAmount=salesAmount;
	}
}
public class HighestEarner {

	public static void main(String[] args) {
		Employee[] employees=new Employee[4];
		employees[0]=new Employee("Alice",5000.0);
		employees[1]=new Employee("Bob",75000.0);
		employees[2]=new Employee("Charlie",3000.0);
		employees[3]=new Employee("Diana",95000.0);
		Employee highest=employees[0];
		for(int i=0; i<employees.length;i++){
			 
				if(employees[i].salesAmount>highest.salesAmount) {
					highest=employees[i];
					
				}
			
			}
			System.out.println("Top Seller: " + highest.name + 
                 " with " + highest.salesAmount);
			
		
	}

}
