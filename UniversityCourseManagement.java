import java.util.Scanner;
interface Course{
	int getCourseDuration();
	String getMode();
	int getMaxStudents();
	boolean enrollStudent();
	int getEnrollmentCount();

}

class classroom implements Course{
	private final int maxCapacity=60;
	private int enrolled=0;
	private int duration;
	
	public classroom(int duration) {
		this.duration=duration;
	}
	public int getCourseDuration() {
		return duration;
	}
	public String getMode() {
		return "classroom";
		
	}
	public int getMaxStudents(){
	return maxCapacity;
	}
	public int getEnrollmentCount() {
        return enrolled;
    }
	
	public boolean enrollStudent() {
		if (enrolled<maxCapacity) {
			enrolled++;
			return true;
		}else {
			System.out.println("Limit reached!");
            return false;
		}
	}
	
}
class online implements Course{
	private final int maxCapacity=200;
	private int enrolled=0;
	private int duration;
	
	public online(int duration) {
		this.duration=duration;
	}
	public int getCourseDuration() {
		return duration;
	}
	public String getMode() {
		return "Online";
	}
	public int getMaxStudents() {
		return maxCapacity;
	}
	public int getEnrollmentCount() {
		return enrolled;
		
	}
	public boolean enrollStudent() {
		if(enrolled<maxCapacity) {
			enrolled++;
			return true;
		}else {
			System.out.println("Online limit reached!");
            return false;
		}
	}
}
class Hybrid implements Course {
    private final int maxCapacity = 100;
    private int enrolled = 0;
    private int duration;

    public Hybrid(int duration) {
        this.duration = duration;
    }

    public int getCourseDuration() {
        return duration;
    }

    public String getMode() {
        return "Hybrid (Online + Classroom)";
    }

    public int getMaxStudents() {
        return maxCapacity;
    }

    public int getEnrollmentCount() {
        return enrolled;
    }

    public boolean enrollStudent() {
        if (enrolled < maxCapacity) {
            enrolled++;
            return true;
        } else {
            System.out.println("Hybrid limit reached!");
            return false;
        }
    }
}

public class UniversityCourseManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num of courses: ");
		int n=sc.nextInt();
		sc.nextLine();
		Course[] courses=new Course[n];
		
		for(int i=0; i<n;i++) {
			System.out.println("Course " + (i + 1));
            System.out.println("1. Classroom Course");
            System.out.println("2. Online Course");
            System.out.println("3. Hybrid Course");
            
            int choice=sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter duration: ");
            int duration = sc.nextInt();
            
            if(choice==1) {
            	courses[i]=new classroom(duration);
            }else if(choice==2){
            	courses[i] = new online(duration);
            	
            }else if(choice==3) {
            	 courses[i] = new Hybrid(duration);
            } else {
                System.out.println("Invalid choice!");
                i--;
            }
            
		}
		for(int i=0; i<n;i++) {
			System.out.println("enrolling students "+(i+1));
			courses[i].enrollStudent();
		}
	
	
	for (int i = 0; i < n; i++) {
        System.out.println("Course " + (i + 1) + " Details:");
        System.out.println("Mode: " + courses[i].getMode());
        System.out.println("Duration: " + courses[i].getCourseDuration());
        System.out.println("Max Students: " + courses[i].getMaxStudents());
        System.out.println("Enrolled: " + courses[i].getEnrollmentCount());
}
	sc.close();
}
}
	
