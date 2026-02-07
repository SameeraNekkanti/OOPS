package assignment;
import java.util.Scanner;
public class StringLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string");
		String str=sc.nextLine();
		int length=0;
		for(char c:str.toCharArray()) {
			length++;
		}
		System.out.print("the length of the string is: "+length);
		sc.close();
	}

}
