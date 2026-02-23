package hello_world;
class Book{
	String title;
	
	Book(String title){
		this.title=title;
	}
}
public class NullPointerTrap {
	public static void main(String[]args) {
		Book[]library=new Book[3];
		library[0]=new Book("Java Fundamentals");
		library[1]=new Book("Clean Code");
		
		for(int i=0;i<library.length;i++) {
			if(library[i]!=null) {
				System.out.println("Book "+i+": "+library[i].title);
			}else {
				System.out.println("Book "+i+": [Empty Slot]");
			}
		}
	}

}
