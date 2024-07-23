public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
BankAccount obj=new BankAccount();
obj.setAccountNumber("123456789");
obj.setBalance(900000);
System.out.println("//////////////////////////////////////////////////");
obj.deposit(10000);
obj.witdraw(20000);
obj.AccountDetails();

System.out.println("/////////////////////////////////////////////////");
BankAccount obj2=new BankAccount("56485896",75900);
System.out.println("Your account number is:"+obj2.getAccountNumber());
System.out.println("Your account number is:"+obj2.getBalance());




    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values

}

}
