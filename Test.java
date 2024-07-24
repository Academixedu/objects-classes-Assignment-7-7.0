

public class Test{

  public static void main(String[]args){
    
    // prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    BankAccount m1=new BankAccount();
    m1.setAccountNumber("267238479");
    m1.setBalance(12000);
    System.out.println("account number is : " +m1.getAccountNumber());
    System.out.println(" balance is : " +m1.getBalance());
    
    // call the functions and print the deposit withdrawl and account details
    m1.deposit(3000);
    m1.withdrawl(1000);
    m1.displayAccountDetails();


    // prepare an object of Bank Account with paramaters
    BankAccount m2=new BankAccount("4567543",75000);
    // Call the Functions and print values
    m2.deposit(2000);
    m2.withdrawl(1500);
    m2.displayAccountDetails();

}  

}
