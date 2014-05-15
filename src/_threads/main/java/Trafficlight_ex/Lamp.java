package Trafficlight_ex;

import java.awt.*;

public class Lamp extends Canvas{

private static final long serialVersionUID = 1L;

private Color backGround=Color.black;
  private Color onColor;
  private Color color=backGround; 
  
  private int h=50;
  private int w=50;
  
  private boolean isOn=false;
  
  Lamp(Color c){ // c is the "On-Color"
  	onColor=c;
  	setSize(h,w);
  }
  
  public void setOn(){
  	isOn=true;
  	color=onColor;
  	repaint();
	}
	
  public void setOff(){
  	isOn=false;
  	color=backGround;
  	repaint();
	}	

  public void  toggleColor(){
  	if(isOn) setOff();
    else setOn();
  }
  
  public void paint(Graphics g) {
    Dimension d = getSize();
    int h = d.height;
    int w = d.width;
    g.setColor(color);
    g.fillOval(0, 0, w-1, h-1);
  }     
}
