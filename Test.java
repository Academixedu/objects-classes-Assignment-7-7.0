public class Test{

  public static void main(String[]args){
// prepare an object of Bank Account with no paramaters and initalize the values using getters and setters
    // call the functions and print the deposit withdrawl and account details
    BankAccount bankingDetails = new BankAccount();
    bankingDetails.setAccountNumber("TAREV");
    bankingDetails.setBalance(100000);
    System.out.println("Account Naumber: "+bankingDetails.getAccountNumber());
    System.out.println("Available Balance: "+bankingDetails.getBalance());
    bankingDetails.deposit(1000,bankingDetails.getBalance());
    bankingDetails.withdraw(5000,bankingDetails.getBalance());
    BankAccount bankingDetail=new BankAccount("TAREV",10000);
    bankingDetail.details();
    // prepare an object of Bank Account with paramaters
    // Call the Functions and print values

}

}
