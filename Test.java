public class Test{
  public class Test
  {
  
    public static void main(String[]args){
  // prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
        BankAccount obj1=new BankAccount();
        obj1.setAccountNumber("50210100004796");
        obj1.setBalance(80000);
  
      // call the functions and print the deposit withdrawl and account details
  
      obj1.deposit(20000);
      obj1.withdraw(50000);
      obj1.displayAccountDetails();
  
      // prepare an object of Bank Account with paramaters
      // Call the Functions and print values
      BankAccount obj2=new BankAccount("123456", 40000);
      System.out.println("your account number: "+obj2.getAccountNumber());
      System.out.println("Your account balance is: "+obj2.getBalance());
  
  
  }
  
  }
