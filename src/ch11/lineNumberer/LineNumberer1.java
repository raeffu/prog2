package ch11.lineNumberer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LineNumberer1
{
   public static void main(String[] args) 
     throws FileNotFoundException 
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();

      FileReader reader = new FileReader(inputFileName);
      
      Scanner in = new Scanner(reader);

      int lineNumber = 0;
      
      while (in.hasNextLine())
      {
         //String line = 
        	 in.nextLine();

         lineNumber++;
      }
   
      System.out.println("Anzahl der Zeilen: "+lineNumber );
      System.out.println("Done!");

   }
}
