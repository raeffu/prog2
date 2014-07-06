package _threads.main.java.Trafficlight_solution_enum;

public final class Trigger extends Thread{

	TrafficLight trafficLight;
	
	Trigger(TrafficLight a){this.trafficLight=a;}
	
	public void run(){
		while(true){
			try{Thread.sleep(trafficLight.waitTime);}
		  catch(Exception m){}
		  trafficLight.changeState();
	  }
  }
}



		
	