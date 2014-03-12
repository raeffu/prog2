package ch11.exception.listOfNumbers;

import java.io.*;
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
		PrintWriter out = null;

		try {
			out = new PrintWriter("OutFile.txt");
			try {
				for (int i = 0; i < victor.size(); i++)
					out.println("Value at: " + i + " = " + victor.elementAt(i));
			} finally {
				System.out.println("Closing PrintWriter");
				out.close();
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Caught ArrayIndexOutOfBoundsException: "
					+ e.getMessage());
		} catch (FileNotFoundException e) {
			System.err.println("Caught FileNotFoundException: "
					+ e.getMessage());
		} catch (SecurityException e) {
			System.err.println("Caught FileNotFoundException: "
					+ e.getMessage());
		}
	}
}
