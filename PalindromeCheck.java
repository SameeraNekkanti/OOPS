package assignment;
import java.util.Scanner;
public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number: ");
		int n=sc.nextInt();
		int og=n;
		int rev=0;
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if (rev==og) {
			System.out.println(og+" is a palindrome");
		}else {
			System.out.println(og+" is not a palindrome");
		}
		sc.close();

	}

}
