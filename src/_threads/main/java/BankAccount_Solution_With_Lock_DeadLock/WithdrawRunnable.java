package _threads.main.java.BankAccount_Solution_With_Lock_DeadLock;

/**
 * A withdraw runnable makes periodic withdrawals from a bank account.
 */
public final class WithdrawRunnable implements Runnable {

	private static final int DELAY = 1;
	private BankAccount account;
	private double amount;
	private int count;
	
	/**
	 * Constructs a withdraw runnable. 
	 * @param anAccount
	 *            the account from which to withdraw money
	 * @param anAmount
	 *            the amount to deposit in each repetition
	 * @param aCount
	 *            the number of repetitions
	 */
	public WithdrawRunnable(BankAccount anAccount, double anAmount, int aCount) {
		account = anAccount;
		amount = anAmount;
		count = aCount;
	}

	public void run() {
		try{for(int i = 1; i <= count; i++) {
				account.withdraw(amount);
				Thread.sleep(DELAY);
			}
		}
		catch (InterruptedException exception) {}
	}
}
