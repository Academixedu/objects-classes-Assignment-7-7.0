public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values
    BankAccount ba = new BankAccount();
    ba.setAccountNumber("UNION BANK");
    ba.setBalance(1000);
    ba.deposit(500);
    ba.withdraw(2000);
    ba.details();

    System.out.println("");
    System.out.println("object of Bank Account with paramaters");
    System.out.println("--------------------------------------");
    BankAccount ba2 = new BankAccount("SBI", 500);
    ba2.deposit(200);
    ba2.withdraw(500);
    ba2.details();

}

}
