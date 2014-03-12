package ch11.exception.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileProg1 {
	public static void main(String[] args) {

		FileReader reader;
		int lineNumber = 0;
			try {
        reader = new FileReader("c:\\PROG2_FS11\\inhhh.txt");

        Scanner in = new Scanner(reader);
        
        try {
          while (in.hasNextLine()) {
            in.nextLine();

            lineNumber++;
          }
        }
        finally{
          reader.close();
        }
        
      }
      catch (FileNotFoundException e) {
        e.printStackTrace();
      }
      catch (IOException e) {
        e.printStackTrace();
      }


		System.out.println("Anzahl der Zeilen: " + lineNumber);
		System.out.println("Done!");

	}
}
