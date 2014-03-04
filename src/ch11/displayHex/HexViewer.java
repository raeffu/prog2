package ch11.displayHex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HexViewer {

  public static void main(String[] args) {
    try {
      FileInputStream inputStream =  new FileInputStream(args[0]);
      
      int next = 0;
      int counter = 0;
      
      while(next != -1){
        counter++;
        next = inputStream.read();
        System.out.printf("%02X ", next);
        if(counter == 10) {
          System.out.println("");
          counter = 0;
        }
      }
      
      inputStream.close();
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}