 class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public BankAccount(){
      
    }
    

    public void deposit(double amount){
      balance=balance+amount;
      System.out.println("deposit"+amount);
  
      
        
    }
    public void witdraw(double amount){
      balance=balance-amount;
      System.out.println("witdraw"+amount);
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
    public void displayAccountDetails(){
      System.out.println("account number"+accountNumber);
      System.out.println("Current balance is"+balance);
    }

  // prepare deposit logic in void deposit function
  // prepare withdraw logic in void witdraw function
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  // prepare getters and setters
   
   public static void main(String args[]){
    BankAccount b=new BankAccount("62333023",70000);
    b.deposit(10000);
    b.witdraw(20000);
    b.displayAccountDetails();
    b.setBalance(80000);
    b.deposit(20000);
    b.witdraw(20000);
    b.displayAccountDetails();


   }
  }
