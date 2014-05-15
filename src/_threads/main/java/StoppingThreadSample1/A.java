package StoppingThreadSample1;

import java.util.Date;

public final class A extends Thread{
	
	private String name;
	private boolean stopTheThread=false;
	
	public A(String name){
		this.name=name;
		start();
	}
	
	public void run(){
		while(!stopTheThread){
			System.out.println("Hello I'm "+name);
			System.out.println("Current time is: "+new Date());
		    if (Thread.interrupted()) {
		        // We've been interrupted: no more working.
		    	System.out.println("Interruption ...");
				stopTheThread=true;
		    }
		}
	}
}
