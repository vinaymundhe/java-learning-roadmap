package intermediate.oop.bankaccountmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose banking operation: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("Enter the Number of operation you want to do.");

        int selectdOperation = scn.nextInt();

        switch (selectdOperation){
            case 1 :
                BankAccount bankDeposit = new BankAccount();
                System.out.println("Enter amount: ");
                double depositAmount = scn.nextInt();
                bankDeposit.deposit(depositAmount);

            case 2 :
                BankAccount bankWithdraw = new BankAccount();
                System.out.println("Enter amount: ");
                double withdrawAmount = scn.nextInt();
                bankWithdraw.withdraw(withdrawAmount);

            case 3 :
                BankAccount bankBalance = new BankAccount();
                bankBalance.displayBalance();
        }
    }
}

