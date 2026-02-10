package assignment;

public class AlphabetPyramid {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			char c='A';
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			c-=2;
			for(int k=1;k<i;k++){
			System.out.print(c);
			c--;
			
		}
			System.out.println();
		}

	}

}
