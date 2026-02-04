package hello_world;
import java.util.Scanner;
public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the total number of elements: ");
		int n=sc.nextInt();
		int sum=n*(n+1)/2;
		System.out.println("enter "+(n-1)+"number");
		int givensum=0;
		for(int i=0;i<n-1;i++) {
			givensum+=sc.nextInt();
		}
		// TODO Auto-generated method stub
		int missingNumber = sum - givensum;
        System.out.println("The missing number is: " + missingNumber);
        
        sc.close();

	}

}
