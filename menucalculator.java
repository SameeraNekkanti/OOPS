package hello_world;

import java.util.Scanner;

public class menucalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		double num1;
		double num2;
		System.out.print("welcome to my youtube channel!!!!");
		do {
			System.out.println("\nSelect an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            if (choice>=1 && choice<=4) {
            	System.out.print("enter first no.: ");
            	num1=sc.nextDouble();
            	System.out.print("enter second no.: ");
            	num2=sc.nextDouble();
            	
            	switch(choice) {
            	case 1:
            		System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                	System.out.println("Result: " + multiply(num1, num2));
                	
                case 4:
                	System.out.println("Result: " + divide(num1, num2));
                    break;
            	
                default:
                	System.out.println("Invalid choice! Please try again.");
            	}
            }
            	
            }while(choice!=5);
            System.out.println("Exiting... Goodbye!");
            sc.close(); 
		
            
		}
		public static double add(double a,double b) {
			return a+b;
			
		}
		public static double subtract(double a,double b) {
			return a-b;
			
		}
		public static double multiply(double a, double b) {
	        return a * b;
	    }
		public static double divide(double a, double b) {
	        if (b == 0) {
	            System.out.println("Error: Cannot divide by zero.");
	            return 0;
	        } else {
	            return a/b;
	        
		
	


	}

		}
}
