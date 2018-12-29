package lab1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelShip extends JPanel {
	public static Ferdinand ferdinand;
	public static boolean initialization = false;
	
	@Override 
	public void paint(Graphics g) { 
		super.paint(g); 
		if(initialization) {
			ferdinand.DrawFerdinand(g);
		}
	}


}
