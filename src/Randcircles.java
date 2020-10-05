import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class Randcircles extends GraphicsProgram {
	private static final int TOTAL_CIRCLES = 10;
	RandomGenerator RCircles = new RandomGenerator();
	
	public void run() {
		for (int i = 0; i < TOTAL_CIRCLES; i++) { //loop that takes the TOTAL_CIRCLES and does this the defined amount of times
			Color prism = RCircles.nextColor();
			double z = RCircles.nextDouble(5, 50);
			double x = RCircles.nextDouble(0, getWidth() - z);
			double y = RCircles.nextDouble(0, getHeight() - z);
			GOval orbs = new GOval(x, y, z, z);
			orbs.setFilled(true);
			orbs.setColor(prism);
			add(orbs);
		}
	}
}

