package BankAccount_Synchronized_Wait_Notify;

/**
 * A transfer thread repeatedly transfers money between three bank accounts.
 */
public final class TransferThread extends Thread {
	
	private BankAccount from1;
	private BankAccount from2;
	private BankAccount to;
	private double amount;

	private static final int REPETITIONS = 10;
	private static final int DELAY = 10;
	
	/**
	 * Constructs a transfer thread.
	 * @param account1
	 *            the first account from which to withdraw
	 * @param account2
	 *            the second account from which to withdraw
	 * @param account3
	 *            the account to which to deposit
	 * @param anAmount
	 *            the amount to withdraw from each of the first two accounts.
	 */
	public TransferThread(BankAccount account1, BankAccount account2,
			BankAccount account3, double anAmount) {
		from1 = account1;
		from2 = account2;
		to = account3;
		amount = anAmount;
	}

	public void run() {
		try{for (int i = 1; i <= REPETITIONS && !isInterrupted(); i++) {
				from1.withdraw(amount);
				from2.withdraw(amount);
				to.deposit(2 * amount);
				sleep(DELAY);
			}
		}
		catch(InterruptedException exception) {}
	}
}
