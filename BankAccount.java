class BankAccount
 {
    private String accountNumber;
    private double balance;

    
    public BankAccount(String accountNumber, double initialBalance)
     {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public BankAccount()
    {

    }

    
  // prepare deposit logic in void deposit function
    void deposit (int amount)
    { 
        balance+=amount;
        System.out.println("Your money has successfully deposited and your balance is : "+balance);
    }

  // prepare withdraw logic in void witdraw function
   void withdraw(int amount)
   {
        if (balance>=amount)
        {
            balance=balance-amount;
            System.out.println("You amount has been successfully withdrawl and balance remain is : "+balance);
            
        }       
        else
        { 
            System.out.println("Your bank account has insufficient balance"); 
        }

   }

  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  void displayAccountDetails()
  {
    System.out.println("your account number: "+accountNumber);
    System.out.println("your current balance : "+balance);
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

 

