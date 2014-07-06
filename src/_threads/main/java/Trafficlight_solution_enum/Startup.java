package _threads.main.java.Trafficlight_solution_enum;

public final class Startup {

	private Startup() {}

	public static void main(String[] l) {
		TLFrame frm = new TLFrame();
		frm.setLocation(100, 100);
		frm.setSize(400, 400);
		frm.pack();
		frm.setVisible(true);
	}
}