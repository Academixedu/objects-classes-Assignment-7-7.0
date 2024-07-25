class BankAccount {
    private String accountNumber;
    private double balance;
    public void deposit(double amount){
      balance=balance+amount;
       System.out.println("deposit"+amount);
    } 
    public void withdraw( double amount){
     balance=balance-amount;
     System.out.println("withdrawn amount"+amount);
    }
    public void displayAccountdetails(){
        System.out.println("current balance"+balance);
        System.out.println("account number :"+accountNumber);
    }
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public BankAccount(){
        
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
    public static void main(String args[]){
        BankAccount sc=new BankAccount("325463410001290", 20000);
      //  sc.displayAccountdetails();
        sc.deposit(10000);
        sc.withdraw(5000);
        sc.displayAccountdetails();
        sc.setAccountNumber("238624862864");
        sc.setBalance(50000);
        System.out.println("account details"+sc.getAccountNumber());
        System.out.println("deposit"+sc.getBalance());
    }

  // prepare deposit logic in void deposit function
  // prepare withdraw logic in void witdraw function
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  // prepare getters and setters
   }
