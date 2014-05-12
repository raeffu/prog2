package Chronometer_ex;

public final class StartUp {

	private StartUp() {}

	public static void main(String[] l) {
		DisplayFrame frm = new DisplayFrame();
		frm.setLocation(100, 100);
		frm.setSize(400, 400);
		frm.pack();
		frm.setVisible(true);
	}
}
