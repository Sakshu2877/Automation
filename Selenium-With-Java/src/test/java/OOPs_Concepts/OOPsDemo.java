package OOPs_Concepts;

//ABSTRACTION
abstract class BankAccount {

 // ENCAPSULATION
 private String accountHolder;
 private double balance;

 // Constructor
 BankAccount(String accountHolder, double balance) {
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Getter
 public String getAccountHolder() {
     return accountHolder;
 }

 public double getBalance() {
     return balance;
 }

 // Protected method to update balance
 protected void setBalance(double balance) {
     this.balance = balance;
 }

 // Abstract method
 abstract void calculateInterest();

 void displayAccountDetails() {
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: " + balance);
 }
}


//INHERITANCE
class SavingsAccount extends BankAccount {

 SavingsAccount(String accountHolder, double balance) {
     super(accountHolder, balance);
 }

 // POLYMORPHISM - METHOD OVERRIDING
 @Override
 void calculateInterest() {

     double interest = getBalance() * 0.05;

     System.out.println("Savings Account Interest: " + interest);
 }
}


//Another child class
class CurrentAccount extends BankAccount {

 CurrentAccount(String accountHolder, double balance) {
     super(accountHolder, balance);
 }

 // POLYMORPHISM - METHOD OVERRIDING
 @Override
 void calculateInterest() {

     double interest = getBalance() * 0.02;

     System.out.println("Current Account Interest: " + interest);
 }
}


public class OOPsDemo {

 public static void main(String[] args) {

     // POLYMORPHISM
     BankAccount account1 = new SavingsAccount("Sakshi", 10000);
     BankAccount account2 = new CurrentAccount("Shubhangi", 20000);

     System.out.println("Savings Account");

     account1.displayAccountDetails();
     account1.calculateInterest();

     System.out.println();

     System.out.println("Current Account");

     account2.displayAccountDetails();
     account2.calculateInterest();
 }
}
