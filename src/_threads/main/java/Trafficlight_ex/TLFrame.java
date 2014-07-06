package _threads.main.java.Trafficlight_ex;

import java.awt.*;
import java.awt.event.*;

public class TLFrame extends Frame {

	private static final long serialVersionUID = 1L;

public TLFrame(){

    super("Ampel-Demo");
    setLayout(new FlowLayout());
    setBackground(Color.lightGray);
    
    TrafficLight a1 = new TrafficLight(); 
    add(a1);  

    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent event){System.exit(0);}
      }
    );
   }
}