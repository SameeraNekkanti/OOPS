package assignment;
import java.util.Scanner;
public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int total=0;
        int x=n;
        int digits=String.valueOf(n).length();
        while(x>0) {
        	int digit=x%10;
        	int power=1;
        	for(int i=1;i<=digits;i++) {
        		power=power*digit;
        	}
        	total=total+power;
        	x=x/10;
        	
        }
        if(total==n) {
        	System.out.println("its an armstrong number");
        }else {
        	System.out.println("its not an armstrong number");
        }
        sc.close();
        
	

	}

}
