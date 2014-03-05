package ch11.random;

import java.io.IOException;
import java.util.Scanner;

/**
 * This program demonstrates random access. You can access existing accounts and
 * deposit money, or create new accounts. The accounts are saved in a random
 * access file.
 */
public class BankSimulator {

  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    BankData data = new BankData();

    try {
      data.open("bank.dat");

      boolean done = false;

      while (!done) {
        System.out.print("Account number: ");
        int accountNumber = in.nextInt();

        if (accountNumber <= 0) {
//          deleteAccount();
        }
        else {

          System.out.print("Amount to deposit: ");
          double amount = in.nextDouble();

          int position = data.find(accountNumber);
          BankAccount account;

          if (position >= 0) {
            account = data.read(position);
            account.deposit(amount);
            System.out.println("New balance: " + account.getBalance());
            System.out.println("interest rate: " + account.getInterest());
            System.out.println("Owner: " + account.getOwner());
          }
          else // Add account
          {

            System.out.print("Interest rate: ");
            float interest = in.nextFloat();
            System.out.print("Owner: ");
            String owner = in.next();

            account = new BankAccount(accountNumber, amount, interest, owner);
            position = data.size();
            System.out.println("Adding new account.");
          }

          data.write(position, account);

          System.out.print("Done? (Y/N) ");
          String input = in.next();
          if (input.equalsIgnoreCase("Y")) done = true;
        }
      }
    } finally {
      data.close();
    }
  }
}
