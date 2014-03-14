package ch11.exception.listOfNumbers;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class ListOfNumbers {
  private Vector<Integer> victor;
  private static final int SIZE = 10;

  public ListOfNumbers() {
    victor = new Vector<Integer>(SIZE);
    for (int i = 0; i < SIZE; i++)
      victor.addElement(new Integer(i));
  }

  public void writeList() {

    try (PrintWriter out = new PrintWriter("OutFile.txt")) {
      for (int i = 0; i < victor.size(); i++)
        out.println("Value at: " + i + " = " + victor.elementAt(i));

      System.out.println("Closing PrintWriter");

    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Caught ArrayIndexOutOfBoundsException: "
          + e.getMessage());
    }
    catch (FileNotFoundException e) {
      System.err.println("Caught FileNotFoundException: " + e.getMessage());
    }
  }
  
  public void readList(){
    FileReader reader;
    try {
      reader = new FileReader("InFile.txt");
      Scanner s = new Scanner(reader);
      
      while (s.hasNextInt()) {
        int i = s.nextInt();
        System.out.println(i);
      }
    }
    catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
}
