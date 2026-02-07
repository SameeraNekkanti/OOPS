package hello_world;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number: ");
		int n=sc.nextInt();
		int rev=0;
		while(n!=0) {
			int lastd=n%10;
			rev=rev*10+lastd;
			n=n/10; //removing last digit
		}
		System.out.println(rev);
        sc.close();
	}

}
