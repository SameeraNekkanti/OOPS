package files;
import java.util.Scanner;

class BookIssue{
	String name;
	String bookName;
	int issueDate;
	int returnDate;
	int fine;
	
	BookIssue(String name, String bookName, int issueDate, int returnDate){
		this.name=name;
		this.bookName=bookName;
		this.issueDate=issueDate;
		this.returnDate=returnDate;
		this.fine=0;
	}
		
	void calculateFine(int allowedDays, int finePerday) {
		int daysKept=returnDate-issueDate;
			
		if(daysKept>allowedDays) {
			fine=(daysKept-allowedDays)*finePerday;
			
		}else {
			fine=0;
		}
	}
		void display() {
			System.out.println("student name: "+name);
			System.out.println("Book name: "+bookName);
			System.out.println("Issue date: "+issueDate);
			System.out.println("Return Date: " + returnDate);
	        System.out.println("Fine: " + fine);
	        System.out.println("---------------------------");
		}
					
}
public class LibraryFineShock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookIssue[] records=new BookIssue[5];
		int i=0;
		int choice=0;
		int allowedDays=7;
		int finePerday=10;
		
		do {
			 System.out.println("\n--- Library Fine System ---");
	            System.out.println("1. Add Book Issue Record");
	            System.out.println("2. Display All Records");
	            System.out.println("3. Show Highest Fine");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();
	            
	            switch(choice) {
	            case 1:
	            	if(i>=5) {
	            		 System.out.println("Record limit reached!");
	                        break;
	            	}
	            	System.out.println("Enter name of student: ");
	            	String name=sc.nextLine();
	            	
	            	 System.out.print("Enter Book Name: ");
	                 String bookName = sc.nextLine();
	                 
	                 System.out.print("Enter Issue Day (number): ");
	                 int issueDate = sc.nextInt();

	                 System.out.print("Enter Return Day (number): ");
	                 int returnDate = sc.nextInt();
	                 
	                 records[i]=new BookIssue(name, bookName, issueDate, returnDate);
	                 records[i].calculateFine(allowedDays, finePerday);
	                 i++;
	                 System.out.println("Record Added Successfully!");
	                 break;
	                 
	            case 2:
	            	for (int j = 0; j < i; j++) {
                            records[j].display();
	            	
	            }
	            	break;
	            case 3:
	            	int maxFine=records[0].fine;
	            	int k=0;
	            	for(int j=1; j<i;j++) {
	            		if(records[j].fine>maxFine) {
	            			maxFine=records[j].fine;
	            			k=j;
	            			
	            		}
	            		
	            	}
	            	 System.out.println("Record with Highest Fine:");
                     records[k].display();
	            
	            	break;
	            
	            
		  		case 4:
	            	System.out.println("exiting");
	            	break;
	            	
	            	default:
	            		System.out.println("invalid");
	            		
		}
	
	}while(choice!=4);
	sc.close();
	}
}
