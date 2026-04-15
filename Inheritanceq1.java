package hello_world;
import java.util.Scanner;
class Recordss{
	private String name;
	private int age;
	
	public Recordss(String name, int age) {
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
	Recordss[] rec=new Recordss[10];
}
class Studentx extends Recordss{
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

public class Inheritanceq1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		University record=new University();
		System.out.println("enter number of students: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name, age, ID");
		for(int i=0; i<n; i++) {
			
			String name=sc.nextLine();
			int age=sc.nextInt();
			String ID=sc.next();
			sc.nextLine();
			
			
			Studentx s=new Studentx(name, age, ID);
			record.rec[i]=s;
			s.display();
			System.out.println("enter name, age, ID");
			
			
		}
	sc.close();
		
	}

}

