public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values
    BankAccount account = new BankAccount("123456789", 1000.0);

        account.displayAccountDetails();

        account.deposit(500.0); 
        account.withdraw(200.0);

        account.withdraw(1500.0);
}

}
