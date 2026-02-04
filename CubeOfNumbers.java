package assignment;
import java.util.Scanner;
public class CubeOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();
		double cube=Math.pow(n,3);
		System.out.println("number is: "+n+" and cube of "+n+" is: "+cube);
		sc.close();

	}

}
