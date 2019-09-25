import java.util.Scanner;

public class BankAccount {
    String name;
    String password;
    double balance;

    public static void main(String[] args) {

      /*BankAccount myAccount = new BankAccount();
      myAccount.password = "CSCI1933 rules!";
      myAccount.deposit("CSCI1933 rules!", 100.50);
      System.out.println("My account's balance is: " + myAccount.balance);

      BankAccount myOtherAccount = new BankAccount();
      myOtherAccount.balance = 10593.26;
      myOtherAccount.password = "VerySecure";
      myOtherAccount.withdraw("VerySecure", 2500.0);
      System.out.println("My account's balance is: " + myOtherAccount.balance);

    */BankAccount myNewAccount = new BankAccount("Java", "CSCI1933 rules!", 100.50);

    System.out.println("Type something like this!");
    Scanner myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();
    System.out.println("Your balance is: " + myNewAccount.getBalance(input));

    }
    public void withdraw(String enteredPassword, double amount) {

      if (password.equals(enteredPassword) && balance >= amount) {

        balance = balance - amount;
      }
    }

    public BankAccount(String initName, String initPass, double initBalance) {
      this.name = initName;
      this.password = initPass;
      this.balance = initBalance;


    }

    public void deposit(String enteredPassword, double amount) {

      if (password.equals(enteredPassword)) {
        balance = balance + amount;
      }
    }

    public double getBalance(String enteredPassword) {
      if (password.equals(enteredPassword)) {
        return balance;
      } else {
          return -1;
      }
      }

    public boolean setPassword(String oldPassword, String newPassword) {
      if (password.equals(oldPassword)) {
        password = newPassword;
        return true;
      } else {
          return false;
        }
      }

    public void setName(String newName) {
      this.name = newName;
      }
    public String getName() {
      return name;
    }








}//end BankAccount
