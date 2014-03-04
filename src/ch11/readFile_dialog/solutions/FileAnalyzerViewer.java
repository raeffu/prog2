package ch11.readFile_dialog.solutions;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class FileAnalyzerViewer {

	/**
	 * @param args unused
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
	
		JFrame frame = new ResultFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
				
	}

}
