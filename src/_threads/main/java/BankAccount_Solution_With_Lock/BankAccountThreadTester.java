package _threads.main.java.BankAccount_Solution_With_Lock;

/**
 * This program runs four threads that deposit and withdraw money from the same
 * bank account.
 */
public final class BankAccountThreadTester {
	
	private BankAccountThreadTester(){}
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		final double AMOUNT = 100;
		final int REPETITIONS = 1000;

		DepositRunnable d1 = new DepositRunnable(account, AMOUNT, REPETITIONS);
		WithdrawRunnable w1 = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
		DepositRunnable d2 = new DepositRunnable(account, AMOUNT, REPETITIONS);
		WithdrawRunnable w2 = new WithdrawRunnable(account, AMOUNT, REPETITIONS);

		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(w1);
		Thread t3 = new Thread(d2);
		Thread t4 = new Thread(w2);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
