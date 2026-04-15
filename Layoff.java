package files;

import java.util.Scanner;

class Employee{
    String name;
    int[] scores;
    double average;
    char grade;

    Employee(String name, int[] scores){
        this.name = name;
        this.scores = scores;
        calculateAverageAndGrade();
    }

    public void calculateAverageAndGrade() {
        int sum = 0;
        for(int i : scores) sum += i;
        average = sum / 4.0; 
        if (average >= 85) grade = 'A';
        else if (average >= 70) grade = 'B';
        else grade = 'C';
    }

    public void display() {
        System.out.print("Name: " + name + ", Scores: ");
        for (int score : scores) System.out.print(score + " ");
        System.out.println(", Average: " + average + ", Grade: " + grade);
    }
}

public class Layoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[2];
        int count = 0;

        while (true) {
            System.out.println("\n--- Employee Performance Menu ---");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Display Top Performer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (count >= 2) {
                        System.out.println("Maximum 2 employees reached!");
                        break;
                    }

                    System.out.print("Enter employee name: ");
                    String name = sc.nextLine();

                    int[] scores = new int[4];
                    System.out.println("Enter 4 quarterly scores: ");
                    for (int i = 0; i < 4; i++) {
                        scores[i] = sc.nextInt();
                    }
                    sc.nextLine(); // consume newline

                    employees[count++] = new Employee(name, scores);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee data entered!");
                        break;
                    }

                    // Identify top performer
                    Employee top = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i].average > top.average) {
                            top = employees[i];
                        }
                    }

                    System.out.println("\n--- Top Performer ---");
                    top.display();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
