package files;

import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "", maxFineStudent = "";
        int issuedate = 0, returndate = 0, latedays;
        int fineperday = 5;
        int fine = 0, maxfine = 0;
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Enter Student Record");
            System.out.println("2. Show Last Student Record");
            System.out.println("3. Show Highest Fine");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                name = sc.next();

                System.out.print("Enter issue day: ");
                issuedate = sc.nextInt();

                System.out.print("Enter return day: ");
                returndate = sc.nextInt();

                latedays = returndate - issuedate;

                if (latedays > 0) {
                    fine = latedays * fineperday;
                } else {
                    fine = 0;
                }

                System.out.println("Fine for " + name + " = " + fine);

                // ✅ Correct place to check highest fine
                if (fine > maxfine) {
                    maxfine = fine;
                    maxFineStudent = name;
                }
            }

            else if (choice == 2) {
                System.out.println("Last Student: " + name);
                System.out.println("Fine: " + fine);
            }

            else if (choice == 3) {
                if (maxfine > 0) {
                    System.out.println("Student with highest fine: " + maxFineStudent);
                    System.out.println("Highest fine: " + maxfine);
                } else {
                    System.out.println("No records yet.");
                }
            }

            else if (choice == 4) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}