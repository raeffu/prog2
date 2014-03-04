package ch11.readFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileStats {

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Filename:");
    
    Scanner in = new Scanner(System.in);
    String filename = in.nextLine();
    
    FileReader reader = new FileReader(filename);
    in = new Scanner(reader);
    
    int lineCounter = 0;
    int wordCounter = 0;
    int charCounter = 0;
    
    while(in.hasNextLine()){
      String line = in.nextLine();
      String[] words= line.split(" ");
      wordCounter = words.length;
      
      charCounter += line.length() + 1;
      
      lineCounter++;
    }
    
    System.out.println(lineCounter);
    System.out.println(wordCounter);
    System.out.println(charCounter);
  }

}
