public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values

    BankAccount bank1 = new BankAccount(" ",0);
    bank1.setAccountNumber("BOI123456678");
    bank1.setBalance(50000);
    
    System.out.println("bank1:");
        bank1.deposit(500.0);
        bank1.withdraw(200.0);
        bank1.displayAccountDetails();
  
  BankAccount bank2 = new BankAccount("BOI12387678", 5000.0);
    System.out.println("bank2:");
    bank2.deposit(1000.0);
    bank2.withdraw(300.0);
    bank2.displayAccountDetails();
}
}