package intermediate.oop.bankaccountmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        boolean operationContinue = false;

        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Choose banking operation: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("What operation you want to do ");

            int selectedOperation = 0;
            try {
                selectedOperation = scn.nextInt();
            } catch (Exception InputMismatchException) {
                System.out.println("Invalid Input! Enter number of the option.");
                scn.next();
                continue;
            }
            switch (selectedOperation) {
                case 1:
                    System.out.println("Enter amount: ");
                    double depositAmount = 0;
                    try {
                        depositAmount = scn.nextInt();
                    } catch (Exception InputMismatchException) {
                        System.out.println("Invalid Input! Enter amount you want to deposit.");
                        scn.next();
                        continue;
                    }
                    bankAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter amount: ");
                    double withdrawAmount = 0;
                    try {
                        withdrawAmount = scn.nextInt();
                    } catch (Exception InputMismatchException) {
                        System.out.println("Invalid Input! Enter amount you want to withdraw.");
                        scn.next();
                        continue;
                    }
                    bankAccount.withdraw(withdrawAmount);
                    break;

                case 3:
                    bankAccount.displayBalance();
                    break;
            }
            System.out.println("Want to perform more operation? (Y/N)");
            String newOp = scn.next();
            if (newOp.equalsIgnoreCase("Y")) {
                operationContinue = true;
            }
        }
        while (operationContinue);
    }
}
