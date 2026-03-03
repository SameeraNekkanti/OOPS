package hello_world;
import java.util.Scanner;

class Studenti {
    private String name;
    private int rollNumber;
    private int marks;
	
    public Studenti(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
	public String calculateGrade() {
		if(marks>=80) {
			return "A";
		}
		else if(marks>= 60) {
            return "B";
		
	}else if (marks >= 40) {
        return "C";
    } else {
        return "Fail";
    }
	}

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
		
	}
}
public class practice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
		

        Studenti students=new Studenti(name,roll,marks);
        students.displayDetails();
        

        
        sc.close();
	}

}
