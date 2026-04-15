package files;
import java.util.Scanner;
public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int a=year%12;
		if(a==0) {
			System.out.println("u r a monkey");
		}
		else if(a==1) {
			System.out.println("u r a rooster");
		}
		else if(a==2) {
			System.out.println("u r a dog");
		}
		else if(a==3) {
			System.out.println("u r a pig");
		}
		else if(a==4) {
			System.out.println("u r a rat");
		}
		else if(a==5) {
			System.out.println("u r an ox");
		}
		else if(a==6) {
			System.out.println("u r a tiger");
		}else if(a==7) {
			System.out.println("u r a rabbit");
		}else if(a==8) {
			System.out.println("u r a dragon");
		}else if(a==9) {
			System.out.println("u r a snake");
		}
		else if(a==10) {
			System.out.println("u r a horse");
		}else if(a==11) {
			System.out.println("u r a sheep");
		}
		sc.close();


	}

}
