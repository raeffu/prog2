package Trafficlight_ex;

import java.awt.*;

public class TrafficLight extends Panel{
	

	private static final long serialVersionUID = 1L;
	Color backGround=Color.yellow;
  	Tackt tackt;
  	
  	Lamp green = new Lamp(Color.green);
  	Lamp orange = new Lamp(Color.orange);
  	Lamp red = new Lamp(Color.red);
  	
  	int deltaRed=2000;  	//for state 2
  	int deltaGreen=3000;	//for state 3
  	int deltaOrange=1000;	//for state 0 and 1
  	
  	int waitTime=deltaOrange;
  		 	
  	int state=0;
  	//0: Orange-->Green
  	//1: Orange-->Red
  	//2: Red-->Orange
  	//3: Green-->Orange
  	
  	TrafficLight(){
     setLayout(new BorderLayout());
     add(green, BorderLayout.NORTH);
     add(red, BorderLayout.SOUTH);
     add(orange, BorderLayout.CENTER);
	 setBackground(Color.lightGray);
  	 tackt = new Tackt(this);  
  	 tackt.start();	   
	 }
	    
	      	
  	public void changeState(){
  		if(state==0){ // Orange
  			state=3;
  			waitTime=deltaOrange;
  			green.setOff();
  			orange.setOn();
  			red.setOff();
  			
  	  }
  		else if(state==1){ // Orange
  			state=2;
  			waitTime=deltaOrange; 
  			green.setOff();
  			orange.setOn();
  			red.setOff();  			 			
  		}
  		else if(state==2){ // Red  			
  			state=0;
  			waitTime=deltaRed;  
  			green.setOff();
  			orange.setOff();
  			red.setOn();  						
  	  }
  		else if(state==3){ // Green  	
  			state=1;
  			waitTime=deltaGreen;  
  			green.setOn();
  			orange.setOff();
  			red.setOff();   						
  	  }
    }
}
     
	    

  	

  