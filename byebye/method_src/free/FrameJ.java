package free;

import java.awt.*;
import java.awt.event.*;

public class FrameJ {

	

	public static void main(String[] args) {

		Frame fr = new Frame("Hello COOKIE!");
		fr.setSize(500, 500);
		fr.setLocation(100,200);
		fr.setBackground(Color.yellow);
		fr.setVisible(true);

		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				System.exit(0);
			}
		});
	}
	
}
