package CriticalRegion_Problem;

public final class A extends Thread{

	public static char[] store= new char[50]; 
	private String name;
	
	public A(String n){
		name=n;
		start();
	}
	
	public void set(){
		for(int i=0; i<name.length(); i++) store[i]=name.charAt(i);
		for(int i=name.length(); i<store.length; i++) store[i]=name.charAt(0);		
	}
	
	public void print(){
		for(int i=0; i<store.length; i++) System.out.print(store[i]);
		System.out.println();
	}
	
	public void run(){
		while(true){
			set();
			print();
			try{Thread.sleep(100);}
			catch(Exception m){}
		}
	}
}
