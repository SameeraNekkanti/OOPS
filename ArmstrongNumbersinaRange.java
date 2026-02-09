package assignment;
import java.util.Scanner;
public class ArmstrongNumbersinaRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++) {
        	int x=i;
        	int total=0;
        	int digits=String.valueOf(i).length();
        	while(x>0) {
        		int digit=x%10;
        		int power=1;
        		for(int j=1;j<=digits;j++) {
        			power=power*digit;
        			
        		}
        		total=total+power;
        		x=x/10;
        	}
        	if(total==i) {
				System.out.println(i+" ");
        }
        }

        sc.close();
		

	}

}
