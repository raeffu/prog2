package CriticalRegion_Problem;

public final class StartIt {
	
	private StartIt(){}

	public static void main(String[] args) {
		
		new A("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		new A("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");		
		new A("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");			
		new A("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");	
	}
}
