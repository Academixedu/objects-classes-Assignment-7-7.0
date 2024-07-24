public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values
    BankAccount ac1=new BankAccount("", 0);
      ac1.setAccountNumber("UB9703374");
      ac1.setBalance(200);
      ac1.deposite(3000);
      ac1.witdraw(300);
      System.out.println("\naccount1 details" );
      ac1.displayAccountDetails();

      BankAccount ac2=new BankAccount("icici23454", 05000);
      ac2.deposite(300);
      ac2.witdraw(200);
      
      System.out.println("\nac2 details");
      ac2.displayAccountDetails();
}

}
