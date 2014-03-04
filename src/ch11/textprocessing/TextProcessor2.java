package ch11.textprocessing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TextProcessor2 {

	
	private static String REGEX = "\t";	
	/**
	 * @param args unused
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		FileReader reader = new FileReader("worldarea.txt");
		Scanner in = new Scanner(reader);

		
		while (in.hasNext()) {
			String line = in.nextLine();

			Pattern p = Pattern.compile(REGEX);
		    String[] items = p.split(line);
	    	String countryName = new String("");
	    	String areaString = new String("0");

		    if (items.length >= 1) {
		    	countryName = items[0].trim();
		    }	
		    if (items.length >= 2) {
		    	areaString = items[1];
		    }	
			Integer area = Integer.parseInt(areaString);

			System.out.println("Country: <" + countryName + "> Area: " + area);
		}
	}
}
