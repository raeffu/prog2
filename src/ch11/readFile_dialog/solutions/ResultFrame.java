package ch11.readFile_dialog.solutions;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.*;

import ch11.readFile.solutions.FileCounter;


public class ResultFrame extends JFrame {

	private static final int FRAME_WIDTH = 600, FRAME_HEIGHT = 200;
	private static final int FIELD_WIDTH = 10;

	private JLabel characterLabel;
	private JLabel wordLabel;
	private JLabel lineLabel;
	private JTextField characterField;
	private JTextField wordField;
	private JTextField lineField;

	private FileCounter counter = new FileCounter();

	public ResultFrame() throws FileNotFoundException {

		super("Grid Layout");
		
		
		setLayout(new BorderLayout(20, 10));
		// Use helper methods
		createFileDialog();

		createTextFields();
		createPanel();

		this.setTitle("FileAnalyzer");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}

	private void createTextFields() {
		characterLabel = new JLabel("Characters: ");
		characterField = new JTextField(FIELD_WIDTH);
		characterField.setText(counter.getCharacterCount() + "");

		wordLabel = new JLabel("Words: ");
		wordLabel.setSize(100, 20);
		wordField = new JTextField(FIELD_WIDTH);
		wordField.setText(counter.getWordCount() + "");
		
		lineLabel = new JLabel("Lines: ");
		lineField = new JTextField(FIELD_WIDTH);
		lineField.setText(counter.getLineCount() + "");
	}

	private void createPanel() {
		JPanel panel = new JPanel(new GridLayout(3, 1));

		JPanel panel1 = new JPanel();
		panel1.add(characterLabel);
		panel1.add(characterField);
		panel.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.add(wordLabel);
		panel2.add(wordField);
		panel.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.add(lineLabel);
		panel3.add(lineField);
		panel.add(panel3);

		add(panel);
	}

	private void createFileDialog() throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser();
		FileReader in = null;
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile();
			in = new FileReader(selectedFile);
			counter = new FileCounter();
			Scanner fileIn = new Scanner(in);
			counter.read(fileIn);
			fileIn.close();
		}
	}

}
