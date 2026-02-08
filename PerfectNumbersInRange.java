package assignment;
import java.util.Scanner;
public class PerfectNumbersInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range: ");
		int n=sc.nextInt();
		
		for(int x=1; x<=n;x++) {
			int sum=0;
			for(int i=1;i<=x/2;i++) {
				if(x%i==0) {
				sum+=i;
				}
			}
			if(sum==x) {
				System.out.print(x+" ");
			}
		}

        sc.close();
	}

}
