package assignment;
import java.util.Scanner;
public class NDigitArmstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of digits: ");
		int n=sc.nextInt();
		int num=9;
		int x=num;
		int sum=0;
		while(x>0) {
			int digit=x%10;
			int power=1;
			
			
			for(int i=1;i<=n;i++) {
				power*=digit;
				
				
			}
			sum+=power;
			x/=10;
		}
		if(sum==num) {
        	System.out.println("its an armstrong number");
        }else {
        	System.out.println("its not an armstrong number");
        }
        sc.close();
        
	

	}

}
