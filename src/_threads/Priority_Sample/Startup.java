package Priority_Sample;

public final class Startup {
	
	private Startup(){}
	
	public static void main(String[] args) {
		new PriorityThread(Thread.MAX_PRIORITY);
		for (int i = 0; i < 5; i++) new PriorityThread(Thread.MIN_PRIORITY+i);
	}
}