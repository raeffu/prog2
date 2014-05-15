package CriticalRegion_Solution1;

public final class StartIt {
	
	private StartIt(){}

	public static void main(String[] args) {
		new A("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		new A("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");		
		new A("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");			
		new A("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");	
	}
}
