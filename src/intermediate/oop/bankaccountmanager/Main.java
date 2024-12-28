package intermediate.oop.bankaccountmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean operationContinue = false;

        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Choose banking operation: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("Enter the Number of operation you want to do.");

            int selectedOperation = scn.nextInt();

            switch (selectedOperation) {
                case 1:
                    BankAccount bankDeposit = new BankAccount();
                    System.out.println("Enter amount: ");
                    double depositAmount = scn.nextInt();
                    bankDeposit.deposit(depositAmount);
                    break;

                case 2:
                    BankAccount bankWithdraw = new BankAccount();
                    System.out.println("Enter amount: ");
                    double withdrawAmount = scn.nextInt();
                    bankWithdraw.withdraw(withdrawAmount);
                    break;

                case 3:
                    BankAccount bankBalance = new BankAccount();
                    bankBalance.displayBalance();
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

