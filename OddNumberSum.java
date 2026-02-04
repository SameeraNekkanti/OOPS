package assignment;
import java.util.Scanner;
public class OddNumberSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of odd numbers: ");
		int n=sc.nextInt();
		int sum=0;
		int odd=1;
		for(int i=1;i<=n;i++) {
			System.out.println(odd);
			sum+=odd;
			odd += 2;
		}
		System.out.print("sum is: "+sum);

	}

}
