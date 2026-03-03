package hello_world;
import java.util.Scanner;
public class PerfectCitizens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("--- Welcome to the Euclidean Vault ---");
        System.out.print("Enter your numeric key to test for perfection: ");

        int n = sc.nextInt();
        int sum=0;
        //calculate sum of proper divisors
        for(int i=1;i<=n/2;i++) {
        	if(n%i==0) {
        		sum+=i;
        	}
        }
        System.out.println("Analyzing citizen " + n + "...");
        if(sum==n && n!=0) {
        	System.out.println("ACCESS GRANTED: The number is Perfect.");
        } else {
            System.out.println("ACCESS DENIED: This number lacks balance.");
        
        }
        sc.close();
        

	}

}
