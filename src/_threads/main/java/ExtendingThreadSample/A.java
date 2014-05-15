package ExtendingThreadSample;

import java.util.Date;

public final class A extends Thread{
	
	private String name;
	
	public A(String name){this.name=name;}
	
	public void run(){
		while(true){
			System.out.println("Hello I'm "+name);
			System.out.println("Current time is: "+new Date());
			try{Thread.sleep(1000);}
			catch(Exception m){}
		}
	}
}
