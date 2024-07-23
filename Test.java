public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values

}

}
public class Test {
        public static void main(String[] args) {
            BankAccount account1 = new BankAccount();
            account1.setAccountNumber("12345");
            account1.setBalance(1000.0);
            System.out.println("Depositing $500...");
            account1.deposit(500.0);
            System.out.println("Withdrawing $200...");
            account1.withdraw(200.0);
            System.out.println("Account Details:");
            account1.displayAccountDetails();
            BankAccount account2 = new BankAccount("67890", 500.0);
            System.out.println("Depositing $300...");
            account2.deposit(300.0);
            System.out.println("Withdrawing $100...");
            account2.withdraw(100.0);
            System.out.println("Account Details:");
            account2.displayAccountDetails();
        }
    }
    
