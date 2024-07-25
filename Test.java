public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values
    BankAccount a1 = new BankAccount();
    System.out.println("Enter the BankAccount 1");
    a1.setAccountNumber("SBI57890732");
    a1.setBalance(100000);
    a1.deposit(500.0);
    a1.withdraw(200.0);
    a1.display();

    BankAccount a2=new BankAccount("UNB5632109",20000.0);
    System.out.println("Enter the BankAccount 2");
    a2.deposit(300.0);
    a2.withdraw(100.0);
    a2.display();

}
}
