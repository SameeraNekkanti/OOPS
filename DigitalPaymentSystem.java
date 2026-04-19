import java.util.Scanner;

interface PaymentMethod {
    boolean processPayment(double amount);
    void refund(double amount);
    String getMethodName();
}

class CreditCard implements PaymentMethod {
    private String cardNumber;
    private double creditLimit;

    public CreditCard(String cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
    }

    private boolean validateCard() {
        return cardNumber.length() == 8;
    }

    public boolean processPayment(double amount) {
        if (!validateCard()) {
            System.out.println("Invalid card number!");
            return false;
        }
        if (amount > creditLimit) {
            System.out.println("Credit limit exceeded!");
            return false;
        }
        creditLimit -= amount;
        System.out.println("Paid using Credit Card");
        return true;
    }

    public void refund(double amount) {
        creditLimit += amount;
        System.out.println("Refunded to Credit Card");
    }

    public String getMethodName() {
        return "Credit Card";
    }
}

class DigitalWallet implements PaymentMethod {
    private double balance;
    private boolean authenticated;

    public DigitalWallet(double balance) {
        this.balance = balance;
        this.authenticated = true;
    }

    public boolean processPayment(double amount) {
        if (!authenticated) {
            System.out.println("Authentication failed!");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient wallet balance!");
            return false;
        }
        balance -= amount;
        System.out.println("Paid using Wallet");
        return true;
    }

    public void refund(double amount) {
        balance += amount;
        System.out.println("Refunded to Wallet");
    }

    public String getMethodName() {
        return "Digital Wallet";
    }
}

class BankTransfer implements PaymentMethod {
    private String accountNumber;
    private double balance;

    public BankTransfer(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private boolean verifyAccount() {
        return accountNumber.length() >=5;
    }

    public boolean processPayment(double amount) {
        if (!verifyAccount()) {
            System.out.println("Invalid account!");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient bank balance!");
            return false;
        }
        balance -= amount;
        System.out.println("Paid using Bank Transfer");
        return true;
    }

    public void refund(double amount) {
        balance += amount;
        System.out.println("Refunded to Bank");
    }

    public String getMethodName() {
        return "Bank Transfer";
    }
}

public class DigitalPaymentSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter card number: ");
        String card = sc.nextLine();
        System.out.print("Enter credit limit: ");
        double limit = sc.nextDouble();

        System.out.print("Enter wallet balance: ");
        double walletBal = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter bank account number: ");
        String acc = sc.nextLine();
        System.out.print("Enter bank balance: ");
        double bankBal = sc.nextDouble();

        PaymentMethod[] methods = new PaymentMethod[3];
        methods[0] = new CreditCard(card, limit);
        methods[1] = new DigitalWallet(walletBal);
        methods[2] = new BankTransfer(acc, bankBal);

        while (true) {
            System.out.println("\nChoose Payment Method:");
            System.out.println("1. Credit Card");
            System.out.println("2. Digital Wallet");
            System.out.println("3. Bank Transfer");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 4) break;

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if (choice >= 1 && choice <= 3) {
                PaymentMethod method = methods[choice - 1];

                if (method.processPayment(amount)) {
                    System.out.println("Transaction Successful!");

                    System.out.print("Do you want refund? (yes/no): ");
                    sc.nextLine();
                    String ans = sc.nextLine();

                    if (ans=="yes"){
                        method.refund(amount);
                    }
                } else {
                    System.out.println("Transaction Failed!");
                }
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}