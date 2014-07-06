package _threads.main.java.CriticalRegion_Solution2;

public final class StartIt {
	
	private StartIt(){}

	public static void main(String[] args) {
		new A("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		new A("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");		
		new A("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");			
		new A("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");	
	}
}
