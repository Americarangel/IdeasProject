import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DiamondButton extends JButton implements ActionListener {
	
	private Color c = Color.BLUE;
	
	public DiamondButton(Color c) {
		this.c = c;
		this.addActionListener(this);
	}
	
	/*  
	 * The method paintComponent(Graphics g) is called when
	 * java needs to draw the component.  You override it to change the 
	 * appearance of a component.
	 */
	@Override
	public void paintComponent(Graphics g) {
	    // Draw a regular button
		
		super.paintComponent(g);

		// add to it
		
		int[] xPoints = new int[4];
		int[] yPoints = new int[4];
		
		xPoints[0] = 50;
		yPoints[0] = 60;
		xPoints[1] = 75;
		yPoints[1] = 10;
		xPoints[2] = 100;
		yPoints[2] = 60;
		xPoints[3] = 75;
		yPoints[3] = 110;
		g.setColor(c);
		g.drawPolyline(xPoints, yPoints, xPoints.length); // instead of a filled diamond
	}

	public void beenHere() {
		c = Color.gray;
		ImageIcon x = new ImageIcon("X.gif");
		// setIcon adds an image to a button
		this.setIcon(x);
		this.setEnabled(false);		
	}
	
	public void actionPerformed(ActionEvent e) {
		beenHere();
	}
	
}
