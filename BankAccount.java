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

  // prepare deposit logic in void deposit function
  // prepare withdraw logic in void witdraw function
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  // prepare getters and setters
      public void deposite(int amount){
        if(balance>=0){
            balance=balance+amount;
            System.out.println(amount+"deposite.current balance"+balance);
        }
        else{

        
        System.out.println("not deposite");
        }
      }  
      public void witdraw(int amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println(amount+"witdraw.current balance"+balance);
        }
        else{
            System.out.println("insufficiant balance");
        }
    }
        public void displayAccountDetails()
        {
                System.out.println(accountNumber);
                System.out.println(balance);
        }
    
    }
    
   
