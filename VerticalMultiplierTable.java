package assignment;
import java.util.Scanner;
public class VerticalMultiplierTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the limit: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print(i+"x"+j+"="+i*j+"\t");		
		}
		System.out.println();
		

	}
	sc.close();
}

}
