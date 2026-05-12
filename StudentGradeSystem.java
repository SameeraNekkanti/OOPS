package labEvalTwo;
import java.util.Scanner;
class InvalidGradeException extends Exception{
	public InvalidGradeException(String message) {
		super(message);
	}
	@Override
	public String getMessage() {
		return "Invalid Grade: "+super.getMessage();	}
}
class GradeCalculator{
	public String assignGrade(int marks) throws InvalidGradeException{
		if(marks<0 || marks>100) {
			throw new InvalidGradeException(marks+" out of range");
		}
		if(marks>=90)return "O";
		else if(marks>=75)return "A";
		else if(marks>=60)return "B";
		else return "C";		
	}
}
public class StudentGradeSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GradeCalculator gc=new GradeCalculator();
		
		int[] testmarks=new int[4];
		System.out.println("enter 4 marks: ");
		for(int i=0; i<4; i++) {
			testmarks[i]=sc.nextInt();
		}
		for(int marks: testmarks) {
			try {
				String grade=gc.assignGrade(marks);
				System.out.println("Marks: "+marks+" Grade: "+grade);
			}catch(InvalidGradeException e) {
				System.out.println("Marks: " + marks + " -> " + e.getMessage());
			}finally {
				System.out.println("Grade check complete");
			}
		}
		sc.close();

	}
}
