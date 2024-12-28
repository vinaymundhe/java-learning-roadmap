package intermediate.oop.bankaccountmanager;

/*Bank Account Manager program:

The program should allow users to:
- Create a new bank account.
- Check their balance.
- Deposit money.
- Withdraw money (with balance checks to prevent overdrafts).
*/
public class BankAccount {

    int accountNumber;
    String customerName;
    double balance;

    public BankAccount(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: "+amount);
            System.out.println("Updated Balance: "+getBalance());
        } else {
            System.out.println("Amount entered not valid!");
        }
    }

    public void withdraw (double amount){
        if (amount > 0 && amount < balance){
            balance -= amount;
            System.out.println("Withdrawn: "+amount);
            System.out.println("Updated Balance: "+getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance(){
        System.out.println("Balance: "+balance);
    }
}

