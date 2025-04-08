package assignments;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1000);

        while (true) {

            System.out.println("Welcome to ATM Machine");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit Money ");
            System.out.println("3. Withdraw Money ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter Withdrawal Amount: ");
                    double withdraw = sc.nextDouble();
                    atm.withdraw(withdraw);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Machine!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Please enter the correct option");
            }


        }

    }
}
