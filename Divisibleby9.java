package assignment;

public class Divisibleby9 {

	public static void main(String[] args) {
		System.out.println("the numbers divisible by 9:");
		int sum=0;
		for(int i=100;i<=200;i++) {
			if(i%9==0) {
				System.out.println(i);
				sum=sum+i;
			}
			
		}
		System.out.print("The sum is: "+sum);

	}

}
