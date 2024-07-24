public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values
    BankAccount obj1=new BankAccount();
    obj1.setAccountNumber("758437898");
    obj1.setBalance(2000);

    System.out.println("acc.no:" +obj1.getAccountNumber()+ " " + "balance:" +obj1.getBalance());
    obj1.deposit(4000);
    obj1.withdraw(2000);
    obj1.displayAccountDetails();
    // System.out.println("acc.no:" +obj1.getAccountNumber()+ " " + "balance:" +obj1.getBalance());

    BankAccount obj2=new BankAccount("8745873563", 5000);
    obj2.displayAccountDetails();
    obj2.deposit(10000);
    obj2.withdraw(5000);
    obj2.displayAccountDetails();


    


}

}
