package assignment;
import java.util.Scanner;
public class SumOfNTerms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			System.out.println(i+" ");
			sum+=i;
		}
		System.out.println("The sum of natural number upto " + n + " terms is: " + sum);
		sc.close();
	}

}
