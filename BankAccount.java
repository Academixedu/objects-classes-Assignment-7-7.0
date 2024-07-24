class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    //Parameter less constructor
    public BankAccount(){

    }
    // prepare deposit logic in void deposit function
    public void deposit(double amount){
    
        balance=balance+amount;
        System.out.println("deposit : "+amount);
    }
     // prepare withdraw logic in void witdraw function
    public void withdrawl(double amount){
        balance=balance-amount;
        System.out.println("withdrawl : "+amount);
    
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
 // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
public void displayAccountDetails(){
    System.out.println("account number : "+accountNumber);
    System.out.println("balance is :"+balance);
}
public static void main(String args[]){
    BankAccount obj=new BankAccount("19A31A04D4", 50000);
    // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
    
    obj.deposit(10000);
    obj.withdrawl(20000);
    obj.displayAccountDetails();
    obj.setBalance(100000);
    obj.deposit(20000);
    obj.withdrawl(25000);
    obj.displayAccountDetails();

    


}
   }
