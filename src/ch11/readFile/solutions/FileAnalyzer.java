package ch11.readFile.solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   This class prints a report on the contents of a file.
*/
public class FileAnalyzer
{
   public static void main(String[] args) throws FileNotFoundException
   {  
      System.out.println("Filename: ");
      Scanner in = new Scanner(System.in);
      String name = in.nextLine();
      FileCounter counter = new FileCounter();
      File reader = new File(name);
      Scanner fileIn = new Scanner(reader);
      counter.read(fileIn);
      fileIn.close();
      System.out.println("Characters: " + counter.getCharacterCount());
      System.out.println("Words: " + counter.getWordCount());
      System.out.println("Lines: " + counter.getLineCount());
   }
}
