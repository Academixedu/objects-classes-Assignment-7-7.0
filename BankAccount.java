class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public BankAccount() 
    {

    }


  // prepare deposit logic in void deposit function
  public void deposit(int amount)
  {
     balance+=amount;
    System.out.println("Successfully Deposited = "+balance);
  }
  // prepare withdraw logic in void witdraw function
  public void withdraw(int amount)
  {
    if(balance<=0)
    {
        balance-=amount;
        System.out.println("Successfull withdraw "+balance);
    }
    else if(balance<amount)
    {
        System.out.println("Insufficient Balnce");
    }
    else 
    {
        System.out.println("zero Balance");
    }
  }
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  public void displayAccountDetails()
  {
    System.out.println("Account Number = "+accountNumber);
    System.out.println("Current Balance = "+balance);
  }
  // prepare getters and setters
  

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
