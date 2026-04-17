import java.util.Scanner;

abstract class Course{
	protected String title;
	protected int duration;
	
	public Course(String title, int duration) {
		this.title=title;
		this.duration=duration;
	}
	public abstract void displayDetails();
	
}
class RecordedCourse extends Course{
	public RecordedCourse(String title, int duration) {
		super(title, duration);
	}
	public void displayDetails() {
		System.out.println("Access: Live sessions");
		System.out.println("Course: " + title);
        System.out.println("Duration: " + duration + " hours");
        
	}
}
	class LiveCourse extends Course{
		private String schedule;
		public LiveCourse(String title, int duration, String schedule) {
			super(title, duration);
			this.schedule=schedule;
		
		
}
		public void displayDetails() {
			System.out.println("Access: Live sessions");
			System.out.println("Course: " + title);
	        System.out.println("Duration: " + duration + " hours");
	        System.out.println("Schedule: " + schedule);
		}
	}
public class UniversityCourses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num of courses: ");
		int n=sc.nextInt();
		sc.nextLine();
		Course[] courses=new Course[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Course " + (i + 1));
            System.out.println("1. Recorded Course");
            System.out.println("2. Live Course");
            
            int choice=sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter duration (hours): ");
            int duration = sc.nextInt();
            sc.nextLine();
            
            if(choice==1) {
            	courses[i]=new RecordedCourse(title, duration);
            }
            else if(choice==2) {
            	System.out.print("Enter schedule: ");
                String schedule = sc.nextLine();
            	courses[i]=new LiveCourse(title,duration,schedule);
            	
            }else {
            	System.out.print("invalid");
            }
		}
		System.out.println("Course details: ");
		for(Course c: courses) {
			c.displayDetails();
			System.out.println();
		}
		sc.close();

	}

}
