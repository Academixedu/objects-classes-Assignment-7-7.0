public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    BankAccount b = new BankAccount();
    b.setAccountNumber("Goutham");
    b.setBalance(1000.0);
    System.out.println("the account number is "+b.getAccountNumber());
    System.out.println("the balance is "+b.getBalance());
    // call the functions and print the deposit withdrawl and account details
    b.deposit(100, b.getBalance());
    b.withdraw(200, b.getBalance());
    // prepare an object of Bank Account with paramaters
    BankAccount b1 = new BankAccount("goutham", 10000);
    // Call the Functions and print values
    b1.displayAccountDetails();

}
}
