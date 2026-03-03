package hello_world;
import java.util.Scanner;
public class LowMemorySatellite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the decimal: ");
		int decimal=sc.nextInt();
		int binary=0;
		int base=1;
		while(decimal>0) {
			int remainder=decimal%2;
			binary=binary+remainder*base;
			base=base*10;
			decimal=decimal/2;
		}
		System.out.println(binary);
		 sc.close();

	}

}
