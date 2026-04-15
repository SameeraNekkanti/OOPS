package files;
import java.util.Scanner;
class StudentResult{
	public String name;
	public int total;
	public int[] marks;
	public double percentage;
	
	public StudentResult(String name, int[]marks){
		this.name=name;
		this.marks=marks;
		
	}
	public double getTotal() {
		int sum=0;
		
		for(int i=0;i<5;i++) {
			sum+=marks[i];
		}
		total=sum;
		percentage=sum/5.0;
		return total;
	
	}
	public void display(int rank) {
		System.out.println("Rank " + rank+": " + name + ", Total: " + total + ", Percentage: " + percentage + "%");
	}
}

public class RankRace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentResult[] students=new StudentResult[10];
		while (true) {
            System.out.println("\n--- University Result Menu ---");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Top 3 Rank Holders");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1:
                
                for (int i = 0; i < 10; i++) {
                    System.out.println("Enter name of student " + (i + 1) + ": ");
                    String name = sc.nextLine();

                    int[] marks = new int[5];
                    System.out.println("Enter marks for 5 subjects:");
                    for (int j = 0; j < 5; j++) {
                        marks[j] = sc.nextInt();
                    }
                    sc.nextLine(); // consume newline

                    students[i] = new StudentResult(name, marks);
                }
                System.out.println("Student details entered successfully!");
                break;
                
            case 2:
            	for (StudentResult s : students) {
                    s.getTotal();
                }

                // Sort students by total marks (descending)
                for (int i = 0; i < students.length - 1; i++) {
                    for (int j = i + 1; j < students.length; j++) {
                        if (students[j].total > students[i].total) {
                            StudentResult temp = students[i];
                            students[i] = students[j];
                            students[j] = temp;
                        }
                    }
                }
                    System.out.println("\n--- Top 3 Rank Holders ---");
                    for (int i = 0; i < 3; i++) {
                        students[i].display(i + 1);
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        

	}

	}
}
