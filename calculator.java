package hello_world;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first number: ");
		 double num1=sc.nextDouble();
		 System.out.println("enter second number: ");
		 double num2=sc.nextDouble();
		 System.out.println("Choose operation: +,-,*,/ :");
		 char op=sc.next().charAt(0);
		 
		 switch(op){
			 case '+':
				 System.out.println("Result: " + (num1 + num2));
				 break;
			 case '-':
				 System.out.println("Result: " + (num1 - num2));
				 break;
			 case '*':
	                System.out.println("Result: " + (num1 * num2));
	                break;
	            case '/':
	            	if (num2!=0) {
	            		System.out.println("result"+num1/num2);
	            	}else {
	                    System.out.println("Division by zero error");
	                }
	                break;
	            default:
	                	System.out.println("invalid operation");
	                	sc.close();
		 
			
		 }
		 
	}

}
