public class Test{
  public static void main(String[]args){
    BankAccount account1 = new BankAccount("",0);
    account1.setAccountNumber("SBIN3642123");
    account1.setBalance(2000);
    account1.deposit(400);
    account1.withdraw(200);
    System.out.println("\nDetails of Account Number1:");
    account1.displayAccountDetails();
    
    BankAccount account2 = new BankAccount("SBIN234568", 1000);
    System.out.println("-----------------");
    account2.deposit(100);
    account2.withdraw(200);
    System.out.println("\nDetails of Account Number2:");
    account2.displayAccountDetails();
  }
}
