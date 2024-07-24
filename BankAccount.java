public class BankAccount {
    private String accountNumber;
    private double balance;
    
    

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
//test.java
    public BankAccount(){
        
    }


  // prepare deposit logic in void deposit function
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("deposit:" +amount);
    }
  // prepare withdraw logic in void witdraw function
    public void withdraw(double amount){
        balance=balance-amount;
        System.out.println("withdraw:"+amount);
    }
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements



    public void displayAccountDetails(){
        System.out.println("accountnumber:"+accountNumber);
        System.out.println("current balance:"+balance);
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
        public static void main(String[] args) {
            BankAccount obj=new BankAccount("123456789", 500000);

                // System.out.println("accountnumber:"+obj.getAccountNumber());
                // System.out.println("current balance:"+obj.getBalance());
            obj.deposit(200000);
            obj.withdraw(100000);
            obj.displayAccountDetails();

            // System.out.println("acc.no:" +obj.getAccountNumber()+ " " + "balance:" +obj.getBalance());
            
            obj.setAccountNumber("67456457564");
            obj.setBalance(2000);
            obj.displayAccountDetails();

            
        }
   }
