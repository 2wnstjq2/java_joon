package wonder;

import java.awt.*;
import java.awt.event.*;

//왜 2개가 안나오고 하나만 나올까
public class Fra {

	Panel p1;

	public Fra(String name) {
		p1 = new Panel();
		p1.setName(name);
		p1.setBackground(Color.blue);
	}

	public Panel getPanel1() {
		return p1;
	}

	public static void main(String[] args) {
		Fra ex1 = new Fra("Panel");
		Frame f = new Frame("패널보여주기");
		f.add(ex1.getPanel1());
		f.setSize(200, 200);
		f.setVisible(true);

		// 종료가능하기하기--
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				System.exit(0);
			}
		});
	}

}
