import java.util.Scanner;

public class AtmMenu {

    Scanner scanner = new Scanner(System.in);
    private int balance = 0;
    public int choice = 0;


    public void menu() {
        checkPassword();
        while(choice != 4) {
            System.out.println("(1)Withdraw money\n(2)Deposit money\n(3)Check balance\n(4)Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdrawMoney();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private int depositMoney() {
        System.out.println("Enter the amount of money you want to deposit");
        int money = scanner.nextInt();
        this.balance += money;
        System.out.println(money + "$ were successfully deposited. Current balance: " + this.balance + "$\n\n");
        return this.balance;
    }

    private int withdrawMoney() {
        System.out.println("Enter the amount of money you want to withdraw");
        int money = scanner.nextInt();
        this.balance -= money;
        System.out.println(money + "$ were successfully withdrawn. Current balance: " + this.balance + "$\n\n");
        return this.balance;
    }

    private void checkBalance() {
        System.out.println("Current balance: " + this.balance + "$\n\n");
    }

    private void checkPassword() {
        System.out.println("Enter your password(1234): ");
        int password = scanner.nextInt();
        if (password != 1234) {
            System.out.println("Invalid password");
            System.exit(0);
        }else{
            System.out.println("\nWelcome to this ATM, choose your next action:\n");
        }
    }
}



