package Trafficlight_solution;

class Tackt extends Thread{

	TrafficLight ample;
	
	Tackt(TrafficLight a){this.ample=a;}
	
	public void run(){
		while(true){
			try{Thread.sleep(ample.waitTime);}
		  catch(Exception m){}
		  ample.changeState();
	  }
  }
}



		
	