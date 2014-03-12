package ch11.exception.bank;

import java.util.*;

/**
   This bank contains a collection of bank accounts.
*/
public class Bank {   
  
  private ArrayList<BankAccount> accounts;
  
  /**
     Constructs a bank with no bank accounts.
  */
   public Bank() {
     accounts = new ArrayList<BankAccount>();
   }

  /**
     Adds an account to this bank.
     @param a the account to add
  */
   public void addAccount(BankAccount a) {
     accounts.add(a);
   }
   
  /**
     Gets the sum of the balances of all accounts in this bank.
     @return the sum of the balances
  */
  public double getTotalBalance() {
    double total = 0;
    for (BankAccount a : accounts) 
      total += a.getBalance();
    return total;
  }

  /**
     Counts the number of bank accounts whose balance is at
     least a given value.
     @param atLeast the balance required to count an account
     @return the number of accounts having least the given balance
  */
  public int count(double atLeast) {
    int matches = 0;
    for (BankAccount a : accounts)
      if (a.getBalance() >= atLeast) matches++; // Found a match
    return matches;
  }

  /**
     Finds a bank account with a given number.
     @param accountNumber the number to find
     @return the account with the given number, or null if there
     is no such account
  */
  public BankAccount find(int accountNumber) {
    for (BankAccount a : accounts)
      if (a.getAccountNumber() == accountNumber) // Found a match
	return a;
    return null; // No match in the entire array list
  }

 
  /**
     Gets a string representation of this object
     @return the string representation
  */
  public String toString() {
    StringBuilder list = new StringBuilder();
    for (BankAccount acc : accounts) 
      list.append("\n * " + acc);
    return getClass().getName() + list;
  }
}
