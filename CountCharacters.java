package assignment;
import java.util.Scanner;
public class CountCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the word: ");
		
		int count=0;
		while(sc.hasNext()) {
			String stri=sc.nextLine();
			
			count+=stri.length();
		}
		System.out.print(count);
       sc.close();

	}

}
