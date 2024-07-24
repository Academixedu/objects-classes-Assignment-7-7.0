class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
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
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Deposit: $" + balance);
        } else {
            System.out.println("Deposit ");
        }
    }
    public void withdraw(double money) {
        if (money > 0 && money <= balance) {
            balance -= money;
            System.out.println("Withdrawal : $" + balance);
        } else if (money > balance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
}}

  // prepare deposit logic in void deposit function
  // prepare withdraw logic in void witdraw function
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  // prepare getters and setters
  
  