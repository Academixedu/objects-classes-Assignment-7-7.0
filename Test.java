public class Test{

  public static void main(String[]args){
    BankAccount ba=new BankAccount();
    ba.setAccountNumber("123456");
    ba.setBalance(30000);
    System.out.println("Account number is"+ba.getAccountNumber());
    System.out.println("balance is"+ba.getBalance());
    ba.deposite(3000);
    ba.withdraw(10000);
    ba.displayAccountDetails();
    BankAccount a=new BankAccount("6753234", 400000);
    a.deposite(30000);
    a.withdraw(355779);
    a.displayAccountDetails();

}
}
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print vaBankAccount ba=new BankAccount();