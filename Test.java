public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
  BankAccount aobj=new BankAccount();
  aobj.setAccountNumber("1234567899");
  aobj.setBalance(1000000000);
    // call the functions and print the deposit withdrawl and account details
    aobj.deposit(100000);
    aobj.withdraw(1000000);
    aobj.displayAccountDetails();
    // prepare an object of Bank Account with paramaters

    // Call the Functions and print values
    BankAccount aobj2=new BankAccount("1234567890", 1000000);
    System.out.println("Your Account No is = "+aobj2.getAccountNumber());
    System.out.println("Your Balance is = "+aobj2.getBalance());


}

}
