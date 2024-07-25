public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values
    BankAccount acc = new BankAccount("",0);
    System.out.println("\nDetails of my  Account Number1:");
    acc.displayAccountDetails();
    System.out.println("-----------------");
    acc.setAccountNumber("UB127893333");
    acc.setBalance(7000);
    acc.deposit(600);
    acc.withdraw(400);

    BankAccount acc1 = new BankAccount("UB127893655", 8000);
    System.out.println("\nDetails of my Account Number2:");
    acc1.displayAccountDetails();
    System.out.println("-----------------");
    acc1.deposit(900);
    acc1.withdraw(600);
  }
}