package lab2;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelShip extends JPanel{
	public static ArmouredCar ferdinand;
	public static boolean initialization = false;
	
	@Override 
	public void paint(Graphics g) { 
		super.paint(g); 
		if(initialization) {
			ferdinand.DrawCar(g);
		}
	}
	
	
}
