package files;
import java.util.Scanner;

class Fee{
    String name;
    int age;
    int partyCount;
    double fee;

    Fee(String name,int age,int partyCount){
        this.name=name;
        this.age=age;
        this.partyCount=partyCount;
        calculateFee();
    }

    void calculateFee() {
        fee=1000;
        boolean discount=false;

        if(age<12) {
            System.out.println("Junior Discount Applied (50%) -> " + (fee * 0.5));
            fee *= 0.5;
            discount=true;
        } else if(age>60){
            System.out.println("Senior Discount Applied (20%) -> " + (fee * 0.8));
            fee *= 0.8;
            discount=true;
        }

        if (partyCount == 6) {
            System.out.println("Full Team Bonus Applied (-100) -> " + (fee - 100));
            fee -= 100;
            discount=true;
        }

        if (!discount) {
            System.out.println("No discounts applicable.");
        }

        System.out.println("Total: " + fee + " PokéDollars\n");
    }
}

public class AutomatedRegistrationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many trainers are registering? ");
        int n = sc.nextInt();
        sc.nextLine();
        Fee[] trainers = new Fee[n];

        // Registration loop
        for(int i=0;i<n;i++) {
            System.out.println("Trainer " + (i + 1) + " registration:");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Party Count: ");
            int partyCount = sc.nextInt();
            sc.nextLine();

            trainers[i] = new Fee(name, age, partyCount);
        }

        
        Fee min = trainers[0];
        Fee max = trainers[0];

        for(int j=1;j<n;j++) {
            if(trainers[j].fee < min.fee) min = trainers[j];
            if(trainers[j].fee > max.fee) max = trainers[j];
        }

        System.out.println("Trainer who pays minimum fee: " + min.name + " -> " + min.fee + " PokéDollars");
        System.out.println("Trainer who pays maximum fee: " + max.name + " -> " + max.fee + " PokéDollars");

        sc.close();
    }
}
