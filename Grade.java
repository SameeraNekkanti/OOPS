package assignment;
import java.util.Scanner;
public class Grade {
	public static char calculateGrade(int m1, int m2, int m3) {
        int avg = (m1 + m2 + m3) / 3;

        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else {
            return 'D';
        }
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();

    char grade=calculateGrade(m1, m2, m3);
    System.out.print(grade);

    sc.close();
}

}
