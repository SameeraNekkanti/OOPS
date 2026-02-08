package assignment;
import java.util.Scanner;
public class OctalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the octal number: ");
		int octal=sc.nextInt();
		int place=1;
		int decimal=0;
		while(octal>0) {
			int digit=octal%10;
			decimal=decimal+digit*place;
			place=place*8;
			octal=octal/10;
			
			
		}
		int binary=0;
		int base=1;
		while(decimal>0) {
			int rem=decimal%2;
			binary=binary+rem*base;
			base=base*10;
			decimal=decimal/2;
			
		}
		System.out.println(binary);
		sc.close();
	}

}
