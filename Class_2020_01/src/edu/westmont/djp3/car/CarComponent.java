package edu.westmont.djp3.car;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws two car shapes.
 */
public class CarComponent extends JComponent {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Car car1 = new Car(0, 0);

		int x = getWidth() - 60;
		int y = getHeight() - 30;

		Car car2 = new Car(x, y);

		car1.draw(g2);
		car2.draw(g2);
		/*
		 * Car car3 = new Car(x/2, y/2); car3.draw(g2);
		 */

		/*
		 * for(int mx = 0; mx < x; mx +=15) { for(int my= 0; my < x; my +=15) { Car carx
		 * = new Car(mx, my); carx.draw(g2); }}
		 */
	}
}
