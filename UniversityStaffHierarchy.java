package labEvalTwo;
abstract class Person{
	String name;
	String id;
	
public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

abstract String getRole();

public void display() {
	System.out.println("Name: "+name);
	System.out.println("ID: "+id);
	System.out.println("Role: "+ getRole());
}
}
class Staff extends Person{
	String dept;

	public Staff(String name, String id, String dept) {
		super(name, id);
		this.dept = dept;
	}
	@Override
	public String getRole() {
		return "Staff";
	}
	public final String getID() {
		return "Staff-"+id;
		
	}
}
class Faculty extends Staff{
	String subject;

	public Faculty(String name, String id, String dept, String subject) {
		super(name, id, dept);
		this.subject = subject;
	}
	@Override
	public String getRole() {
		return "Faculty";
	}
}
interface Evaluator{
	void evaluate(String studentName);
}
class ExamFaculty extends Faculty implements Evaluator{

	public ExamFaculty(String name, String id, String dept, String subject) {
		super(name, id, dept, subject);
	}
	@Override
	public void evaluate(String studentName) {
		System.out.println(name+ " evaluated "+studentName+" in subject "+subject);
	}
}
public class UniversityStaffHierarchy {

	public static void main(String[] args) {
		ExamFaculty ef=new ExamFaculty("Dr. Rao", "F001", "CSE", "DBMS");
		ef.display();
		System.out.println("Staff ID: "+ef.getID());
		ef.evaluate("Samira");
	}

}
