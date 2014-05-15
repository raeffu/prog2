package BankAccount_Synchronized_Wait_Notify;

/**
 * This program uses three threads that transfer money between three accounts.
 * It can occasionally deadlock.
 */
public final class BankAccountThreadTest {
	
	private BankAccountThreadTest(){}
	
	public static void main(String[] args) {
		BankAccount account0 = new BankAccount(1000);
		BankAccount account1 = new BankAccount(1000);
		BankAccount account2 = new BankAccount(1000);

		TransferThread t0 = new TransferThread(account1, account2, account0,500);
		TransferThread t1 = new TransferThread(account2, account0, account1,500);
		TransferThread t2 = new TransferThread(account1, account0, account2,500);

		t0.start();
		t1.start();
		t2.start();
	}
}
