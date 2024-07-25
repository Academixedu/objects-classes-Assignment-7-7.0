public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
BankAccount obj=new BankAccount();
obj.setAccountNumber("207890");
obj.setBalance(50000);
System.out.println("Account number is"+obj.getAccountNumber());
System.out.println("balance is"+obj.getBalance());
    // call the functions and print the deposit withdrawl and account details
    obj.deposit(20000);
    obj.witdraw(10000);
    obj.displayAccountDetails();
    // prepare an object of Bank Account with paramaters
    BankAccount a=new BankAccount("9048597",20000);


    // Call the Functions and print values
    a.deposit(30000);
    a.witdraw(20000);
    a.displayAccountDetails();

}

}
