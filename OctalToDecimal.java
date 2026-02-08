package assignment;
import java.util.Scanner;
public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the octal number: ");
		int octal=sc.nextInt();
		int decimal=0;
		int place=1;
		while(octal>0) {
			int num=octal%10;
			decimal=decimal+num*place;
			place=place*8;
			octal=octal/10;
			
		}
        System.out.println(decimal);
        sc.close();

	}

}
