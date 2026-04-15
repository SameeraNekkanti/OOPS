package hello_world;
import java.util.Scanner;

class Records{
	public String name;
	public int age;
	
	public Records(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
class University{
	Records[] rec=new Records[10];
}
class Studentx extends Records{
	private String ID;

	public Studentx(String name, int age, String ID) {
		super(name,age);
		this.ID=ID;
	}
	public void display() {
		System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + ID);
	}
}
public class Mainq1 {

	public static void main(String[] args) {
		
		University record=new University();
		System.out.println("enter number of students: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name, age, ID");
		for(int i=0; i<=n; i++) {
			String name=sc.nextLine();
			int age=sc.nextInt();
			String ID=sc.next();
			sc.nextLine();
			
			Studentx s=new Studentx(name, age, ID);
			record.rec[i]=s;
			s.display();
			
			
			
		}
	sc.close();
		
	}

}