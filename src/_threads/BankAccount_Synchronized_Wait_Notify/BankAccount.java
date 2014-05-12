package BankAccount_Synchronized_Wait_Notify;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public final class BankAccount {
	
	private double balance;
	
	/**
	 * Constructs a bank account with a given balance 
	 * @param initialBalance
	 *            the initial balance
	 */
	public BankAccount(double initialBalance) {balance = initialBalance;}

	/**
	 * Deposits money into the bank account. 
	 * @param amount
	 *            the amount to deposit
	 */
	public synchronized void deposit(double amount) {
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName() + " Depositing "
				+ amount + ", new balance is " + balance);
		notifyAll();
	}

	/**
	 * Withdraws money from the bank account.
	 * @param amount
	 *            the amount to withdraw
	 */
	public synchronized void withdraw(double amount)
			throws InterruptedException {
		while(balance < amount) {
			System.out.println(Thread.currentThread().getName() + " Waiting...");
			wait();
		}
		balance = balance - amount;
		System.out.println(Thread.currentThread().getName() + " Withdrawing "
				+ amount + ", new balance is " + balance);
	}

	/**
	 * Gets the current balance of the bank account.
	 * @return the current balance
	 */
	public double getBalance() {return balance;}
}
