package _threads.main.java.CriticalRegion_Solution_Try;

public final class A extends Thread{

	public static char[] store= new char[60]; 
	private String name;
	
	public A(String n){
		name=n;
		start();
	}
	
	public synchronized void set(){
			for (int i=0; i<name.length(); i++) store[i]=name.charAt(i);
			for(int i=name.length(); i<store.length; i++) store[i]=name.charAt(0);				
	}
	
	public synchronized void print(){
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
