package files;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("enter weight in pounds: ");
			double weight=sc.nextDouble();
			if (weight==0) {
				System.out.println("stopped");
				break;
			}
			System.out.println("enter height in inches: ");
			double height=sc.nextDouble();
			double w1=weight*0.45359237;
			double h1=height*0.0254;
			double bmi= w1/(h1*h1);
			if(bmi<18.5) {
				System.out.println("Underweight");
				
			}else if(18.5<=bmi && bmi<25.0) {
				System.out.println("Normal");
			}else if(25.0<=bmi && bmi<30.0) {
				System.out.println("Overweight");
			}else if(30.0<=bmi) {
				System.out.println("Obese");
			}else {
				System.out.println("invalid");
			}

		}
		sc.close();
	}
}

