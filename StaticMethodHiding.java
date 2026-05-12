class Parent{
	static void display() {
		System.out.println("Parent static");
	}
}
class Child extends Parent{
	static void display() {
		System.out.println("Child static");
	}
}
public class StaticMethodHiding {

	public static void main(String[] args) {
		Parent p = new Child();
		 p.display();

	}

}
//remove static if you dont want methods to be hidden. Static is not overriden.
//methods are overriden, variables are shadowed.
