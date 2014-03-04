package ch11.textprocessing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TextProcessor1 {

	/**
	 * @param args unused
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		FileReader reader = new FileReader("worldarea.txt");
		Scanner in = new Scanner(reader);

		while (in.hasNext()) {
			String line = in.nextLine();

			int i = 0;
			while (!Character.isDigit(line.charAt(i))) {
				i++;
			}

			String countryName = line.substring(0, i).trim();
			String areaString = line.substring(i);
			Integer area = Integer.parseInt(areaString);

			System.out.println("Country: <" + countryName + "> Area: " + area);
		}
	}
}
