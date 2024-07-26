class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public BankAccount(){
        System.out.println(accountNumber);
        System.out.println(balance);
    }
public void deposite(double amount){
    if(amount > 0){
        balance=balance+amount;
        System.out.println("Deposite successful.New balance:$"+ balance);
    }
    else{
        System.out.println("Deposit amount must be positive:");
    }

    }
    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance){
            balance=balance-amount;
            System.out.println("Withdrawal successful.New balance:$"+balance);
        }
        else if(amount > balance){
            System.out.println("Insufficient balance for withdrawal.");
        }
        else{
            System.out.println("Withdrawal amount must be positive");
        }
        }
        public void displayAccountDetails(){
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance:$"+ balance);
        }
        public String getAccountNumber(){
            return accountNumber;
        }
        public void setAccountNumber(String accountNumbe){ 
            this.accountNumber = accountNumber ;
        }
        public double getBalance(){
            return balance;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public static void main(String[] args)
        {
            BankAccount account =new BankAccount("1000500",1000.0);
            account.displayAccountDetails();
            account.deposite(600.0);
            account.withdraw(200.0);
            account.withdraw(2000.0);
            account.displayAccountDetails();
        }


  // prepare deposit logic in void deposit function
  // prepare withdraw logic in void witdraw function
  // prepare displayAccountDetails logic and ensure that it should contain current Balance and accountNumber in print statements
  // prepare getters and setters
   }
