package assignment;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the binary number: ");
		int binary=sc.nextInt();
		int decimal=0;
		int base=1;
		while(binary>0) {
			int num=binary%10;
			decimal=decimal+num*base;
			base=base*2;
			binary=binary/10;
		}
		System.out.println(decimal);
		sc.close();
		
	}

}
