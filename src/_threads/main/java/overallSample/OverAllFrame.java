package overallSample;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public final class OverAllFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private final static int DISPLAY_DIMENSION=10;
	private final static int WIDTH=500;
	private final static int HEIGHT=600;
	private final static int HEIGHT_HISTORY_PANE=200;
	
	private static int THREAD_NUMBERING;
	
	private JPanel displayPanel = new JPanel();
	private JButton buNewTread = new JButton("New Thread");
	private JTextField tfCycle, tfSpeed, tfPriority;
	private Dimension dim = new Dimension(60,20);
	private JTextArea taHistory;
	private DisplayModel displayModel;

	public OverAllFrame(String t){
		super(t);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH,HEIGHT);
		this.setLayout(new BorderLayout());
		this.add(getStearingPanel(),BorderLayout.NORTH);
		this.add(getHistoryPane(),BorderLayout.SOUTH);
		this.add(displayPanel,BorderLayout.CENTER);
		displayModel = createDisplayModel(this);
		this.setVisible(true);
	}

	private JComponent getStearingPanel() {
		JPanel pan = new JPanel();
		pan.setLayout(new FlowLayout());
		buNewTread.addActionListener(new ActionListener(){
			int cycle = 10;
			int speed = 5;
			int priority=5;
			public void actionPerformed(ActionEvent e) {
				try{
					cycle = Integer.parseInt(tfCycle.getText().trim());
					speed = Integer.parseInt(tfSpeed.getText().trim());
					priority = Integer.parseInt(tfPriority.getText().trim());
				}
				catch(Exception ex){}
				priority=Math.abs(priority%Thread.MAX_PRIORITY);
				if(priority==0) priority=1;
				displayModel.setAndStartNewWorker(cycle, speed, Math.abs(priority%Thread.MAX_PRIORITY), ""+THREAD_NUMBERING++,taHistory);
			}
		});
		pan.add(buNewTread);
		JLabel laCycle= new JLabel("Cycles: ");
		pan.add(laCycle);
		tfCycle = new JTextField();
		tfCycle.setPreferredSize(dim);
		pan.add(tfCycle);
		JLabel laSpeed= new JLabel("Speed: ");
		pan.add(laSpeed);
		tfSpeed = new JTextField();
		tfSpeed.setPreferredSize(dim);
		pan.add(tfSpeed);
		JLabel laPriority= new JLabel("Priority: ");
		pan.add(laPriority);
		tfPriority = new JTextField();
		tfPriority.setPreferredSize(dim);
		pan.add(tfPriority);
		return pan;
	}

	private DisplayModel createDisplayModel(OverAllFrame overAllFrame) {
		DisplayModel dm = new DisplayModel(DISPLAY_DIMENSION, overAllFrame);
		return dm;
	}

	private JComponent getHistoryPane() {
		Dimension dim = new Dimension(WIDTH,HEIGHT_HISTORY_PANE);
		taHistory = new JTextArea();
		JScrollPane scp=new JScrollPane(taHistory); 
		scp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
		scp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		scp.setPreferredSize(dim);
		return scp;
	}

	public JComponent getDisplayPanel() {return displayPanel;}

}
