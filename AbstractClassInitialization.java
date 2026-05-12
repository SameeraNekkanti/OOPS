abstract class Shape{
	Shape(){
		System.out.println("shape created!");
	}
}
class Circle extends Shape{
	Circle(){
		System.out.println("circle created!");
	}
}
public class AbstractClassInitialization {

	public static void main(String[] args) {
		new Circle();

	}

}
//Abstract constructors are called via super().
// Static runs once; instance runs per object.