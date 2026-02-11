package assignment;
import java.util.Scanner;
public class CosineSeriesSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter x: ");
		double x=sc.nextDouble();
		System.out.print("enter the no. of terms: ");
		int terms=sc.nextInt();
		double sum=1.0;
		for(int i=1;i<=terms;i++) {
			int power=2*i;
			double fact=1.0;
			for(int j=1;j<=power;j++) {
				fact=fact*j;
			}
			double term=Math.pow(x,power);
			if(i%2!=0) {
				sum=sum-term;
				
			}else {
				sum+=term;
			}
			System.out.println("Cosine series sum="+sum);
			sc.close();
		}

	}

}
