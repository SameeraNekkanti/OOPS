package assignment;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("enter a number: ");
		 int n=sc.nextInt();
		 for(int i=n;i<=n;i++) {
			 for(int j=1;j<=10;j++) {
				 System.out.println(i+"x"+j+"="+(i*j));
			 }
		 }

	}

}
