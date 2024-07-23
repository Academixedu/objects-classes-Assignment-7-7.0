class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
public BankAccount(){

}


  // prepare deposit logic in void deposit function
  public void deposit(int amount){
    balance+=amount;
    System.out.println("Your amount is successfully deposited and your Balance is :"+balance);
  }

  // prepare withdraw logic in void witdraw function
  public void witdraw(int amount){
    
    if(balance>=amount){
        balance=balance-amount;
        System.out.println("Your amount is successfully witdraw and your Balance is :"+balance);
    }else{
        System.out.println("insufficient Balance");
  }
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
// prepare displayAccountDetails logic and ensure that it should contain
  public void AccountDetails(){
    System.out.println("Your accountNumber is: "+accountNumber);
    System.out.println("The avalable Balance is:"+balance);
  }
  // current Balance and accountNumber in print statements
  // prepare getters and setters
   }
