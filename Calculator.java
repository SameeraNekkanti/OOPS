import java.util.Scanner;

interface BasicMath{
	int add(int a, int b);
	int subtract(int a , int b);
	int multiply(int a, int b);
	double divide(int a , int b);
}

interface AdvancedMath{
	double power(double base, double exponent);
	double squareRoot(double num);
}

interface ScientificCalculator extends BasicMath, AdvancedMath{
	double pi=3.14159;
	
	double calculateCircleArea(double radius);
}

class MainCalculator implements ScientificCalculator{
	public int add(int a, int b) {
		return a+b;
		
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
	    return a * b;
	}
	public double divide(int a, int b) {
		return (double) a/b;
		
		
	}
	public double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	public double squareRoot(double num) {
		return Math.sqrt(num);
	}
	public double calculateCircleArea(double radius) {
		return pi*radius*radius;
	}
	

}
public class Calculator {

	public static void main(String[] args) {
		MainCalculator calc=new MainCalculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a: ");
		int a=sc.nextInt();
		
		System.out.println("enter b: ");
		int b=sc.nextInt();
		
		// Performing basic operations
	    System.out.println("Addition: " + calc.add(a,b));
	    System.out.println("Subtraction: " + calc.subtract(a,b));
	    System.out.println("Multiplication: " + calc.multiply(a,b));
	    System.out.println("Division: " + calc.divide(a,b));

	    // Performing advanced operations
	    System.out.println("Power (2^3): " + calc.power(2, 3));
	    System.out.println("Square Root (25): " + calc.squareRoot(25));

	    // Using constant value PI
	    System.out.println("Circle Area (radius 5): " + calc.calculateCircleArea(5));

	

	}

}
