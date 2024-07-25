public class Test{

  public static void main(String[]args){
    BankAccount in=new BankAccount();
    in.setAccountNumber("12243243434");
    in.setBalance(40000);
    System.out.println("account datails"+in.getAccountNumber());
    System.out.println("deposit:"+in.getBalance());
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    in.deposit(30000);
    in.withdraw(2000);
    in.displayAccountdetails();
    // prepare an object of Bank Account with paramaters
    BankAccount w=new BankAccount("132342424",32000);
    // Call the Functions and print values
    w.deposit(5000);
    w.withdraw(2000);
    w.displayAccountdetails();

}

}
