package overallSample;

import java.awt.Color;
import java.util.Random;

public final class Tools {
	
	private static final Random rand=new Random();
	
	private Tools(){}
	
	public static Color genColor(){
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		return new Color(r, g, b);
	}
	
	public static int genRandomNumber(int to){return Math.abs(rand.nextInt()%to);}

}
