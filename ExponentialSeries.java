package assignment;

public class ExponentialSeries {

	public static void main(String[] args) {
		int x=2;
		int n=5;
		double sum=1;
		double t=1;
		for(int i=1;i<=n;i++) {
			t=t*x/i;
			sum+=t;
		}
		System.out.print(sum);
		
		

	}

}
