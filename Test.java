public class Test{

  public static void main(String[]args){
    // prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values
  
  BankAccount a1 = new BankAccount();
  a1.setAccountNumber("03761001300585");
  a1.setBalance(1000);
  a1.deposit(500);
  a1.withdraw(200);

  System.out.println("\n");

  BankAccount a2 = new BankAccount("02778710998458", 2000);
  a2.deposit(300);
  a2.withdraw(100);
  a2.displayAccountDetails();

}
}