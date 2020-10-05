
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*; 


public class RubberBanding extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}

	//This sets the start point when the mouse button is pressed
	public void mousePressed(MouseEvent m) {
		line = new GLine(m.getX(), m.getY(), m.getX(), m.getY());
		add(line);
	}

	//This sets the end point for the Line when mouse button is released
	public void mouseDragged(MouseEvent m) {
		line.setEndPoint(m.getX(), m.getY());
	}

	//Private Class for line 
	private GLine line;{
	}
}
