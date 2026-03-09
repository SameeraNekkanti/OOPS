package files;
class Studentf{
	private String name;
	private int marks;
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
		
	}
	public void setMarks(int m) {
		if(m>=0 && m<=100) {
			marks=m;
			
		}else {
			System.out.println("invalid");	
			}
	}
public int getMarks() {
	return marks; 
}
}
public class Studentx {

	public static void main(String[] args) {
		Studentf s=new Studentf();
		s.setName("maria");
		s.setMarks(89);
		System.out.println(s.getName());
		System.out.println(s.getMarks());
		
		s.setMarks(780);
		

	}

}
