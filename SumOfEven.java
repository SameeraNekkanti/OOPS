package assignment;
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the 'n' value:");
		int n=sc.nextInt();
		int sum=0;
		int even=2;
		for(int i=2;i<=n+1;i++) {
			System.out.println(even);
			
			sum+=even;
			even+=2;
			
		}
		System.out.print("sum is: "+sum);
		

	}

}
