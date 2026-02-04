package assignment;
import java.util.Scanner;
public class SumandAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sum=0;
		double n;
		System.out.println("enter 10 numbers:");
		for(int i=1;i<=10;i++) {
			n=sc.nextDouble();
			sum+=n;
		}
		double avg=sum/10;
		System.out.println("sum: "+sum);
		System.out.println("average: "+avg);
		sc.close();
	}

}
