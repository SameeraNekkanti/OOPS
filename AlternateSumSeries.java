package assignment;

public class AlternateSumSeries {

	public static void main(String[] args) {
		int x=3;
		int n=5;
		int sum=0;
		int term=x;
		for(int i=0;i<n;i++){
			if(i%2==0) {
				sum+=term;
				
			}else {
				sum-=term;
			}
			term=term*x*x;
			
		}
		System.out.println("sum is: "+sum);

	}

}
