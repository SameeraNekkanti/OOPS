package assignment;
import java.util.Scanner;
public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of rows:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((i+j)%2);
			}
			System.out.println();
			sc.close();
			}
		

	}

}
