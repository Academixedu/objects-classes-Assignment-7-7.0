class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    

    public BankAccount() {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double amount)
    {
        if(balance >=0)
        {
            balance = balance + amount;
            System.out.println("total balance is "+balance);
        }
        else
        {
            System.out.println("not deposited");
        }
    }
    public void withdraw(double amount)
    {
        if( balance > amount)
        {
            balance = balance - amount;
            System.out.println("Amount is withdraw successfully"+balance);
        }
        else
        {
            System.out.println("Amount is not sufficient to withdraw");
        }
    }
    public void details()
    {
        System.out.println("account number is "+accountNumber);
        System.out.println("Balance is "+balance);
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


  // prepare deposit logic in void deposit function
  // prepare withdraw logic in void witdraw function
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  // prepare getters and setters
   }
