package files;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int lottery=(int)(Math.random()*100);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess=sc.nextInt();
		
		System.out.println(guess);
		int lotteryDigit1=lottery/10;
		int lotteryDigit2=lottery%10;
		
		 int guessDigit1 = guess / 10;
	     int guessDigit2 = guess % 10;
	     
	     System.out.println("Lottery number is: " + lottery);
	     
	     if(guess==lottery) {
	    	 System.out.println("Exact match! reward: $10,000");
	    	 
	     }else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1){
	    	 System.out.println("Match all digits! You win $3,000");
	 
	     }else if(guessDigit1 == lotteryDigit2 ||
                 guessDigit2 == lotteryDigit1 ||
                 guessDigit2 == lotteryDigit2||
                 guessDigit1 == lotteryDigit1) {
	    	 System.out.println("Match one digit! You win $1,000");
	    	 
	     }else {
	    	 System.out.println("Sorry, no match! ");
	     }
	     sc.close();
	}


}
