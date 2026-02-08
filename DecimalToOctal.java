package assignment;
import java.util.Scanner;
public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the decimal: ");
		int decimal=sc.nextInt();
		int octal=0;
		int place=1;
		while(decimal>0) {
			int rem=decimal%8;
			octal=octal+rem*place;
			place=place*10;
			decimal=decimal/8;
		}
		System.out.println(octal);
		sc.close();
	}

}
