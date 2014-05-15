package CriticalRegion_Solution2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class A extends Thread{
	
	// BE CARFULL: MUST BE STATIC (1 common object)
	private static Lock lock = new ReentrantLock();
	public static char[] store= new char[60]; 
	private String name;
	
	public A(String n){
		name=n;
		start();
	}
	
	public void set(){
			for (int i=0; i<name.length(); i++) store[i]=name.charAt(i);
			for(int i=name.length(); i<store.length; i++) store[i]=name.charAt(0);				
	}
	
	public void print(){
			for(int i=0; i<store.length; i++) System.out.print(store[i]);
			System.out.println();
	}
	
	public void run(){
		while(true){
			lock.lock();
			try{set();
				print();
			}
			catch(Exception e){e.printStackTrace();}
			finally{lock.unlock();}
			try{Thread.sleep(100);}
			catch(Exception m){}
		}
	}
}
