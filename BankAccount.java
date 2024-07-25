public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public BankAccount() {
        System.out.println(accountNumber);
        System.out.println(balance);
    }

  // prepare deposit logic in void deposit function
  // prepare withdraw logic in void witdraw function
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  // prepare getters and setters

    public void deposit(double amount) {
        if (balance > 0) {
            balance =balance + amount;
            System.out.println("Deposited: " + amount);
            System.out.println("balance after deposit: " + balance);
        } else 
        {
            System.out.println("Not deposited");
        }
    }

    public void withdraw(double amount) {
        if (balance >0 ) {
            balance = balance-amount;
            System.out.println("Withdrawl: " + amount);
            System.out.println("balance after withdrawal: " + balance);
        } else 
        {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}