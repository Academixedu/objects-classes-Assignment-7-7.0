class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(int amount)
    {
        if(balance>=amount)
        {
            balance=balance+amount;
            System.out.println(amount + " deposited Current balance is: " + balance);
        }
        else{
            System.out.println("Invalid Deposit");
        }

    }
    public void withdraw(int amount){
        if(balance>=amount)
        {
            balance=balance-amount;     
            System.out.println(amount + " withdraw Current balance is: " + balance);
        }
        else
        {
            System.out.println("Insufficient Balance:");
        }
    }
    public void displayAccountDetails()
    {
        System.out.println("Acount Number:"+accountNumber);
        System.out.println("Current Balance: " + balance);
    }
  
  // prepare getters and setters
  public String getAccountNumber()
  {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) 
  {
    this.accountNumber = accountNumber;
  }
  public double getBalance() 
  {
    return balance;
  }
  public void setBalance(double balance) 
  {
    this.balance = balance;
  }
}
