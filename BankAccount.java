class BankAccount {
    private String accountNumber;
    private double balance;
    private double amount;
    private double withdraw;
      

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(){}
    public void deposit(double amount,double balance){
       balance=balance+amount;
       System.out.println("Amount Deposited: "+balance);
        
    }

    public void withdraw(double withdraw, double balance){
       withdraw=withdraw-balance;
       System.out.println("Balace available: "+balance);
    }
    public void details(){
        System.out.println("AccountNumber is: "+accountNumber);
        System.out.println("Balance is: "+balance);
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
    public void setBalance(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getWithdraw() {
        return withdraw;
    }
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }


    }

  // prepare deposit logic in void deposit function
  // prepare withdraw logic in void witdraw function
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  // prepare getters and setters

