package assignment;
import java.util.Scanner;
public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter decimal number: ");
	        int decimal = sc.nextInt();
	        String hex=""; 
	        while (decimal>0) {
	            int rem=decimal%16;
	            if(rem<10){
	                hex=rem+hex;
	            }
	            else{
	                hex=(char)(rem+55)+hex;
	            }
	            decimal=decimal/16;
	            
	}
	        System.out.println(hex);
	        sc.close();

}
}
